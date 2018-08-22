package br.inatel.sistemadecompras.view;

import br.inatel.sistemadecompras.model.Controller;
import br.inatel.sistemadecompras.model.Eletronicos;
import br.inatel.sistemadecompras.model.Moda;
import br.inatel.sistemadecompras.model.ProdutoTableModel;
import br.inatel.sistemadecompras.model.Produtos;
import br.inatel.sistemadecompras.model.Veiculos;
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

public class InterfaceGerente extends javax.swing.JFrame {

    private Produtos e;
    private Produtos m;
    private Produtos v;

    //Variavel que manipula a tabela
    ProdutoTableModel tableModel = new ProdutoTableModel();
    
    //Controle para manipular o fluxo das interfaces
    Controller control = new Controller();

    public InterfaceGerente() throws FileNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        jTProdutos.setModel(tableModel);
        carregaProdutos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbEletronico = new javax.swing.JRadioButton();
        rbModa = new javax.swing.JRadioButton();
        rbVeiculo = new javax.swing.JRadioButton();
        btCadastrar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro");

        buttonGroup1.add(rbEletronico);
        rbEletronico.setText("Eletronico");

        buttonGroup1.add(rbModa);
        rbModa.setText("Moda");

        buttonGroup1.add(rbVeiculo);
        rbVeiculo.setText("Veiculo");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço");

        jLabel3.setText("Descrição");

        jLabel4.setText("Nome");

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTProdutos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Lista de Produtos");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(btRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbEletronico)
                                .addGap(18, 18, 18)
                                .addComponent(rbModa)
                                .addGap(18, 18, 18)
                                .addComponent(rbVeiculo)))
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(184, 184, 184))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbEletronico)
                            .addComponent(rbModa)
                            .addComponent(rbVeiculo))
                        .addGap(18, 18, 18)
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        //Preenchendo e adicionando o contato no arquivo e na lista
        if ((rbEletronico.isSelected() || rbModa.isSelected() || rbVeiculo.isSelected())
                && !jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("")){
            
            
            try {

                if (rbEletronico.isSelected()) {
                    e = new Eletronicos();

                    e.setNome(jTextField1.getText());
                    e.setValor(Double.parseDouble(jTextField3.getText()));
                    e.setDescricao(jTextField2.getText());
                    e.setTipo(rbEletronico.getText());

                    OutputStream os1 = new FileOutputStream("produtos.txt", true);
                    OutputStreamWriter osw = new OutputStreamWriter(os1);
                    BufferedWriter bw = new BufferedWriter(osw);

                    bw.write(e.getTipo());
                    bw.newLine();
                    bw.write(e.getNome());
                    bw.newLine();
                    bw.write(Double.toString(e.getValor()));
                    bw.newLine();
                    bw.write(e.getDescricao());
                    bw.newLine();

                    bw.write("*");
                    bw.newLine();
                    bw.close();

                    //atualizando a jTable
                    tableModel.addRow(e);

                } else if (rbModa.isSelected()) {
                    m = new Moda();

                    m.setNome(jTextField1.getText());
                    m.setValor(Double.parseDouble(jTextField3.getText()));
                    m.setDescricao(jTextField2.getText());
                    m.setTipo(rbModa.getText());

                    OutputStream os1 = new FileOutputStream("produtos.txt", true);
                    OutputStreamWriter osw = new OutputStreamWriter(os1);
                    BufferedWriter bw = new BufferedWriter(osw);

                    bw.write(m.getTipo());
                    bw.newLine();
                    bw.write(m.getNome());
                    bw.newLine();
                    bw.write(Double.toString(m.getValor()));
                    bw.newLine();
                    bw.write(m.getDescricao());
                    bw.newLine();

                    bw.write("*");
                    bw.newLine();
                    bw.close();

                    //atualizando a jTable
                    tableModel.addRow(m);

                } else {
                    v = new Veiculos();

                    v.setNome(jTextField1.getText());
                    v.setValor(Double.parseDouble(jTextField3.getText()));
                    v.setDescricao(jTextField2.getText());
                    v.setTipo(rbVeiculo.getText());

                    OutputStream os1 = new FileOutputStream("produtos.txt", true);
                    OutputStreamWriter osw = new OutputStreamWriter(os1);
                    BufferedWriter bw = new BufferedWriter(osw);

                    bw.write(v.getTipo());
                    bw.newLine();
                    bw.write(v.getNome());
                    bw.newLine();
                    bw.write(Double.toString(v.getValor()));
                    bw.newLine();
                    bw.write(v.getDescricao());
                    bw.newLine();

                    bw.write("*");
                    bw.newLine();
                    bw.close();

                    //atualizando a jTable
                    tableModel.addRow(v);
                }

                //Limpa a tela dos nome, preço ... quando adicionado!
                limpaTela();

                JOptionPane.showMessageDialog(rootPane, "Produto adicionado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao adicionar produto, verifique se o preço está preenchido corretamente!");
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos acima para ser cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btCadastrarActionPerformed

    public void carregaProdutos() throws FileNotFoundException {

        tableModel.clearDados();
        try {

            //Abrindo o arquivo produtos.txt
            InputStream is = new FileInputStream("produtos.txt");
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

    public void limpaTela() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        rbEletronico.setSelected(false);
        rbModa.setSelected(false);
        rbVeiculo.setSelected(false);
        buttonGroup1.setSelected(null, false);
    }

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        //Se uma linha foi selecionada na tabela
        if (jTProdutos.getSelectedRow() != -1) {

            try {

                //Pegando o nome do produto que será deletado
                String produto = (String) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1);

                //Encontrar no arquivo os dados q serao deletados
                //Abrindo o arquivo produtos.txt
                InputStream is = new FileInputStream("produtos.txt");
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
                File a1 = new File("produtos.txt");
                InputStream is2 = new FileInputStream(a1);
                InputStreamReader isr2 = new InputStreamReader(is2);
                BufferedReader br2 = new BufferedReader(isr2);

                //Um arquivo auxiliar será criado para guardar os produtos nao excluidos
                File a2 = new File("produtosAux.txt");
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
                tableModel.removeRow(jTProdutos.getSelectedRow());

                JOptionPane.showMessageDialog(rootPane, "Produto excluido com sucesso!");
            } catch (IOException exc2) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao abrir a lista de produtos para excluir! :(");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum produto na lista para ser removido!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        control.abrirMenu();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        if (jTProdutos.getSelectedRow() != -1) {

            if ((rbEletronico.isSelected() || rbModa.isSelected() || rbVeiculo.isSelected())
                && !jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("")){

                try {

                    //Pegando o nome do produto que será atualizado
                    String produto = (String) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1);

                    //Encontrar no arquivo os dados q serao deletados
                    //Abrindo o arquivo produtos.txt
                    InputStream is = new FileInputStream("produtos.txt");
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
                    File a1 = new File("produtos.txt");
                    InputStream is2 = new FileInputStream(a1);
                    InputStreamReader isr2 = new InputStreamReader(is2);
                    BufferedReader br2 = new BufferedReader(isr2);

                    //Um arquivo auxiliar será criado para guardar os produtos nao excluidos
                    File a2 = new File("produtosAux.txt");
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

                    if (rbEletronico.isSelected()) {
                        bw.write(rbEletronico.getText());
                        bw.newLine();
                    } else if (rbModa.isSelected()) {
                        bw.write(rbModa.getText());
                        bw.newLine();
                    } else {
                        bw.write(rbVeiculo.getText());
                        bw.newLine();
                    }

                    bw.write(jTextField1.getText());
                    bw.newLine();
                    bw.write(jTextField3.getText());
                    bw.newLine();
                    bw.write(jTextField2.getText());
                    bw.newLine();

                    bw.write("*");
                    bw.newLine();

                    is2.close();
                    isr2.close();
                    br2.close();
                    bw.close();

                    //Colocando o conteudo do arquivo auxiliar no original
                    FileChannel src = new FileInputStream(a2).getChannel();
                    FileChannel dest = new FileOutputStream(a1).getChannel();
                    dest.transferFrom(src, 0, src.size());

                    
                    JOptionPane.showMessageDialog(rootPane, "Produto atualizado com sucesso!");
                } catch (IOException exc2) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao abrir a lista de produtos para editar! :(");
                }

                tableModel.setValueAt(jTextField1.getText(), jTProdutos.getSelectedRow(), 1);
                tableModel.setValueAt(Double.parseDouble(jTextField3.getText()), jTProdutos.getSelectedRow(), 2);
                tableModel.setValueAt(jTextField2.getText(), jTProdutos.getSelectedRow(), 3);
                if (rbEletronico.isSelected()) {
                    tableModel.setValueAt(rbEletronico.getText(), jTProdutos.getSelectedRow(), 0);
                } else if (rbModa.isSelected()) {
                    tableModel.setValueAt(rbModa.getText(), jTProdutos.getSelectedRow(), 0);
                } else {
                    tableModel.setValueAt(rbVeiculo.getText(), jTProdutos.getSelectedRow(), 0);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos acima para ser editado!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum produto na lista para ser editado!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btEditarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceGerente().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(InterfaceGerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton rbEletronico;
    private javax.swing.JRadioButton rbModa;
    private javax.swing.JRadioButton rbVeiculo;
    // End of variables declaration//GEN-END:variables
}
