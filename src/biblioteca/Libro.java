/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author tss
 */
public class Libro {
    
    private String titolo;
    private String autore;
    private int codLibro;
    private String scaffale;

    public Libro(String titolo, String autore, int codLibro) {
        this.titolo = titolo;
        this.autore = autore;
        this.codLibro= codLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getScaffale() {
        return scaffale;
    }
    
     public int getCodLibro() {
        return codLibro;
    }
     
     
     public String getInfo(){
         
         String msg="";
         
         msg=  getCodLibro()+ "#: " +getTitolo()+ " - " +getAutore();
         
         
         return msg;
         
     }
    
    
    
    
    
}
