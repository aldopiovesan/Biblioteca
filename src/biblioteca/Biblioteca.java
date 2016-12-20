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
    private int maxLibri;

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
        this.maxLibri = 2;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public int getMaxLibri() {
        return maxLibri;
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

    public boolean isDisponibile(int codLibro) {

        boolean disp = true;

        for (int i = 0; i < elencoPrestiti.size(); i++) {

            if (codLibro == elencoPrestiti.get(i).codLibro && elencoPrestiti.get(i).dataRestituzione.equals("")) {

                disp = false;
                break; //esce dal ciclo appena trova un elemento
            }

        }

        return disp;
    }

    public boolean isClienteLimiteMax(int codCliente) {
        //nn è moroso
        boolean ko = false;
        //nn ha libri fuori
        int conta = 0;

        for (Prestito p : elencoPrestiti) {
            //se prestito del cliente e nn è restitutito con data aumento la sua conta
            if (p.codCliente == codCliente && p.dataRestituzione.equals("")) {
                conta++;
                //verifico che nn sfori il max e nel caso lo casso con ko  true
                if (conta >= maxLibri) {

                    ko = true;
                    break;
                }

            }

        }

        return ko;
    }

}
