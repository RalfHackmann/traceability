/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ralf Hackmann
 */
public class Stammdaten {
    
    private String user;
    private String arbeitsplatz;
    private String abteilung;

    public Stammdaten() {
        
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("tracestamm.properties"));
            
            String arbeitsplatz = props.getProperty("ThtArbeitsplatz");
            this.arbeitsplatz = arbeitsplatz;
            String abteilung = props.getProperty("Abteilung");
            this.abteilung = abteilung;
   
        } catch (IOException ex) {
            Logger.getLogger(Stammdaten.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Stammdaten(String user, String arbeitsplatz, String abteilung) {
        this.user = user;
        this.arbeitsplatz = arbeitsplatz;
        this.abteilung = abteilung;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getArbeitsplatz() {
        
        return arbeitsplatz;
    }

    public void setArbeitsplatz(String arbeitsplatz) {
        this.arbeitsplatz = arbeitsplatz;
    }

    public String getAbteilung() {
    
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    
}
