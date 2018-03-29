/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import daten.*;
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
public class TwedgeVorgabeDAO {
    
    private final Connection myConn;

    public TwedgeVorgabeDAO() throws IOException, SQLException {
        
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
     * @param dieTwedgeVorgabe
     */
    
    public void insertTwedgeVorgabe (TwedgeVorgabe dieTwedgeVorgabe) {
        
        try {
            PreparedStatement myStmt = null;
             
            myStmt = myConn.prepareStatement("INSERT INTO twedgeVorgabe"
                    + " (abteilung,  arbPlatz ,betriebsauftrag, user, nutzen)"
                    + " VALUES (?,?,?,?,?)");
            
            myStmt.setString(1, dieTwedgeVorgabe.getAbteilung().toString());
            myStmt.setString(2, dieTwedgeVorgabe.getArbPlatz());
            myStmt.setString(3, dieTwedgeVorgabe.getBetriebsauftrag().toString());
            myStmt.setString(4, dieTwedgeVorgabe.getUser().toString());
            myStmt.setString(5, dieTwedgeVorgabe.getNutzen().toString());
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TwedgeVorgabeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   
            
    
     
    
    
}

