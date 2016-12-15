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
public class Persona {
    
    private String Nome;
    private String Cognome;

    public Persona(String Nome, String Cognome) {
        this.Nome = Nome;
        this.Cognome = Cognome;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }
    
    
    
    
}
