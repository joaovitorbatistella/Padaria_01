/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author joaov
 */
@Entity
@Table(name = "salario", catalog = "Padaria_07", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Salario_1.findAll", query = "SELECT s FROM Salario_1 s")
    , @NamedQuery(name = "Salario_1.findByDataTermino", query = "SELECT s FROM Salario_1 s WHERE s.dataTermino = :dataTermino")
    , @NamedQuery(name = "Salario_1.findByDataInicio", query = "SELECT s FROM Salario_1 s WHERE s.dataInicio = :dataInicio")
    , @NamedQuery(name = "Salario_1.findByValor", query = "SELECT s FROM Salario_1 s WHERE s.valor = :valor")
    , @NamedQuery(name = "Salario_1.findByCodFuncionario", query = "SELECT s FROM Salario_1 s WHERE s.codFuncionario = :codFuncionario")})
public class Salario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "data_termino")
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    @Id
    @Basic(optional = false)
    @Column(name = "data_inicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @Column(name = "cod_funcionario")
    private int codFuncionario;

    public Salario_1() {
    }

    public Salario_1(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Salario_1(Date dataInicio, Date dataTermino, double valor, int codFuncionario) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valor = valor;
        this.codFuncionario = codFuncionario;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        Date oldDataTermino = this.dataTermino;
        this.dataTermino = dataTermino;
        changeSupport.firePropertyChange("dataTermino", oldDataTermino, dataTermino);
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        Date oldDataInicio = this.dataInicio;
        this.dataInicio = dataInicio;
        changeSupport.firePropertyChange("dataInicio", oldDataInicio, dataInicio);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        int oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataInicio != null ? dataInicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salario_1)) {
            return false;
        }
        Salario_1 other = (Salario_1) object;
        if ((this.dataInicio == null && other.dataInicio != null) || (this.dataInicio != null && !this.dataInicio.equals(other.dataInicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Salario_1[ dataInicio=" + dataInicio + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
