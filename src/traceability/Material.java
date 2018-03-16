/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

/**
 *
 * @author U14
 */
public class Material {
    
    private String datum;
    private String Kuerzel;
    private String artikelnr;
    private String abteilung;
    private String ArbPlatz;
    private String TischNr;
    private String PmNr;
    private String Charge;
    private String rollew;

    public Material(String datum, String Kuerzel, String artikelnr, String abteilung, String ArbPlatz, String TischNr, String PmNr, String Charge, String rollew) {
        this.datum = datum;
        this.Kuerzel = Kuerzel;
        this.artikelnr = artikelnr;
        this.abteilung = abteilung;
        this.ArbPlatz = ArbPlatz;
        this.TischNr = TischNr;
        this.PmNr = PmNr;
        this.Charge = Charge;
        this.rollew = rollew;
    }

    public String getDatum() {
        return datum;
    }
    
    /** Mitarbeiterkürzel
     * 
     * @return 
     */
    public String getKuerzel() {
        return Kuerzel;
    }

    public String getArtikelnr() {
        return artikelnr;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public String getArbPlatz() {
        return ArbPlatz;
    }

    public String getTischNr() {
        return TischNr;
    }

    public String getPmNr() {
        return PmNr;
    }

    public String getCharge() {
        return Charge;
    }

    public String getRollew() {
        return rollew;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    
    public void setKuerzel(String Kuerzel) {
        this.Kuerzel = Kuerzel;
    }

    public void setArtikelnr(String artikelnr) {
        this.artikelnr = artikelnr;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public void setArbPlatz(String ArbPlatz) {
        this.ArbPlatz = ArbPlatz;
    }

    public void setTischNr(String TischNr) {
        this.TischNr = TischNr;
    }

    public void setPmNr(String PmNr) {
        this.PmNr = PmNr;
    }

    public void setCharge(String Charge) {
        this.Charge = Charge;
    }

    public void setRollew(String rollew) {
        this.rollew = rollew;
    }

 @Override
 public String toString() {
     return String.format("Material (Kuerzel=%s, artikelnr=%s, abteilung=%s, ArbPlatz=%s, TischNr=%s, PmNr=%s, Charge=%s, rollew=%s)",
             Kuerzel, artikelnr, abteilung, ArbPlatz, TischNr, PmNr, Charge, rollew);
 }

    
}


