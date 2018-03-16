/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author U14
 */
public class BaugruppeDAO {
    
    private final Connection myConn;

    public BaugruppeDAO() throws IOException, SQLException {
        
        Properties props = new Properties();
        props.load(new FileInputStream("trace.properties"));
        
        String url = props.getProperty("url");
        String user = props.getProperty("user");
        String pass = props.getProperty("pass");
        
        //Datenbankverbindung
        myConn = DriverManager.getConnection(url, user, pass);
        System.out.println("DB Connection successfull to " + url);
         }

    /**
     *
     * @param dieBaugruppe
     */
    
    public void insertBaugruppe (Baugruppe dieBaugruppe) {
        
        try {
            PreparedStatement myStmt = null;
            
            myStmt = myConn.prepareStatement("INSERT INTO baugruppe"
                    + " (user, artikelnr, abteilung, ArbPlatz, Betriebsauftrag)"
                    + " VALUES (?,?,?,?,?)");
            
            myStmt.setString(1, dieBaugruppe.getKuerzel());
            myStmt.setString(2, dieBaugruppe.getArtikelnr());
            myStmt.setString(3, dieBaugruppe.getAbteilung());
            myStmt.setString(4, dieBaugruppe.getArbPlatz());
            myStmt.setString(5, dieBaugruppe.getBetriebsauftrag());
         
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(BaugruppeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   
            
    
     
    
    
}
