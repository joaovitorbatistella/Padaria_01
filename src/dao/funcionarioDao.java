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
public class funcionarioDao {

    public boolean inserir(int telefone,String endereco,String nome, int cpf, int codigo) {
        String sql = "INSERT INTO funcionario(telefone, endereco, nome, cpf) VALUES (?, ?, ?, ?, ?)";//define instrução SQL
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);//prepara instrução SQL
            ps.setInt(1, telefone);// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            ps.setString(2, endereco); //exemplo de hora
            ps.setString(3, nome); //exemplo de data
            ps.setInt(4, cpf); //Exemplo de String
            ps.setInt(5, codigo);
            ps.execute(); //executa SQL preparada
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(funcionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String[] args) {
        //crie um objeto da classe 
        funcionarioDao dao = new funcionarioDao();
        //chame o método inserir desse objeto
        boolean result = dao.inserir(91798405, "Rua Almirante Barroso", "João Vitor Batistella", 0222716, 31);
        if (result) {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Problemas com a inserção!");
        }
    }
}
