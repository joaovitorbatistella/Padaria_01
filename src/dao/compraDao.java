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
import modeloBeans.modeloCompra;
import persistencia.ConexaoSQL;

/**
 *
 * @author Administrador
 */
public class compraDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloCompra modCompra = new modeloCompra();

    public void Salvar(modeloCompra modCompra) {
        
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("INSERT INTO compra(data, valor_total, numero) VALUES (?, ?, ?)");
            pst.setDate(1, Date.valueOf(modCompra.getData()));
            pst.setFloat(2, modCompra.getValor_total());
            pst.setInt(3, modCompra.getNumero());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!/n ERROR: " +ex);
        }
        connex.desconecta();
    }

    
    public modeloCompra buscaCompra (modeloCompra modCompra){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM compra WHERE numero = '"+modCompra.getPesquisa()+"'");
        try{
            connex.rs.first();
            modCompra.setData(connex.rs.getString("data"));
            modCompra.setValor_total(connex.rs.getFloat("valor_total"));
            modCompra.setNumero(connex.rs.getInt("numero"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado");
        }
        connex.desconecta();
        return modCompra;
    }
}