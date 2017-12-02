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
            pst.setInt(1, modFun.getTelefone());// primeiro parâmetro indica a ? correspondente, segundo parâmetro a variável que substituirá a ?
            pst.setString(2, modFun.getEndereco()); //exemplo de hora
            pst.setString(3, modFun.getNome()); //exemplo de data
            pst.setInt(4, modFun.getCpf()); //Exemplo de String
            pst.execute(); //executa SQL preparada
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir!/n Error:" + ex);
       
        }
    }
}