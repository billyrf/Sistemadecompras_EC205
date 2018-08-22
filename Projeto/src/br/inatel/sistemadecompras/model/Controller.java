package br.inatel.sistemadecompras.model;

import br.inatel.sistemadecompras.view.InterfaceCarrinho;
import br.inatel.sistemadecompras.view.InterfaceCliente;
import br.inatel.sistemadecompras.view.InterfaceGerente;
import br.inatel.sistemadecompras.view.LoginGerente;
import br.inatel.sistemadecompras.view.MenuInicial;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    public void abrirLoginGerente() {
        LoginGerente lg = new LoginGerente();
        lg.setVisible(true); 
        
    }

    public void abrirMenu() {
        MenuInicial mi = new MenuInicial();
        mi.setVisible(true);
    }
    
    public void abrirCliente(){
        InterfaceCliente ic = new InterfaceCliente();
        ic.setVisible(true);
    }
    
    public void abrirCarrinho() throws FileNotFoundException, IOException{
        InterfaceCarrinho ica = new InterfaceCarrinho();
        ica.setVisible(true);
    }
    
    public void abrirGerente() throws FileNotFoundException {
        InterfaceGerente ig = new InterfaceGerente();
        ig.setVisible(true);
    }
}
