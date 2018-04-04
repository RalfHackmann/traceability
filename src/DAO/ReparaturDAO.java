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
    
    public void insertReparatur (Reparatur dieReparatur) {
        
        try {
            PreparedStatement myStmt = null;
            
            myStmt = myConn.prepareStatement("INSERT INTO reparatur"
                    + " (user, betriebsauftrag, seriennr, position, artikelnr, chargenr, bemerkung)"
                    + " VALUES (?,?,?,?,?,?,?)");
            
     
            
            myStmt.setString(1, dieReparatur.getUser());
            myStmt.setString(2, dieReparatur.getBetriebsauftrag().toString());
            myStmt.setString(3, dieReparatur.getSeriennr().toString());
            myStmt.setString(4, dieReparatur.getPosition());
            myStmt.setString(5, dieReparatur.getArtikelnr());
            myStmt.setString(6, dieReparatur.getChargenr());
            myStmt.setString(7, dieReparatur.getBemerkung());
         
            
            myStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falsche oder unvollständige Eingaben, bitte wiederholen Sie die Eingabe","Fehler", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ReparaturDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public List<Reparatur> getReparatur( String betriebsauftrag) throws SQLException {
   
        List<Reparatur> list;
        list = new ArrayList<Reparatur>();
        
        Statement myStmt = null;
        ResultSet myRs = null;
        
        PreparedStatement selectStmt = null;
        
        myStmt = myConn.createStatement();
        
        selectStmt = myConn.prepareStatement("SELECT * FROM reparatur " 
                                           + "WHERE betriebsauftrag = ? " );
        try {
            selectStmt.setString(1, betriebsauftrag);
            myRs = selectStmt.executeQuery();
            
            } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            while (myRs.next()) {
                Reparatur tempReparatur = convertRowToMaterial(myRs);
                list.add(tempReparatur); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Verbindung zur Datenbank möglicherweise abgebrochen","Fehler", JOptionPane.ERROR_MESSAGE);
        }
        return list;
        
    }
        
        
        

    private Reparatur convertRowToMaterial(ResultSet myRs) throws SQLException {

    
        String user = myRs.getString("user");
        Integer betriebsauftrag = Integer.parseInt(myRs.getString("betriebsauftrag"));
        Integer seriennr = Integer.parseInt(myRs.getString("seriennr"));
        String position = myRs.getString("position");
        String artikelnr = myRs.getString("artikelnr");
        String chargenr = myRs.getString("chargenr");
        String bemerkung = myRs.getString("bemerkung");
        String datum = myRs.getString("datum");
    

        Reparatur tempReparatur = new Reparatur(user, betriebsauftrag, seriennr, position, artikelnr, chargenr, bemerkung, datum);
    
        return tempReparatur;
    }
    
    

       
 }
  
