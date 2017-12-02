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
import modeloBeans.modeloPagamento;

/**
 *
 * @author Administrador
 */
public class pagamentoDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloPagamento modPagamento = new modeloPagamento();

    public void Salvar(modeloPagamento modPagamento) {
        
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("INSERT INTO produto(valor, data_pagamento, data_vencimento) VALUES (?, ?, ?)");
            pst.setDouble(1, Double.parseDouble((modPagamento.getValor())));
            pst.setDate(2, Date.valueOf(modPagamento.getData_pagamento()));
            pst.setDate(3, Date.valueOf(modPagamento.getData_vencimento()));
            pst.setInt(4, modPagamento.getCod_venda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!/n ERROR: " +ex);
        }
        connex.desconecta();
    }

    
    public modeloPagamento buscaPagamento (modeloPagamento moPagamento) throws ClassNotFoundException, SQLException {
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM produto WHERE descricao LIKE '%'"+modPagamento.getPesquisa());
        try{
            connex.rs.first();
            modPagamento.setValor(connex.rs.getString("valor"));
            modPagamento.setData_pagamento(connex.rs.getString("data_pagamento"));
            modPagamento.setData_vencimento(connex.rs.getString("data_vencimento"));
            modPagamento.setCod_venda(connex.rs.getInt("cod_venda"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado");
        }
        connex.desconecta();
        return moPagamento;
    }
}