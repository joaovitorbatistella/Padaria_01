
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luizk
 */
public final class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas= null;
    private String[] colunas= null;
    
    
    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
        
        
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    @Override
    public int getRowCount(){
        return linhas.size();       
    }
    @Override
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    @Override
    public Object getValueAt(int numLin,int numCol){
        Object[] linha =(Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}
