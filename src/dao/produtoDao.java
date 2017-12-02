/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import persistencia.ConexaoSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.modeloProduto;

/**
 *
 * @author Administrador
 */
public class produtoDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloProduto modProduto = new modeloProduto();

    public void Salvar(modeloProduto moProduto) {
        
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("INSERT INTO produto(descricao, custo_producao) VALUES (?, ?)");
            pst.setString(1, modProduto.getDescricao());
            pst.setDouble(2, modProduto.getCusto_producao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!/n ERROR: " +ex);
        }
        connex.desconecta();
    }

    
    public modeloProduto buscaProduto (modeloProduto modProduto) throws ClassNotFoundException, SQLException {
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM produto WHERE descricao LIKE '%'"+modProduto.getPesquisa());
        try{
            connex.rs.first();
            modProduto.setDescricao(connex.rs.getString("descricao"));
            modProduto.setCusto_producao(connex.rs.getDouble("custo_producao"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado");
        }
        connex.desconecta();
        return modProduto;
    }
}

