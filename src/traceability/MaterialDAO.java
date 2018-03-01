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
     *
     * @return
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
    
    private Material convertRowToMaterial(ResultSet myRs) throws SQLException {
        
        String user = myRs.getString("user");
        String artikelnr = myRs.getString("artikelnr");
        String abteilung = myRs.getString("abteilung");
        String ArbPlatz = myRs.getString("ArbPlatz");
        String TischNr = myRs.getString("TischNr");
        String pmnr = myRs.getString("pmnr");
        String rollew = myRs.getString("rollew");
        String chargenr = myRs.getString("rollew");
        
        Material tempMaterial = new Material(user, artikelnr, abteilung, ArbPlatz, TischNr, pmnr, chargenr, rollew);
        
        return tempMaterial;
    }
            
    
     
    
    
}
