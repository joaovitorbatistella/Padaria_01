/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import persistencia.ConexaoSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.modeloVenda;
import modeloBeans.modeloCliente;

/**
 *
 * @author Administrador
 */
public class vendaDao {
    ConexaoSQL connex = new ConexaoSQL();
    modeloVenda modVenda = new modeloVenda();
    modeloCliente modCliente = new modeloCliente();

    public void Salvar(modeloVenda modVenda) {
        
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("INSERT INTO venda(data, valor_total, cod_cliente) VALUES (?, ?, ?)");
            pst.setDate(1, Date.valueOf(modVenda.getData()));
            pst.setFloat(2, Float.parseFloat((modVenda.getValor_total())));
            pst.setInt(3, modVenda.getCod_cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!/n ERROR: " +ex);
        }
        connex.desconecta();
    }
    
     public void excluirVenda (modeloVenda modVenda) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from venda where numero =?");
            pst.setInt(1, modVenda.getNumero());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }

    public void editarVenda (modeloVenda modVenda){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update venda set data=?, valor_total=?, cod_cliente=? where numero=?");
            pst.setDate(1, Date.valueOf(modVenda.getData()));
            pst.setFloat(2, Float.parseFloat((modVenda.getValor_total())));
            pst.setInt(3, modVenda.getCod_cliente());
            pst.setInt(4, modVenda.getNumero());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    public modeloVenda buscaVenda (modeloVenda modVenda) throws ClassNotFoundException, SQLException {
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM venda WHERE cod_cliente LIKE '%'"+modVenda.getPesquisa());
        try{
            connex.rs.first();
            modVenda.setData(connex.rs.getString("data"));
            modVenda.setValor_total(connex.rs.getString("valor_total"));
            modVenda.setCod_cliente(connex.rs.getInt("cod_cliente"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado");
        }
        connex.desconecta();
        return modVenda;
    }
}