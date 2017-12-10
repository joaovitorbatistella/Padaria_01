/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.sun.javafx.scene.control.skin.FXVK;
import persistencia.ConexaoSQL;
import dao.clienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.modeloCliente;
import modeloBeans.ModeloTabela;

/**
 *
 * @author Fabio
 */
public class cliente extends javax.swing.JFrame {
    ConexaoSQL connex = new ConexaoSQL();
    clienteDao daocl = new clienteDao();
    modeloCliente modCliente = new modeloCliente();
    int flag =0;
    

    /**
     * Creates new form Salário
     */
    public cliente() {
        initComponents();
        connex.conexao();
        preencherTabela("select * from cliente order by codigo");
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
        jLabel7 = new javax.swing.JLabel();
        botaoInserir = new br.com.cyber.componente.KButton();
        jLabel6 = new javax.swing.JLabel();
        inadinplenciaCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        cpfCliente = new javax.swing.JTextField();
        telefoneCliente = new javax.swing.JTextField();
        botaoExcluir = new br.com.cyber.componente.KButton();
        botaoEditar = new br.com.cyber.componente.KButton();
        botaoNovo = new br.com.cyber.componente.KButton();
        botaoCancelar = new br.com.cyber.componente.KButton();
        jLabel3 = new javax.swing.JLabel();
        kButton1 = new br.com.cyber.componente.KButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new br.com.cyber.componente.Ktable();
        jLabel8 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();
        pesquiseCLIENTE = new br.com.cyber.componente.KTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\joaov\\Desktop\\icone_prrincipal.png")); // NOI18N

        botaoInserir.setText("INSERIR");
        botaoInserir.setEnabled(false);
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("INADIMPLÊNCIA");

        inadinplenciaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inadinplenciaCliente.setEnabled(false);
        inadinplenciaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inadinplenciaClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TELEFONE");

        enderecoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enderecoCliente.setEnabled(false);
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ENDEREÇO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CPF");

        nomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeCliente.setEnabled(false);

        cpfCliente.setEnabled(false);
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        telefoneCliente.setEnabled(false);

        botaoExcluir.setText("Excluir");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.setEnabled(false);
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.setEnabled(false);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NOME");

        kButton1.setBackground(new java.awt.Color(0, 255, 0));
        kButton1.setText("Buscar");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Cliente");

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CÓDIGO");

        codigoCliente.setEnabled(false);

        pesquiseCLIENTE.setK_placeholder_text("Pesquise cliente por nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(inadinplenciaCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(telefoneCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pesquiseCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inadinplenciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquiseCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 520);

        setSize(new java.awt.Dimension(1106, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void inadinplenciaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inadinplenciaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inadinplenciaClienteActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        // TODO add your handling code here:
        if(flag==1){
        modCliente.setNome(nomeCliente.getText());
        modCliente.setCpf(Long.parseLong(cpfCliente.getText()));
        modCliente.setEndereco(enderecoCliente.getText());
        modCliente.setTelefone(Long.parseLong(telefoneCliente.getText()));
        modCliente.setInadimplencia(inadinplenciaCliente.getText());
        daocl.Salvar(modCliente);
        nomeCliente.setText("");
        cpfCliente.setText("");
        enderecoCliente.setText("");
        telefoneCliente.setText("");
        inadinplenciaCliente.setText("");
        botaoInserir.setEnabled(false);
        nomeCliente.setEnabled(false);
        cpfCliente.setEnabled(false);
        enderecoCliente.setEnabled(false);
        telefoneCliente.setEnabled(false);
        inadinplenciaCliente.setEnabled(false);
        }else{
            modCliente.setCodigo(Integer.parseInt(codigoCliente.getText()));
            modCliente.setNome(nomeCliente.getText());
            modCliente.setCpf(Long.parseLong(cpfCliente.getText()));
            modCliente.setEndereco(enderecoCliente.getText());
            modCliente.setTelefone(Long.parseLong(telefoneCliente.getText()));
            modCliente.setInadimplencia(inadinplenciaCliente.getText());
            daocl.editarCliente(modCliente);
             botaoInserir.setEnabled(false);
            nomeCliente.setEnabled(false);
            cpfCliente.setEnabled(false);
            enderecoCliente.setEnabled(false);
            telefoneCliente.setEnabled(false);
            inadinplenciaCliente.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        modCliente.setPesquisa(pesquiseCLIENTE.getText());
        modeloCliente model = daocl.buscaCliente(modCliente);
        nomeCliente.setText(model.getNome());
        cpfCliente.setText(String.valueOf(model.getCpf()));
        enderecoCliente.setText(model.getEndereco());
        telefoneCliente.setText(String.valueOf(model.getTelefone()));
        inadinplenciaCliente.setText(model.getInadimplencia());
        codigoCliente.setText(String.valueOf(model.getCodigo()));
        botaoEditar.setEnabled(true);
        botaoExcluir.setEnabled(true);
        preencherTabela("SELECT * FROM cliente WHERE nome LIKE '%"+modCliente.getPesquisa()+"%'");
    }//GEN-LAST:event_kButton1ActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        // TODO add your handling code here:
        flag=1;
        nomeCliente.setEnabled(true);
        cpfCliente.setEnabled(true);
        enderecoCliente.setEnabled(true);
        telefoneCliente.setEnabled(true);
        inadinplenciaCliente.setEnabled(true);
        botaoInserir.setEnabled(true);
        botaoCancelar.setEnabled(true);
        
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        nomeCliente.setEnabled(false);
        cpfCliente.setEnabled(false);
        enderecoCliente.setEnabled(false);
        telefoneCliente.setEnabled(false);
        inadinplenciaCliente.setEnabled(false);
        nomeCliente.setText("");
        cpfCliente.setText("");
        enderecoCliente.setText("");
        telefoneCliente.setText("");
        inadinplenciaCliente.setText("");
        botaoInserir.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoEditar.setEnabled(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:
        flag=2;
        nomeCliente.setEnabled(true);
        cpfCliente.setEnabled(true);
        enderecoCliente.setEnabled(true);
        telefoneCliente.setEnabled(true);
        inadinplenciaCliente.setEnabled(true);
        botaoInserir.setEnabled(true);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        int resposta =0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION){
            modCliente.setCodigo(Integer.parseInt(codigoCliente.getText()));
            daocl.excluirCliente(modCliente);
            
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked

            int indice = tabelaCliente.getSelectedRow();
            nomeCliente.setText(tabelaCliente.getValueAt(indice, 1).toString());
            cpfCliente.setText(tabelaCliente.getValueAt(indice, 2).toString());
            enderecoCliente.setText(tabelaCliente.getValueAt(indice, 3).toString());
            telefoneCliente.setText(tabelaCliente.getValueAt(indice, 4).toString());
            inadinplenciaCliente.setText(tabelaCliente.getValueAt(indice, 5).toString());
            codigoCliente.setText(tabelaCliente.getValueAt(indice, 0).toString());        

            botaoEditar.setEnabled(true);
            botaoExcluir.setEnabled(true);
        
    }//GEN-LAST:event_tabelaClienteMouseClicked

    /**
     * @param Sql
     */
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"codigo", "nome", "cpf", "endereco", "telefone", "inadinplencia"};
        connex.conexao();
        
        connex.executaSql(Sql);
         try {
            connex.rs.first();
            do {
                dados.add(new Object[]{connex.rs.getInt("codigo"), connex.rs.getString("nome"), connex.rs.getLong("cpf"), connex.rs.getString("endereco"), connex.rs.getLong("telefone"), connex.rs.getString("inadimplencia")});
            } while (connex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outro cliente na tabela");
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        tabelaCliente.setModel(modelo);
        tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(140);
        tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(110);
        tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabelaCliente.getColumnModel().getColumn(4).setResizable(false);
        tabelaCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabelaCliente.getColumnModel().getColumn(5).setResizable(false);
        

        tabelaCliente.setAutoResizeMode(tabelaCliente.AUTO_RESIZE_OFF);
        tabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.cyber.componente.KButton botaoCancelar;
    private br.com.cyber.componente.KButton botaoEditar;
    private br.com.cyber.componente.KButton botaoExcluir;
    private br.com.cyber.componente.KButton botaoInserir;
    private br.com.cyber.componente.KButton botaoNovo;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField enderecoCliente;
    private javax.swing.JTextField inadinplenciaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.KButton kButton1;
    private javax.swing.JTextField nomeCliente;
    private br.com.cyber.componente.KTextField pesquiseCLIENTE;
    private br.com.cyber.componente.Ktable tabelaCliente;
    private javax.swing.JTextField telefoneCliente;
    // End of variables declaration//GEN-END:variables
}
