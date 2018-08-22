package br.inatel.sistemadecompras.view;

import br.inatel.sistemadecompras.model.BarraDeProgresso;
import br.inatel.sistemadecompras.model.Controller;
import br.inatel.sistemadecompras.model.Eletronicos;
import br.inatel.sistemadecompras.model.GerarPDF;
import br.inatel.sistemadecompras.model.ProdutoTableModel;
import br.inatel.sistemadecompras.model.Produtos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class InterfaceCarrinho extends javax.swing.JFrame {

    ProdutoTableModel tableModel = new ProdutoTableModel();
    Controller control = new Controller();
    
    public InterfaceCarrinho() throws FileNotFoundException, IOException {
        initComponents();
        setLocationRelativeTo(null);
        jTCarrinho.setModel(tableModel);
        carregaProdutos();
        somaProdutos();
    }

    public void somaProdutos() throws FileNotFoundException {

        double total = 0;

        try {

            InputStream is = new FileInputStream("carrinho.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();
            if (s != null) {
                //Achar o valor
                br.readLine();
                s = br.readLine();

                double valor = Double.parseDouble(s);

                while (s != null) {
                    total += valor;
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    s = br.readLine();
                    if (s != null) 
                        valor = Double.parseDouble(s);
                }
            } else {
                total = 0;
            }

            jTTotal.setText("R$ " + total);

        } catch (IOException ex) {

        }

    }

    public void carregaProdutos() throws FileNotFoundException {

        tableModel.clearDados();
        try {

            //Abrindo o arquivo produtos.txt
            InputStream is = new FileInputStream("carrinho.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            //Contador que indicará qual informação esta sendo acessado no momento
            int contInformacoes = 0;

            //Objeto auxiliar do tipo eletronico
            Produtos eAuxiliar = new Eletronicos();

            String s = br.readLine();
            while (s != null) {

                if (!s.equals("*")) {
                    if (contInformacoes == 0) {
                        eAuxiliar.setTipo(s);
                        contInformacoes++;
                        s = br.readLine();
                    } else if (contInformacoes == 1) {
                        eAuxiliar.setNome(s);
                        contInformacoes++;
                        s = br.readLine();
                    } else if (contInformacoes == 2) {
                        eAuxiliar.setValor(Double.parseDouble(s));
                        contInformacoes++;
                        s = br.readLine();
                    } else if (contInformacoes == 3) {
                        eAuxiliar.setDescricao(s);
                        contInformacoes++;
                        s = br.readLine();
                    }
                } else {
                    s = br.readLine();
                    //Inserindo os valores na JTable
                    tableModel.addRow(eAuxiliar);

                    //Limpando as informações
                    contInformacoes = 0;
                    eAuxiliar = new Eletronicos();

                }

            }

        } catch (IOException exc) {
            JOptionPane.showMessageDialog(rootPane, "Ainda não existem produtos! :(");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btFinalizarCompra = new javax.swing.JButton();
        btRemoverProduto = new javax.swing.JButton();
        btIrMenu = new javax.swing.JButton();
        btContinuarComprando = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carrinho");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btFinalizarCompra.setText("Finalizar Compra");
        btFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarCompraActionPerformed(evt);
            }
        });

        btRemoverProduto.setText("Remover Produto");
        btRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverProdutoActionPerformed(evt);
            }
        });

        btIrMenu.setText("Ir para o Menu");
        btIrMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrMenuActionPerformed(evt);
            }
        });

        btContinuarComprando.setText("Continuar Comprando");
        btContinuarComprando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinuarComprandoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preço total:");

        jTTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTotalActionPerformed(evt);
            }
        });

        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTCarrinho);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFinalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btContinuarComprando, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemoverProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btIrMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContinuarComprando, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btIrMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrMenuActionPerformed
        this.dispose();
        control.abrirMenu();
    }//GEN-LAST:event_btIrMenuActionPerformed

    private void jTTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTotalActionPerformed

    private void btContinuarComprandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuarComprandoActionPerformed
        this.dispose();
        control.abrirCliente();
    }//GEN-LAST:event_btContinuarComprandoActionPerformed

    private void btRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverProdutoActionPerformed

        //Se uma linha foi selecionada na tabela
        if (jTCarrinho.getSelectedRow() != -1) {

            try {

                //Pegando o nome do produto que será deletado
                String produto = (String) jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 1);

                //Encontrar no arquivo os dados q serao deletados
                //Abrindo o arquivo produtos.txt
                InputStream is = new FileInputStream("carrinho.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                //Variável que guardará a posição do produto dentro do arquivo
                int contadorDeLinha = 0;

                String s = br.readLine();
                while (s != null) {
                    contadorDeLinha++;
                    if (produto.contains(s)) {
                        break;
                    }
                    s = br.readLine();
                }
                is.close();
                isr.close();
                br.close();

                //Apos que encontrou a linha do  produto, subtrair 1
                contadorDeLinha = contadorDeLinha - 1;

                //Agora sim excluindo o contato no arquivo
                //Abrindo nova conexao com o arquivo
                File a1 = new File("carrinho.txt");
                InputStream is2 = new FileInputStream(a1);
                InputStreamReader isr2 = new InputStreamReader(is2);
                BufferedReader br2 = new BufferedReader(isr2);

                //Um arquivo auxiliar será criado para guardar os produtos nao excluidos
                File a2 = new File("carrinhoAux.txt");
                OutputStream os = new FileOutputStream(a2);
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);

                //Conta cada linha do arquivo
                int contadorDeLinha2 = 0;

                s = br2.readLine();
                while (s != null) {
                    contadorDeLinha2++;
                    if (contadorDeLinha2 == contadorDeLinha) {
                        if (!s.equalsIgnoreCase("*")) {
                            contadorDeLinha++;
                        }
                    } else {
                        bw.write(s);
                        bw.newLine();
                    }

                    s = br2.readLine();
                }
                is2.close();
                isr2.close();
                br2.close();
                bw.close();

                //Colocando o conteudo do arquivo auxiliar no original
                FileChannel src = new FileInputStream(a2).getChannel();
                FileChannel dest = new FileOutputStream(a1).getChannel();
                dest.transferFrom(src, 0, src.size());

                //Remove o produto da tabela
                tableModel.removeRow(jTCarrinho.getSelectedRow());

                //Faz a nova soma
                somaProdutos();

                JOptionPane.showMessageDialog(rootPane, "Produto retirado do carrinho!");
            } catch (IOException exc2) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao abrir a lista de produtos para retirar! :(");
            }
        }

    }//GEN-LAST:event_btRemoverProdutoActionPerformed

    private void btFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarCompraActionPerformed
        // Gerar PDF com o preço final
        String s, p;
        Document document = new Document();
        
        
        Thread t1, t2;
        GerarPDF gpdf = new GerarPDF();
        BarraDeProgresso bdp = new BarraDeProgresso(gpdf);
        t1 = new Thread(gpdf);
        t2 = new Thread(bdp);
        
            
        try {
            FileInputStream is = new FileInputStream("carrinho.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            PdfWriter.getInstance(document, new FileOutputStream("compra.pdf"));
            document.open();
            document.add(new Paragraph("Produtos:"));
            s = br.readLine();
            while(s != null){
                s = br.readLine();
                p = br.readLine();
                document.add(new Paragraph(s+"     R$"+p));
                s = br.readLine();
                s = br.readLine();
                s = br.readLine();
            }
            s = jTTotal.getText();
            document.add(new Paragraph("Total       "+s));
            document.close();
            is.close();
            isr.close();
            br.close();
           
            File a2 = new File("carrinho.txt");
            OutputStream os = new FileOutputStream(a2);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.flush();
            os.close();
            osw.close();
            bw.close();
            
            JOptionPane.showMessageDialog(rootPane, "Compra finalizada com sucesso!","Pronto",JOptionPane.INFORMATION_MESSAGE);
            control.abrirCliente();
            this.dispose();
            
            t2.start();
                     
            } catch (FileNotFoundException | DocumentException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao criar o pdf :(");
                System.out.println(ex);
                
        } catch (IOException ex) {
            Logger.getLogger(InterfaceCarrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btFinalizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceCarrinho().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(InterfaceCarrinho.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceCarrinho.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContinuarComprando;
    private javax.swing.JButton btFinalizarCompra;
    private javax.swing.JButton btIrMenu;
    private javax.swing.JButton btRemoverProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JTextField jTTotal;
    // End of variables declaration//GEN-END:variables
}
