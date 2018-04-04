/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import daten.Material;
import daten.Reparatur;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Ralf Hackmann
 */
class ReparaturTableModel extends AbstractTableModel {
    
    private static final int SERIENNUMMER_COL = 0;
    private static final int POSITION_COL = 1;
    private static final int CHARGE_COL= 2;
    private static final int ARTIKELNR_COL = 3;
  
    
    private String[] spaltennamen = { "Seriennummer", "Position", "Charge", "ArtNr"};
    
    private List<Reparatur>reparatur;

    public ReparaturTableModel(List<Reparatur> theReparatur) {
        reparatur = theReparatur;
    }
    
    @Override
    public int getColumnCount() {
        return spaltennamen.length;
    }

    @Override
    public int getRowCount() {
        return reparatur.size();
    }    
    
    @Override
    public String getColumnName(int col) {
        return spaltennamen[col];
    }
    
    @Override
    public Object getValueAt (int row, int col) {
        
        Reparatur tempReparatur = reparatur.get(row);
        
        switch (col) {
            case SERIENNUMMER_COL:
                return tempReparatur.getSeriennr();
      
            case ARTIKELNR_COL:
                return tempReparatur.getArtikelnr();
     
            case CHARGE_COL:
                return tempReparatur.getChargenr();
                
            case POSITION_COL:
                return tempReparatur.getPosition();
     
            default:    
                return tempReparatur.getArtikelnr();
        }
    
   
}
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
