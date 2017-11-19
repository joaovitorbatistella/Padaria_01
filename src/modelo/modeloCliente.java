/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joaov
 */
public class modeloCliente {

    /**
     * @return the nome
     */
    public String getNome() {        
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the inadinplencia
     */
    public String getInadinplencia() {
        return inadinplencia;
    }

    /**
     * @param inadinplencia the inadinplencia to set
     */
    public void setInadinplencia(String inadinplencia) {
        this.inadinplencia = inadinplencia;
    }
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private String inadinplencia;        
}
