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
public class Reparatur {
    
  private String user; 
  private int betriebsauftrag; 
  private int seriennr; 
  private String position;
  private String artikelnr;
  private String chargenr; 
  private String bemerkung; 
  private String datum; 

    public Reparatur(String user, int betriebsauftrag, int seriennr, String position, String artikelnr, String chargenr, String bemerkung, String datum) {
        this.user = user;
        this.betriebsauftrag = betriebsauftrag;
        this.seriennr = seriennr;
        this.position = position;
        this.artikelnr = artikelnr;
        this.chargenr = chargenr;
        this.bemerkung = bemerkung;
        this.datum = datum;
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getBetriebsauftrag() {
        return betriebsauftrag;
    }

    public void setBetriebsauftrag(int betriebsauftrag) {
        this.betriebsauftrag = betriebsauftrag;
    }

    public int getSeriennr() {
        return seriennr;
    }

    public void setSeriennr(int seriennr) {
        this.seriennr = seriennr;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getArtikelnr() {
        return artikelnr;
    }

    public void setArtikelnr(String artikelnr) {
        this.artikelnr = artikelnr;
    }

    public String getChargenr() {
        return chargenr;
    }

    public void setChargenr(String chargenr) {
        this.chargenr = chargenr;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

   
  
    
}
