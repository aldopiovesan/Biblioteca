/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Dipendente extends Persona {

    private String ruolo;

    public Dipendente(String Nome, String Cognome, String ruolo) {
        super(Nome, Cognome);
        this.ruolo = ruolo;

    }
    
    
    
    public String addNewPrestito(int codCliente, int codLibro, Biblioteca bib) {
        String msg = "Impossibile aggiungere il prestito";
        
        if(codCliente<0 ||codLibro<0)  
            
            return msg;

      //creo un nuovo oggetto del prestito
      
      Prestito p = new Prestito(codCliente, codLibro, "prestito del " +new Date().toString());

        bib.getElencoPrestiti().add(p);

        msg ="Aggiunto prestito: codcli=" + codCliente + " - codlibro=  " + codLibro;
        return msg;

    }
    
     
    public String addNewPrestito(int codCliente, int codLibro, String note, Biblioteca bib) {
        String msg = "Impossibile aggiungere il prestito";
        
        if(codCliente<0 ||codLibro<0)  
            
            return msg;

      //creo un nuovo oggetto del prestito
      
      Prestito p = new Prestito(codCliente, codLibro, note + " prestito del " +new Date().toString());

        bib.getElencoPrestiti().add(p);

        msg ="Aggiunto prestito: codcli=" + codCliente + " - codlibro=  " + codLibro;
        return msg;

    }

    public String addNewLibro(String titolo, String autore,   Biblioteca bib) {
        String msg = "Impossibile aggiungere il libro";
        
        if(titolo.equals("") || autore.equals(""))  //serve x nn inserire se è vuoto
            
            return msg;

        int newcode = 1;
        if (bib.getElencoLibri().size() > 0) {

            newcode = bib.getElencoLibri().get(bib.getElencoLibri().size() - 1).getCodLibro() + 1;  //recupero ultimo elemento tramite size
        }

        Libro l = new Libro(titolo, autore, newcode);

        bib.getElencoLibri().add(l);

        msg ="Aggiunto Libro" + newcode + "#: " + titolo + " - " + autore;
        return msg;

    }

    public String removeLibroByIndex(int index, Biblioteca bib) {

        String msg = "impossibile cancellare libro";

        if (index < bib.getElencoLibri().size() && index >= 0) {  //caso ok si puo eliminare

            bib.getElencoLibri().remove(index);

            msg = "Libro eliminato";
        }

        return msg;
    }
}
