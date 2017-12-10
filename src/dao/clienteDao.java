/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.ConexaoSQL;
import modeloBeans.modeloCliente;

/**
 *
 * @author Administrador
 */
public class clienteDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloCliente modCliente = new modeloCliente();
    

    public void Salvar (modeloCliente modCliente) {
        
        
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO cliente(nome, cpf, endereco, telefone, inadimplencia) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, modCliente.getNome());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setLong(2, modCliente.getCpf()); //exemplo de hora
            pst.setString(3, modCliente.getEndereco()); //exemplo de data
            pst.setLong(4, modCliente.getTelefone()); //Exemplo de String
            pst.setString(5, modCliente.getInadimplencia());
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!/nError:" +ex);
           
        }
            connex.desconecta();
    }
    public void editarCliente (modeloCliente modCliente){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update cliente set nome=?, cpf=?, endereco=?, telefone=?, inadimplencia=? where codigo =?");
            pst.setString(1, modCliente.getNome());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setLong(2, modCliente.getCpf()); //exemplo de hora
            pst.setString(3, modCliente.getEndereco()); //exemplo de data
            pst.setLong(4, modCliente.getTelefone()); //Exemplo de String
            pst.setString(5, modCliente.getInadimplencia());
            pst.setInt(6, modCliente.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    public void excluirCliente (modeloCliente modCliente) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from cliente where codigo =?");
            pst.setInt(1, modCliente.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }
 public modeloCliente buscaCliente (modeloCliente modCliente){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM cliente WHERE nome LIKE '%"+modCliente.getPesquisa()+"%'");
        try{
            connex.rs.first();
            modCliente.setNome(connex.rs.getString("nome"));
            modCliente.setCpf(Long.parseLong(connex.rs.getString("cpf")));
            modCliente.setEndereco(connex.rs.getString("endereco"));
            modCliente.setTelefone(Long.parseLong(connex.rs.getString("telefone")));
            modCliente.setInadimplencia(connex.rs.getString("inadimplencia"));
            modCliente.setCodigo(connex.rs.getInt("codigo"));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
        connex.desconecta();
        return modCliente;
    }
}
