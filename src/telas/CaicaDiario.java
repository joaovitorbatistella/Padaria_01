/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.caixa_diario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloBeans.modeloCaixa_diario;
import persistencia.ConexaoSQL;

/**
 *
 * @author joaov
 */
public class CaicaDiario extends javax.swing.JFrame {
    ConexaoSQL connex = new ConexaoSQL();
    modeloCaixa_diario modCaixaD = new modeloCaixa_diario();
    caixa_diario caixadiarioDao = new caixa_diario();
    int flag=0;

    /**
     * Creates new form NewJFrame
     */
    public CaicaDiario() {
        initComponents();
        connex.conexao();
        preencherTabela("SELECT * from caixa_diario order by data_caixa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valorCaixa = new javax.swing.JTextField();
        dataCaixa = new javax.swing.JTextField();
        kButton1 = new br.com.cyber.componente.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCaixa = new br.com.cyber.componente.Ktable();
        botaoINSERIR = new javax.swing.JButton();
        botaoNOVO = new javax.swing.JButton();
        botaoCANCELAR = new javax.swing.JButton();
        botaoEDITAR = new javax.swing.JButton();
        botaoEXCLUIR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pesquiseCAIXA = new br.com.cyber.componente.KTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel1.setText("CAIXA DIÁRIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DATA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("VALOR:");

        valorCaixa.setEnabled(false);

        dataCaixa.setEnabled(false);

        kButton1.setBackground(new java.awt.Color(51, 255, 51));
        kButton1.setText("Buscar");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        tabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCaixaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCaixa);

        botaoINSERIR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoINSERIR.setText("INSERIR");
        botaoINSERIR.setEnabled(false);
        botaoINSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoINSERIRActionPerformed(evt);
            }
        });

        botaoNOVO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoNOVO.setText("NOVO");
        botaoNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNOVOActionPerformed(evt);
            }
        });

        botaoCANCELAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCANCELAR.setText("CANCELAR");
        botaoCANCELAR.setEnabled(false);
        botaoCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCANCELARActionPerformed(evt);
            }
        });

        botaoEDITAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEDITAR.setText("EDITAR");
        botaoEDITAR.setEnabled(false);
        botaoEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEDITARActionPerformed(evt);
            }
        });

        botaoEXCLUIR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEXCLUIR.setText("EXCLUIR");
        botaoEXCLUIR.setEnabled(false);
        botaoEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEXCLUIRActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\joaov\\Desktop\\icone_prrincipal.png")); // NOI18N

        pesquiseCAIXA.setK_placeholder_text("Pesquise por data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(dataCaixa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoINSERIR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesquiseCAIXA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCANCELAR)))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquiseCAIXA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dataCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(valorCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botaoINSERIR))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCANCELAR)
                            .addComponent(botaoNOVO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoEDITAR)
                            .addComponent(botaoEXCLUIR))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(671, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNOVOActionPerformed
        // TODO add your handling code here:
        dataCaixa.setEnabled(true);
        valorCaixa.setEnabled(true);
        botaoINSERIR.setEnabled(true);
        botaoCANCELAR.setEnabled(true);
    }//GEN-LAST:event_botaoNOVOActionPerformed

    private void botaoINSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoINSERIRActionPerformed
        // TODO add your handling code here:
        if(flag!=2){
        modCaixaD.setData_caixa(dataCaixa.getText());
        modCaixaD.setValor(Float.parseFloat(valorCaixa.getText()));
        caixadiarioDao.Salvar(modCaixaD);
        dataCaixa.setText("");
        valorCaixa.setText("");
        botaoINSERIR.setEnabled(false);
        dataCaixa.setEnabled(false);
        valorCaixa.setEnabled(false);
        }else if (flag==2){
            modCaixaD.setData_caixa(dataCaixa.getText());
            modCaixaD.setValor(Float.parseFloat(valorCaixa.getText()));
            caixadiarioDao.editarCliente(modCaixaD);
            botaoINSERIR.setEnabled(false);
            dataCaixa.setEnabled(false);
            valorCaixa.setEnabled(false);
        }
    }//GEN-LAST:event_botaoINSERIRActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        modCaixaD.setPesquisa(pesquiseCAIXA.getText());
        modeloCaixa_diario model = caixadiarioDao.buscaCaixa_diario(modCaixaD);
        dataCaixa.setText(model.getData_caixa());
        valorCaixa.setText(String.valueOf(model.getValor()));
        botaoEDITAR.setEnabled(true);
        botaoEXCLUIR.setEnabled(true);
    }//GEN-LAST:event_kButton1ActionPerformed

    private void tabelaCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCaixaMouseClicked
        // TODO add your handling code here:
        int indice = tabelaCaixa.getSelectedRow();
        dataCaixa.setText(tabelaCaixa.getValueAt(indice, 1).toString());
        valorCaixa.setText(tabelaCaixa.getValueAt(indice, 0).toString());
        
        
        botaoEDITAR.setEnabled(true);
        botaoEXCLUIR.setEnabled(true);
    }//GEN-LAST:event_tabelaCaixaMouseClicked

    private void botaoEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEXCLUIRActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            modCaixaD.setData_caixa(dataCaixa.getText());
            caixadiarioDao.excluirCaixa(modCaixaD);
        }
    }//GEN-LAST:event_botaoEXCLUIRActionPerformed

    private void botaoEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEDITARActionPerformed
        // TODO add your handling code here:
        flag=2;
        dataCaixa.setEnabled(true);
        valorCaixa.setEnabled(true);
        botaoINSERIR.setEnabled(true);
    }//GEN-LAST:event_botaoEDITARActionPerformed

    private void botaoCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCANCELARActionPerformed
        // TODO add your handling code here:
        dataCaixa.setEnabled(false);
        valorCaixa.setEnabled(false);
        botaoINSERIR.setEnabled(false);
        botaoNOVO.setEnabled(true);
        botaoCANCELAR.setEnabled(false);
        botaoEDITAR.setEnabled(false);
        botaoEXCLUIR.setEnabled(false);
        dataCaixa.setText("");
        valorCaixa.setText("");
        
    }//GEN-LAST:event_botaoCANCELARActionPerformed

    /**
     * @param args the command line arguments
     */public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"valor","data_caixa"};
        connex.conexao();
        
        connex.executaSql(Sql);
         try {
            connex.rs.first();
            do {
                dados.add(new Object[]{connex.rs.getFloat("valor"), connex.rs.getDate("data_caixa")});
            } while (connex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outro produto na tabela" +ex);
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        tabelaCaixa.setModel(modelo);
        tabelaCaixa.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaCaixa.getColumnModel().getColumn(0).setResizable(false);
        tabelaCaixa.getColumnModel().getColumn(1).setPreferredWidth(160);
        tabelaCaixa.getColumnModel().getColumn(1).setResizable(false);
        

        tabelaCaixa.setAutoResizeMode(tabelaCaixa.AUTO_RESIZE_OFF);
        tabelaCaixa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connex.desconecta();
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(caixa_diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caixa_diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caixa_diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caixa_diario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaicaDiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCANCELAR;
    private javax.swing.JButton botaoEDITAR;
    private javax.swing.JButton botaoEXCLUIR;
    private javax.swing.JButton botaoINSERIR;
    private javax.swing.JButton botaoNOVO;
    private javax.swing.JTextField dataCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.KButton kButton1;
    private br.com.cyber.componente.KTextField pesquiseCAIXA;
    private br.com.cyber.componente.Ktable tabelaCaixa;
    private javax.swing.JTextField valorCaixa;
    // End of variables declaration//GEN-END:variables
}
