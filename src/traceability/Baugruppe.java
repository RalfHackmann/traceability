/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

/**
 *
 * @author Ralf Hackmann
 */
public class Baugruppe {
    
    private String datum;
    private String kuerzel;
    private String artikelnr;
    private String abteilung;
    private String arbPlatz;
    private String betriebsauftrag;

    public Baugruppe(String kuerzel, String artikelnr, String abteilung, String arbPlatz, String betriebsauftrag) {
        this.kuerzel = kuerzel;
        this.artikelnr = artikelnr;
        this.abteilung = abteilung;
        this.arbPlatz = arbPlatz;
        this.betriebsauftrag = betriebsauftrag;
    }
   

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public String getArtikelnr() {
        return artikelnr;
    }

    public void setArtikelnr(String artikelnr) {
        this.artikelnr = artikelnr;
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
    
    
    
}


