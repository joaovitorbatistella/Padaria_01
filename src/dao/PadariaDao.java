/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.modelopadaria;
import persistencia.ConexaoSQL;

/**
 *
 * @author joaov
 */
public class PadariaDao {
        
    ConexaoSQL connex = new ConexaoSQL();
    modelopadaria modPadaria = new modelopadaria();
    

    public void Salvar (modelopadaria modPadaria) {
        
        
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO padaria(email, endereco, telefone, cnpj) VALUES (?, ?, ?, ?)");
            pst.setString(1, modPadaria.getEmail());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modPadaria.getEndereco()); //exemplo de data
            pst.setLong(3, modPadaria.getTelefone()); //Exemplo de String
            pst.setLong(4, modPadaria.getCnpj());
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:"+ex);
           
        }
            connex.desconecta();
    }
    public void  excluirCliente (modelopadaria modPadaria){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from padaria where codigo = ?");
            pst.setInt(1, modPadaria.getCodigo());
            pst.execute();
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados " +ex);
        }
        
        connex.desconecta();
    }
    public void editarPadaria (modelopadaria modPadaria){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update padaria set email=?, endereco=?, telefone=?, cnpj=? where codigo =?");
            pst.setString(1, modPadaria.getEmail());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modPadaria.getEndereco());
            pst.setLong(3, modPadaria.getTelefone());
            pst.setLong(4, modPadaria.getCnpj());
            pst.setInt(5, modPadaria.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
 public modelopadaria buscaPadaria (modelopadaria modPadaria){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM padaria WHERE cnpj = '"+modPadaria.getPesquisa()+"'");
        try{
            connex.rs.first();
            modPadaria.setEmail(connex.rs.getString("email"));
            modPadaria.setEndereco(connex.rs.getString("endereco"));
            modPadaria.setTelefone(Long.parseLong(connex.rs.getString("telefone")));
            modPadaria.setCnpj(Long.parseLong(connex.rs.getString("cnpj")));
            modPadaria.setCodigo(connex.rs.getInt("codigo"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Padaria não cadastrada" +ex);
        }
        connex.desconecta();
        return modPadaria;
           
    }
}
