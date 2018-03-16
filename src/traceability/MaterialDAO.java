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
 * @author Ralf Hackmann
 */
public class MaterialDAO {
    
    private final Connection myConn;

    public MaterialDAO() throws IOException, SQLException {
        
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
     * Das komplette Material wird aus der Tabelle Material gelesen
     * 
     * @return Arraylist des Objektes Material
     * @throws java.sql.SQLException
     * 
     * 
     */
    public List<Material> getAllMaterial() throws SQLException {
   
        List<Material> list;
        list = new ArrayList<Material>();
        
        Statement myStmt = null;
        ResultSet myRs = null;
        
        myStmt = myConn.createStatement();
        try {
            myRs = myStmt.executeQuery("SELECT * FROM material");
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            while (myRs.next()) {
                Material tempMaterial = convertRowToMaterial(myRs);
                list.add(tempMaterial); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        return list;
       
    }
 
    /**
     * Gibt Material gefiltert zurück:
     * Es wird folgende query abgesetzt:
     * SELECT * FROM material 
     * WHERE arbeitsplatz = @param arbeitsplatz 
     * AND betriebsauftrag = @param betriebsauftrag
     * @param betriebsauftrag
     * @param arbeitsplatz
     * @return
     * @throws SQLException 
     */
    public List<Material> getMaterial( String betriebsauftrag, String arbeitsplatz) throws SQLException {
   
        List<Material> list;
        list = new ArrayList<Material>();
        
        Statement myStmt = null;
        ResultSet myRs = null;
        
        myStmt = myConn.createStatement();
        try {
            myRs = myStmt.executeQuery("SELECT * FROM material WHERE ArbPlatz = '" + arbeitsplatz  + "' AND pmnr = '" + betriebsauftrag + "'");
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            while (myRs.next()) {
                Material tempMaterial = convertRowToMaterial(myRs);
                list.add(tempMaterial); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        return list;
       
    }
    
    public void insertMaterial (Material theMaterial) {
        
        try {
            PreparedStatement myStmt = null;
            
            myStmt = myConn.prepareStatement("INSERT INTO material"
                    + " (user, artikelnr, abteilung, ArbPlatz, PmNr, Chargenr, rollew)"
                    + " VALUES (?,?,?,?,?,?,?)");
            
            myStmt.setString(1, theMaterial.getKuerzel());
            myStmt.setString(2, theMaterial.getArtikelnr());
            myStmt.setString(3, theMaterial.getAbteilung());
            myStmt.setString(4, theMaterial.getArbPlatz());
            myStmt.setString(5, theMaterial.getPmNr());
            myStmt.setString(6, theMaterial.getCharge());
            myStmt.setString(7, theMaterial.getRollew());
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private Material convertRowToMaterial(ResultSet myRs) throws SQLException {
        
        String datum = myRs.getString("datum");
        String user = myRs.getString("user");
        String artikelnr = myRs.getString("artikelnr");
        String abteilung = myRs.getString("abteilung");
        String ArbPlatz = myRs.getString("ArbPlatz");
        String pmnr = myRs.getString("pmnr");
        String rollew = myRs.getString("rollew");
        String chargenr = myRs.getString("chargenr");
        
        Material tempMaterial = new Material(datum, user, artikelnr, abteilung, ArbPlatz, pmnr, chargenr, rollew);
        
        return tempMaterial;
    }
            
    
     
    
    
}
