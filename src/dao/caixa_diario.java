/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO caixa_diario(data, valor) VALUES (?, ?)");
            pst.setDate(1, Date.valueOf(modCaixadiCaixa_diario.getData()));// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setFloat(2, modCaixadiCaixa_diario.getValor()); //exemplo de hora
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:"+ex);
           
        }
            connex.desconecta();
    }
 public modeloCaixa_diario buscaCaixa_diario (modeloCaixa_diario modCaixa_diario){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM caixa_diario WHERE data = '"+modCaixa_diario.getPesquisa()+"'");
        try{
            connex.rs.first();
            modCaixadiCaixa_diario.setData(connex.rs.getString("data"));
            modCaixadiCaixa_diario.setValor(Float.parseFloat(connex.rs.getString("valor")));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado" + ex);
        }
        connex.desconecta();
        return modCaixadiCaixa_diario;
    }

}
