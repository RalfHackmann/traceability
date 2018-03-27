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
public class Nutzenvorgabe {
    
    private  String betriebsauftrag;
    private  Integer folgekarten;
    private  Integer ersteKarte;

    public Nutzenvorgabe(String betriebsauftrag, Integer folgekarten, Integer ersteKarte) {
        this.betriebsauftrag = betriebsauftrag;
        this.folgekarten = folgekarten;
        this.ersteKarte = ersteKarte;
    }

    public String getBetriebsauftrag() {
        return betriebsauftrag;
    }

    public void setBetriebsauftrag(String betriebsauftrag) {
        this.betriebsauftrag = betriebsauftrag;
    }

    public Integer getFolgekarten() {
        return folgekarten;
    }

    public void setFolgekarten(Integer folgekarten) {
        this.folgekarten = folgekarten;
    }

    public Integer getErsteKarte() {
        return ersteKarte;
    }

    public void setErsteKarte(Integer ersteKarte) {
        this.ersteKarte = ersteKarte;
    }

  

    
    
    
    
    
    
    
 
    
}
