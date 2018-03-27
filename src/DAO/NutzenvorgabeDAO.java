/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import daten.Nutzenvorgabe;
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
public class NutzenvorgabeDAO {
    
    private final Connection myConn;

    public NutzenvorgabeDAO() throws IOException, SQLException {
        
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
     * @param dieNutzenvorgabe
     */
    
    public void insertNutzenvorgabe (Nutzenvorgabe dieNutzenvorgabe) {
        
        try {
            PreparedStatement myStmt = null;
             
            myStmt = myConn.prepareStatement("INSERT INTO nutzenVorgabe"
                    + " (betriebsauftrag, ersteKarte, folgekarten)"
                    + " VALUES (?,?,?)");
            
            myStmt.setString(1, dieNutzenvorgabe.getBetriebsauftrag());
            myStmt.setString(2, dieNutzenvorgabe.getErsteKarte().toString());
            myStmt.setString(3, dieNutzenvorgabe.getFolgekarten().toString());
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(NutzenvorgabeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   
            
    
     
    
    
}
