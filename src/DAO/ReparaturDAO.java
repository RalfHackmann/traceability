/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import daten.Reparatur;
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
public class ReparaturDAO {
    
    private final Connection myConn;

    public ReparaturDAO() throws IOException, SQLException {
        
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
     * @param dieRepararur
     */
    
    public void insertReparatur (Reparatur dieRepararur) {
        
        try {
            PreparedStatement myStmt = null;
            
            myStmt = myConn.prepareStatement("INSERT INTO baugruppe"
                    + " (user, artikelnr, abteilung, ArbPlatz, Betriebsauftrag)"
                    + " VALUES (?,?,?,?,?)");
            
            myStmt.setString(1, dieRepararur.);
            myStmt.setString(2, dieRepararur);
            myStmt.setString(3, dieRepararur);
            myStmt.setString(4, dieReparatur);
            myStmt.setString(5, dieRepararur);
         
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ReparaturDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   
            
    
     
    
    
}
