/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import persistencia.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class produtoDao {

    public boolean inserir(int custo_produto, String descricao) {
        String sql = "INSERT INTO produto(custo_produto, descricao) VALUES (?, ?)";//define instrução SQL
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);//prepara instrução SQL
            ps.setInt(1, custo_produto);
            ps.setString(2, descricao);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(produtoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String[] args) {
        //crie um objeto da classe 
        produtoDao dao = new produtoDao();
        //chame o método inserir desse objeto
        boolean result = dao.inserir(210, "ovo");
        if (result) {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Problemas com a inserção!");
        }
    }
}
