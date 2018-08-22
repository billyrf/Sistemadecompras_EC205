package br.inatel.sistemadecompras.view;

import br.inatel.sistemadecompras.model.Controller;
import br.inatel.sistemadecompras.model.Eletronicos;
import br.inatel.sistemadecompras.model.Moda;
import br.inatel.sistemadecompras.model.ProdutoTableModel;
import br.inatel.sistemadecompras.model.Produtos;
import br.inatel.sistemadecompras.model.Veiculos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InterfaceCliente extends javax.swing.JFrame {

    ProdutoTableModel tableModel = new ProdutoTableModel();

    public InterfaceCliente() {
        initComponents();
        setLocationRelativeTo(null);
        jTable1.setModel(tableModel);
    }

    Controller control = new Controller();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btEletronicos = new javax.swing.JButton();
        btVeiculos = new javax.swing.JButton();
        btModa = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btCarrinho = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btAdicionarCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra dos Produtos");

        btEletronicos.setText("Eletrônicos");
        btEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEletronicosActionPerformed(evt);
            }
        });

        btVeiculos.setText("Veículos Motorizados");
        btVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculosActionPerformed(evt);
            }
        });

        btModa.setText("Moda");
        btModa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModaActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btCarrinho.setText("Carrinho");
        btCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarrinhoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Lista de Produtos");

        btAdicionarCarrinho.setText("Adicionar ao Carrinho");
        btAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btEletronicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(btVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btModa, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btEletronicos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarrinhoActionPerformed
        this.dispose();
        try {
            control.abrirCarrinho();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfaceCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCarrinhoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        control.abrirMenu();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModaActionPerformed
        tableModel.clearDados();

        //Verifica se exite algum produto do tipo
        int Verificador = 0;

        try {

            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();

            while (s != null) {
                if (s.contains("Moda")) {
                    Produtos m = new Moda();
                    m.setTipo(s);
                    s = br.readLine();
                    m.setNome(s);
                    s = br.readLine();
                    m.setValor(Double.parseDouble(s));
                    s = br.readLine();
                    m.setDescricao(s);
                    s = br.readLine();

                    Verificador++;
                    tableModel.addRow(m);
                } else {
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                }

                s = br.readLine();
            }

            if (Verificador == 0) {
                JOptionPane.showMessageDialog(rootPane, "Desculpe, nenhum produto à venda desta categoria!");
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao abir o arquivo", "ERRO", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btModaActionPerformed

    private void btEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEletronicosActionPerformed
        tableModel.clearDados();

        //Verifica se exite algum produto do tipo
        int Verificador = 0;

        try {

            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();

            while (s != null) {

                if (s.contains("Eletronico")) {
                    Produtos e = new Eletronicos();
                    e.setTipo(s);
                    s = br.readLine();
                    e.setNome(s);
                    s = br.readLine();
                    e.setValor(Double.parseDouble(s));
                    s = br.readLine();
                    e.setDescricao(s);
                    s = br.readLine();

                    Verificador++;
                    tableModel.addRow(e);
                } else {
                    s = br.readLine();
                    s = br.readLine();
                    s = br.readLine();
                    s = br.readLine();
                }
                s = br.readLine();
            }

            if (Verificador == 0) {
                JOptionPane.showMessageDialog(rootPane, "Desculpe, nenhum produto à venda desta categoria!");
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao abir o arquivo", "ERRO", JOptionPane.WARNING_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(InterfaceCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEletronicosActionPerformed

    private void btVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculosActionPerformed
        tableModel.clearDados();

        //Verifica se exite algum produto do tipo
        int Verificador = 0;

        try {

            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();

            while (s != null) {
                if (s.contains("Veiculo")) {
                    Produtos v = new Veiculos();
                    v.setTipo(s);
                    s = br.readLine();
                    v.setNome(s);
                    s = br.readLine();
                    v.setValor(Double.parseDouble(s));
                    s = br.readLine();
                    v.setDescricao(s);
                    s = br.readLine();

                    Verificador++;
                    tableModel.addRow(v);
                } else {
                    s = br.readLine();
                    s = br.readLine();
                    s = br.readLine();
                    s = br.readLine();
                }
                s = br.readLine();
            }

            if (Verificador == 0) {
                JOptionPane.showMessageDialog(rootPane, "Desculpe, nenhum produto à venda desta categoria!");
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao abir o arquivo", "ERRO", JOptionPane.WARNING_MESSAGE);

        } catch (IOException ex) {
            Logger.getLogger(InterfaceCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btVeiculosActionPerformed

    private void btAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarCarrinhoActionPerformed

        if (jTable1.getSelectedRow() != -1) {
            String tipo = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            String nome = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
            double valor = (double) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
            String descricao = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);

            try {
                OutputStream os = new FileOutputStream("carrinho.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write(tipo);
                bw.newLine();
                bw.write(nome);
                bw.newLine();
                bw.write(Double.toString(valor));
                bw.newLine();
                bw.write(descricao);
                bw.newLine();
                bw.write("*");
                bw.newLine();
                bw.close();
                JOptionPane.showMessageDialog(rootPane, "Produto adicionado ao carrinho!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao adicionar produto no carrinho!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum produto na lista para ser adicionado!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarCarrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarCarrinho;
    private javax.swing.JButton btCarrinho;
    private javax.swing.JButton btEletronicos;
    private javax.swing.JButton btModa;
    private javax.swing.JButton btVeiculos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
