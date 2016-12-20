/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Biblioteca bib = new Biblioteca("Biblio Ivrea", "via Ottientti 2, Ivrea");  //creo oggetti
        Cliente c1;
        c1 = new Cliente("corona", "fabrizio", 1);
        bib.getElencoClienti().add(c1);
        c1 = new Cliente("rodriguez", "belen", 2);
        bib.getElencoClienti().add(c1);
        Dipendente d1;

        d1 = new Dipendente("Marco", "Rossi", "bibliotecario");          //creo oggetti
        bib.getElencoDipendenti().add(d1);
        d1 = new Dipendente("Matteo", "Gentiloni", "premier");           //creo oggetti

        bib.getElencoDipendenti().add(d1);

        Libro l1 = new Libro("Il signore degli anelli", "Tolkien", 1);
        Libro l2 = new Libro("Lo Hobbit", "Tolkien", 2);

        bib.getElencoLibri().add(l1);
        bib.getElencoLibri().add(l2);

        Prestito p;

        p = new Prestito(2, 1, ""+ new Date().toString() +" - "+ c1.getNome());

        bib.getElencoPrestiti().add(p);
        
       
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoWinBiblio(bib).setVisible(true);
            }
        });

    }

}
