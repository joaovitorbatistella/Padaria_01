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
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado" + ex);
        }
        connex.desconecta();
        return modUsuarios;
    }
}
