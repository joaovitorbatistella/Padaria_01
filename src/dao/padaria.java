/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.modelopadaria;
import persistencia.ConexaoSQL;

/**
 *
 * @author joaov
 */
public class padaria {
    ConexaoSQL connex = new ConexaoSQL();
    modelopadaria modPadaria= new modelopadaria();
    

    public void Salvar (modelopadaria modPadaria) {
        
        
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO padaria(email, endereco, telefone, cnpj) VALUES (?, ?, ?, ?)");
            pst.setString(1, (modPadaria.getEmail()));// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modPadaria.getEndereco()); //exemplo de hora
            pst.setLong(3, modPadaria.getTelefone()); //exemplo de hora
            pst.setLong(4, modPadaria.getCnpj()); //exemplo de hora
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:"+ex);
           
        }
            connex.desconecta();
    }
 public modelopadaria buscaPadaria (modelopadaria modPadaria){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM padaria WHERE cnpj LIKE '%"+modPadaria.getPesquisa()+"%'");
        try{
            connex.rs.first();
            modPadaria.setEmail(connex.rs.getString("email"));
            modPadaria.setEndereco(connex.rs.getString("endereco"));
            modPadaria.setTelefone(connex.rs.getLong("telefone"));
            modPadaria.setCnpj(connex.rs.getLong("cnpj"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado" + ex);
        }
        connex.desconecta();
        return modPadaria;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
