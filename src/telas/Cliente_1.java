/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author joaov
 */
@Entity
@Table(name = "cliente", catalog = "Padaria_07", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c")
    , @NamedQuery(name = "Cliente_1.findByNome", query = "SELECT c FROM Cliente_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cliente_1.findByCpf", query = "SELECT c FROM Cliente_1 c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Cliente_1.findByEndereco", query = "SELECT c FROM Cliente_1 c WHERE c.endereco = :endereco")
    , @NamedQuery(name = "Cliente_1.findByTelefone", query = "SELECT c FROM Cliente_1 c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Cliente_1.findByInadimplencia", query = "SELECT c FROM Cliente_1 c WHERE c.inadimplencia = :inadimplencia")
    , @NamedQuery(name = "Cliente_1.findByCodigo", query = "SELECT c FROM Cliente_1 c WHERE c.codigo = :codigo")})
public class Cliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private long cpf;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "telefone")
    private long telefone;
    @Basic(optional = false)
    @Column(name = "inadimplencia")
    private String inadimplencia;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;

    public Cliente_1() {
    }

    public Cliente_1(Integer codigo) {
        this.codigo = codigo;
    }

    public Cliente_1(Integer codigo, String nome, long cpf, String endereco, long telefone, String inadimplencia) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.inadimplencia = inadimplencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        long oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        long oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getInadimplencia() {
        return inadimplencia;
    }

    public void setInadimplencia(String inadimplencia) {
        String oldInadimplencia = this.inadimplencia;
        this.inadimplencia = inadimplencia;
        changeSupport.firePropertyChange("inadimplencia", oldInadimplencia, inadimplencia);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente_1)) {
            return false;
        }
        Cliente_1 other = (Cliente_1) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Cliente_1[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
