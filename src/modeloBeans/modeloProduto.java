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
public class modeloProduto {

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the custo_producao
     */
    public Double getCusto_producao() {
        return custo_producao;
    }
    

    /**
     * @param custo_producao the custo_producao to set
     */
    public void setCusto_producao(Double custo_producao) {
        this.custo_producao = custo_producao;
    }
    
    private String descricao;
    private Double custo_producao;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
}
