/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.sistemadecompras.model;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Willer
 */
public class BarraDeProgresso extends JFrame implements Runnable {

    //Define a Barra de Progresso
    private JProgressBar progressBar = new JProgressBar();
    private GerarPDF tarefa;

    //Define as caracteristicas da barra de progresso
    public BarraDeProgresso(GerarPDF gpdf) {
        this.tarefa = gpdf;
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Container content = this.getContentPane();

        progressBar.setStringPainted(true);
        TitledBorder border = BorderFactory.createTitledBorder("Gerando PDF...");
        progressBar.setBorder(border);
        content.add(progressBar, BorderLayout.NORTH);
        this.setSize(300, 100);
        this.setVisible(true);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            progressBar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(progressBar.getValue() == 100){
            tarefa.run();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "PDF cancelado!");
        }
        this.setVisible(false);
    }
}
