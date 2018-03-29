/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daten;

/**
 *
 * @author Ralf Hackmann
 */
public class TwedgeVorgabe {
    
    private String abteilung;
    private String arbPlatz;
    private String betriebsauftrag;
    private String user;
    private String nutzen;

    public TwedgeVorgabe(String abteilung, String arbPlatz, String betriebsauftrag, String user, String nutzen) {
        this.abteilung = abteilung;
        this.arbPlatz = arbPlatz;
        this.betriebsauftrag = betriebsauftrag;
        this.user = user;
        this.nutzen = nutzen;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getArbPlatz() {
        return arbPlatz;
    }

    public void setArbPlatz(String arbPlatz) {
        this.arbPlatz = arbPlatz;
    }

    public String getBetriebsauftrag() {
        return betriebsauftrag;
    }

    public void setBetriebsauftrag(String betriebsauftrag) {
        this.betriebsauftrag = betriebsauftrag;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNutzen() {
        return nutzen;
    }

    public void setNutzen(String nutzen) {
        this.nutzen = nutzen;
    }
    
    
    
}
