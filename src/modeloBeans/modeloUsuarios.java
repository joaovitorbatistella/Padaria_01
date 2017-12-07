/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author joaov
 */
public class modeloUsuarios {

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the usu_cod
     */
    public int getUsu_cod() {
        return usu_cod;
    }

    /**
     * @param usu_cod the usu_cod to set
     */
    public void setUsu_cod(int usu_cod) {
        this.usu_cod = usu_cod;
    }

    /**
     * @return the usu_nome
     */
    public String getUsu_nome() {
        return usu_nome;
    }

    /**
     * @param usu_nome the usu_nome to set
     */
    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    /**
     * @return the usu_senha
     */
    public String getUsu_senha() {
        return usu_senha;
    }

    /**
     * @param usu_senha the usu_senha to set
     */
    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }
    private int usu_cod;
    private String usu_nome;
    private String usu_senha;
    private String pesquisa;
    
}
