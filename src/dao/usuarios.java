/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.modeloUsuarios;
import persistencia.ConexaoSQL;

/**
 *
 * @author joaov
 */
public class usuarios {
    ConexaoSQL connex = new ConexaoSQL();
    modeloUsuarios moduUsuarios = new modeloUsuarios();
    

    public void Salvar (modeloUsuarios modUsuarios) {
        
        
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO usuarios(usu_nome, usu_senha) VALUES (?, ?)");
            pst.setString(1, modUsuarios.getUsu_nome());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modUsuarios.getUsu_senha()); //exemplo de data
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:" +ex);
           
        }
            connex.desconecta();
    }
    
    public void editarUsuario (modeloUsuarios modUsuarios){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update usuarios set usu_nome=?, usu_senha=? where usu_cod =?");
            pst.setString(1, modUsuarios.getUsu_nome());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modUsuarios.getUsu_senha()); //exemplo de hora 
            pst.setInt(3, modUsuarios.getUsu_cod()); //exemplo de hora 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    public void excluirCliente (modeloUsuarios modUsuarios) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from usuarios where usu_cod =?");
            pst.setInt(1, modUsuarios.getUsu_cod());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }
 public modeloUsuarios buscaUsuarios (modeloUsuarios modUsuarios){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM usuarios WHERE usu_nome LIKE '%"+modUsuarios.getPesquisa()+"%'");
        try{
            connex.rs.first();
            modUsuarios.setUsu_nome(connex.rs.getString("usu_nome"));
            modUsuarios.setUsu_senha(connex.rs.getString("usu_senha"));
            modUsuarios.setUsu_cod(connex.rs.getInt("usu_cod"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado" + ex);
        }
        connex.desconecta();
        return modUsuarios;
    }
}
