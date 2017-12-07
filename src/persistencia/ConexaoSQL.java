/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author luizk
 */
public class ConexaoSQL {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost/Padaria_09";
    private final String usuario = "postgres";
    private final String senha = "postgres";
    public Connection con;
    
    public void conexao (){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Conectado Erro:\n"+ ex.getMessage());
        }
    }
    
    public void executaSql (String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não executa sql\n Erro: "+ ex.getMessage());
        }
    }
    
    
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null,"BD Desconectado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Desconectar BD:\n"+ ex.getMessage());
        }
        }

    public Object Conexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }