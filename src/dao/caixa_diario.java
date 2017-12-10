/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.modeloCaixa_diario;
import persistencia.ConexaoSQL;

/**
 *
 * @author joaov
 */
public class caixa_diario {
    ConexaoSQL connex = new ConexaoSQL();
    modeloCaixa_diario modCaixadiCaixa_diario = new modeloCaixa_diario();
    

    
    
    public void Salvar (modeloCaixa_diario modCaixa_diario) {
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO caixa_diario(data_caixa, valor) VALUES (?, ?)");
            pst.setDate(1, Date.valueOf(modCaixa_diario.getData_caixa()));// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setFloat(2, modCaixa_diario.getValor()); //exemplo de hora
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:"+ex);
           
        }
            connex.desconecta();
    }
    public void editarCliente (modeloCaixa_diario modCaixa_diario){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update caixa_diario set data_caixa=?, valor=? where data_caixa =?");
            pst.setDate(1, Date.valueOf(modCaixa_diario.getData_caixa()));// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setFloat(2, modCaixa_diario.getValor());
            pst.setDate(3, Date.valueOf(modCaixa_diario.getData_caixa()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    
    public void excluirCaixa (modeloCaixa_diario modCaixa_diario) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from caixa_diario where data_caixa =?");
            pst.setDate(1, Date.valueOf(modCaixa_diario.getData_caixa()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }
 public modeloCaixa_diario buscaCaixa_diario (modeloCaixa_diario modCaixa_diario){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM caixa_diario WHERE data_caixa = '"+modCaixa_diario.getPesquisa()+"'");
        try{
            connex.rs.first();
            modCaixa_diario.setData_caixa(connex.rs.getString("data_caixa"));
            modCaixa_diario.setValor(Float.parseFloat(connex.rs.getString("valor")));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Caixa diário vazio " +ex);
        }
        connex.desconecta();
        return modCaixadiCaixa_diario;
    }

}
