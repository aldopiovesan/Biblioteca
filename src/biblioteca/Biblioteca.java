/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nomeBiblioteca;
    private String indirizzo;
    private ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
    private ArrayList<Dipendente> elencoDipendenti = new ArrayList<Dipendente>();
    private ArrayList<Cliente> elencoClienti = new ArrayList<Cliente>();
    private ArrayList<Prestito> elencoPrestiti = new ArrayList<Prestito>();

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public Biblioteca(String nomeBiblioteca, String indirizzo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;

    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Dipendente> getElencoDipendenti() {
        return elencoDipendenti;
    }

    public ArrayList<Cliente> getElencoClienti() {
        return elencoClienti;
    }

    public String getSchedario() {

        String msg = "";

        for (int i = 0; i < elencoLibri.size(); i++) {

            msg = msg + elencoLibri.get(i).getCodLibro() + " - " + elencoLibri.get(i).getTitolo() + " - " + elencoLibri.get(i).getAutore() + "\n";
        }

        return msg;

    }

}
