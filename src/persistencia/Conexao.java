/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edimar
 */
public class Conexao {

    private static Connection conn;
    private final static String DRIVER = "org.postgresql.Driver"; //sempre assim para o PostgreSQL
    private final static String IP = "localhost/"; //ip do computador que contém o banco
    public final static String DATABASE = "Padaria"; //nome base de dados no PostgreSQL
    public final static String USER = "postgres"; //usuário do banco de dados
    public final static String PASSWORD = "postgres"; //senha para o usuário 


    /*
        Estabelecendo uma conexão com o banco de dados
    */
    public static Connection getConexao() throws SQLException, ClassNotFoundException {

        if (conn != null) { //se já existe conexão aberta, retorna ela em vez de criar nova
            return conn;
        }

        //se não existe conexão cria uma nova
        Class.forName(DRIVER); //não mexer - definindo o JDBC utilizado
        conn = java.sql.DriverManager.getConnection("jdbc:postgresql://" + IP + DATABASE, USER, PASSWORD); //não mexer -- definindo os parâmetros de conexão
        return conn;

    }

    public static void fechaConexao() {
        try {
            conn.close();
            conn = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            getConexao();
            System.out.println("Feito!");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
