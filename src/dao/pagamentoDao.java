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
import modeloBeans.modeloVenda;

/**
 *
 * @author Administrador
 */
public class pagamentoDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloPagamento modPagamento = new modeloPagamento();
    modeloVenda modVenda = new modeloVenda();
    
    public void Salvar(modeloPagamento modPagamento) {
        
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("INSERT INTO pagamento(valor, data_pagamento, data_vencimento, cod_venda) VALUES (?, ?, ?, ?)");
            pst.setFloat(1, modPagamento.getValor());
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

    public void editarPagamento (modeloPagamento modPagamento){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update pagamento set valor=?, data_pagamento=?, data_vencimento=?, cod_venda=? where cod_pagamento =?");
            pst.setFloat(1, modPagamento.getValor());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setDate(2, Date.valueOf(modPagamento.getData_pagamento())); //exemplo de hora
            pst.setDate(3, Date.valueOf(modPagamento.getData_vencimento())); //exemplo de data
            pst.setInt(4, modPagamento.getCod_venda()); //Exemplo de String            
            pst.setInt(5, modPagamento.getCod_pagamento()); //Exemplo de String            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    public void excluirPagamento (modeloPagamento modPagamento) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from pagamento where cod_pagamento =?");
            pst.setInt(1, modPagamento.getCod_pagamento());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }
    
    public modeloPagamento buscaPagamento (modeloPagamento modPagamento) {
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM pagamento WHERE cod_venda = '"+ modPagamento.getPesquisa()+"'");
        try{
            connex.rs.first();
            modPagamento.setValor(connex.rs.getFloat("valor"));
            modPagamento.setData_pagamento(connex.rs.getString("data_pagamento"));
            modPagamento.setData_vencimento(connex.rs.getString("data_vencimento"));
            modPagamento.setCod_venda(connex.rs.getInt("cod_venda"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado" +ex);
        }
        connex.desconecta();
        return modPagamento;
    }
}