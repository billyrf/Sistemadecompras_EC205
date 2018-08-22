/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.sistemadecompras.model;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Willer
 */
public class GerarPDF implements Runnable {

    @Override
    public void run() {
        try {
            Desktop.getDesktop().open(new File("compra.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(GerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
