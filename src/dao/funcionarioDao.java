/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import persistencia.ConexaoSQL;
import modeloBeans.modeloFuncionario;

/**
 *
 * @author Administrador
 */
public class funcionarioDao {
    
    ConexaoSQL connex = new ConexaoSQL();
    modeloFuncionario modFun = new modeloFuncionario();
    

    public void Salvar (modeloFuncionario modFun) {
        
        
        connex.conexao();
        
        try {
        PreparedStatement pst = connex.con.prepareStatement("INSERT INTO funcionario(telefone, endereco, nome, cpf) VALUES (?, ?, ?, ?)");
            pst.setLong(1, modFun.getTelefone());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modFun.getEndereco()); //exemplo de hora
            pst.setString(3, modFun.getNome()); //exemplo de data
            pst.setLong(4, modFun.getCpf()); //Exemplo de String
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir!/n Error:" + ex);
       
        }
    }
    public void editarCliente (modeloFuncionario modFuncionario){
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("update funcionario set telefone=?, endereco=?, nome=?, cpf=? where codigo =?");
            pst.setLong(1, modFuncionario.getTelefone());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modFuncionario.getEndereco()); //exemplo de hora
            pst.setString(3, modFuncionario.getNome()); //exemplo de data
            pst.setLong(4, modFuncionario.getCpf()); //Exemplo de String
            pst.setInt(5, modFuncionario.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados/nError: " +ex);
        }
        
        
        connex.desconecta();
    }
    public void excluirCliente (modeloFuncionario modFuncionario) {
        connex.conexao();
        
        try {
            PreparedStatement pst = connex.con.prepareStatement("delete from funcionario where codigo =?");
            pst.setInt(1, modFuncionario.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados" +ex);
        }
        
        connex.desconecta();
    }
 public modeloFuncionario buscaFuncionario (modeloFuncionario modFuncionario){
    
        connex.conexao();
        
        connex.executaSql("SELECT * FROM funcionario WHERE nome like '%"+modFuncionario.getPesquisa()+"%'");
        try{
            connex.rs.first();
            modFuncionario.setTelefone(Long.parseLong(connex.rs.getString("telefone")));
            modFuncionario.setEndereco(connex.rs.getString("endereco"));
            modFuncionario.setNome(connex.rs.getString("nome"));
            modFuncionario.setCpf(Long.parseLong(connex.rs.getString("cpf")));
            modFuncionario.setCodigo(Integer.parseInt(connex.rs.getString("codigo")));
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionário não cadastrado" + ex);
        }
        connex.desconecta();
        return modFuncionario;
    }
}