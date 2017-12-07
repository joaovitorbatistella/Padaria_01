/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import persistencia.ConexaoSQL;
import modeloBeans.modeloProduto;
import dao.produtoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;


/**
 *
 * @author joaov
 */
public class cadastropodruto extends javax.swing.JFrame {
    ConexaoSQL connex = new ConexaoSQL();
    modeloProduto modProduto = new modeloProduto();
    produtoDao daoProduto = new produtoDao();
    /**
     * Creates new form cadastropodruto
     */
    public cadastropodruto() {
        initComponents();
        connex.conexao();
        preencherTabela("SELECT * FROM produto order by codigo");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPRODUTO = new br.com.cyber.componente.Ktable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new br.com.cyber.componente.KButton();
        botaoINSERIR = new javax.swing.JButton();
        botaoEDITAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoEXCLUIR = new javax.swing.JButton();
        botaoNOVO = new javax.swing.JButton();
        pesquisaProduto = new javax.swing.JTextField();
        descricaoProduto = new javax.swing.JTextField();
        custoProduto = new javax.swing.JTextField();
        botaoCANCELAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codigoProdutos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tabelaPRODUTO.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaPRODUTO);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 60)); // NOI18N
        jLabel3.setText("Produtos");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\joaov\\Desktop\\icone_prrincipal.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel2.setText("Custo de Produção:");

        kButton1.setBackground(new java.awt.Color(51, 255, 0));
        kButton1.setText("Busca");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        botaoINSERIR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoINSERIR.setText("INSERIR");
        botaoINSERIR.setEnabled(false);
        botaoINSERIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoINSERIRActionPerformed(evt);
            }
        });

        botaoEDITAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEDITAR.setText("Editar");
        botaoEDITAR.setEnabled(false);
        botaoEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEDITARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel1.setText("Descrição:");

        botaoEXCLUIR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoEXCLUIR.setText("Excluir");
        botaoEXCLUIR.setEnabled(false);
        botaoEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEXCLUIRActionPerformed(evt);
            }
        });

        botaoNOVO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoNOVO.setText("Novo");
        botaoNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNOVOActionPerformed(evt);
            }
        });

        pesquisaProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaProdutoActionPerformed(evt);
            }
        });

        descricaoProduto.setEnabled(false);
        descricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoProdutoActionPerformed(evt);
            }
        });

        custoProduto.setEnabled(false);
        custoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custoProdutoActionPerformed(evt);
            }
        });

        botaoCANCELAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCANCELAR.setText("Cancelar");
        botaoCANCELAR.setEnabled(false);
        botaoCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCANCELARActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel5.setText("Código:");

        codigoProdutos.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(custoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(codigoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoINSERIR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(custoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(codigoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoINSERIR))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoNOVO)
                            .addComponent(botaoCANCELAR)
                            .addComponent(botaoEDITAR)
                            .addComponent(botaoEXCLUIR))
                        .addGap(101, 101, 101))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(890, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCANCELARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCANCELARActionPerformed

    private void custoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custoProdutoActionPerformed

    private void descricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoProdutoActionPerformed

    private void pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaProdutoActionPerformed

    private void botaoNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNOVOActionPerformed
        // TODO add your handling code here:
        descricaoProduto.setEnabled(true);
        custoProduto.setEnabled(true);
        botaoINSERIR.setEnabled(true);
        botaoCANCELAR.setEnabled(true);
        botaoEDITAR.setEnabled(true);
        botaoEXCLUIR.setEnabled(true);
    }//GEN-LAST:event_botaoNOVOActionPerformed

    private void botaoEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEXCLUIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEXCLUIRActionPerformed

    private void botaoEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEDITARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEDITARActionPerformed

    private void botaoINSERIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoINSERIRActionPerformed
        // TODO add your handling code here:
        modProduto.setDescricao(descricaoProduto.getText());
        modProduto.setCusto_producao(Float.parseFloat(custoProduto.getText()));
        daoProduto.Salvar(modProduto);
        descricaoProduto.setEnabled(false);
        custoProduto.setEnabled(false);
    }//GEN-LAST:event_botaoINSERIRActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        modProduto.setPesquisa(pesquisaProduto.getText());
        modeloProduto model = daoProduto.buscaProduto(modProduto);
        descricaoProduto.setText(model.getDescricao());
        custoProduto.setText(String.valueOf(model.getCusto_producao()));
        codigoProdutos.setText(String.valueOf(model.getCodigo()));
        botaoEDITAR.setEnabled(true);
        botaoEXCLUIR.setEnabled(true);
    }                                        

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

    }//GEN-LAST:event_kButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
     public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"codigo", "custo-producao", "descricao"};
        connex.conexao();
        
        connex.executaSql(Sql);
         try {
            connex.rs.first();
            do {
                dados.add(new Object[]{connex.rs.getInt("codigo"), connex.rs.getFloat("custo_producao"), connex.rs.getString("descricao")});
            } while (connex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outro produto na tabela");
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        tabelaPRODUTO.setModel(modelo);
        tabelaPRODUTO.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabelaPRODUTO.getColumnModel().getColumn(0).setResizable(false);
        tabelaPRODUTO.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabelaPRODUTO.getColumnModel().getColumn(1).setResizable(false);
        tabelaPRODUTO.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabelaPRODUTO.getColumnModel().getColumn(2).setResizable(false);

        tabelaPRODUTO.setAutoResizeMode(tabelaPRODUTO.AUTO_RESIZE_OFF);
        tabelaPRODUTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(cadastropodruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastropodruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastropodruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastropodruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastropodruto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCANCELAR;
    private javax.swing.JButton botaoEDITAR;
    private javax.swing.JButton botaoEXCLUIR;
    private javax.swing.JButton botaoINSERIR;
    private javax.swing.JButton botaoNOVO;
    private javax.swing.JTextField codigoProdutos;
    private javax.swing.JTextField custoProduto;
    private javax.swing.JTextField descricaoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.KButton kButton1;
    private javax.swing.JTextField pesquisaProduto;
    private br.com.cyber.componente.Ktable tabelaPRODUTO;
    // End of variables declaration//GEN-END:variables
}
