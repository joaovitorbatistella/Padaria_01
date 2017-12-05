/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.javafx.scene.control.skin.FXVK;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            pst.setLong(4, modPadaria.getTelefone()); //Exemplo de String
            pst.setLong(5, modPadaria.getCnpj());
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:"+ex);
           
        }
            connex.desconecta();
    }
 public modelopadaria buscaPadaria (modelopadaria modpadaria){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM padaria WHERE cnpj LIKE '%"+modpadaria.getPesquisa()+"%'");
        try{
            connex.rs.first();
            modpadaria.setEmail(connex.rs.getString("email"));
            modpadaria.setEndereco(connex.rs.getString("endereco"));
            modpadaria.setTelefone(Long.parseLong(connex.rs.getString("telefone")));
            modpadaria.setCnpj(Long.parseLong(connex.rs.getString("cnpj")));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
        connex.desconecta();
        return modpadaria;
    }

    public modelopadaria buscaCliente(modelopadaria modPadaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
