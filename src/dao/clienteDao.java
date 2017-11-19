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
public class clienteDao {

    public boolean inserir(String nome,int cpf, String endereco, int telefone, String inadimplencia) {
        String sql = "INSERT INTO cliente(nome, cpf, endereco, telefone, inadimplencia) VALUES (?, ?, ?, ?, ?)";//define instrução SQL
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);//prepara instrução SQL
            ps.setString(1, nome);// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            ps.setInt(2, cpf); //exemplo de hora
            ps.setString(3, endereco); //exemplo de data
            ps.setInt(4, telefone); //Exemplo de String
            ps.setString(5, inadimplencia);
            ps.execute(); //executa SQL preparada
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(clienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static void main(String[] args) {
        //crie um objeto da classe 
        clienteDao dao = new clienteDao();
        //chame o método inserir desse objeto
        boolean result = dao.inserir("João Vitor", 010101, "Rua Almirante Barroso", 011100, "Nenhuma");
        if (result) {
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Problemas com a inserção!");
        }
    }
}
