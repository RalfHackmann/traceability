/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import daten.Material;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Ralf Hackmann
 */
class MaterialTableModel extends AbstractTableModel {
    
    private static final int KUERZEL_COL = 5;
    private static final int DATUM_COL = 1;
    private static final int ARTIKELNR_COL = 3;
    private static final int ABTEILUNG_COL = 1000;
    private static final int ARBPLATZ_COL = 4;
    private static final int PMNR_COL = 0;
    private static final int CHARGE_COL= 2;
    private static final int ROLLEW_COL = 1002;
    
    private String[] spaltennamen = { "Betriebsauftrag", "Datum", "Charge", "ArtNr", "Arbeitsplatz", "Kürzel"};
    
    private List<Material>material;

    public MaterialTableModel(List<Material> theMaterial) {
        material = theMaterial;
    }
    
    @Override
    public int getColumnCount() {
        return spaltennamen.length;
    }

    @Override
    public int getRowCount() {
        return material.size();
    }    
    
    @Override
    public String getColumnName(int col) {
        return spaltennamen[col];
    }
    
    @Override
    public Object getValueAt (int row, int col) {
        
        Material tempMaterial = material.get(row);
        
        switch (col) {
            case KUERZEL_COL:
                return tempMaterial.getKuerzel();
            case DATUM_COL:
                return tempMaterial.getDatum();
            case ARTIKELNR_COL:
                return tempMaterial.getArtikelnr();
            case ABTEILUNG_COL:
                return tempMaterial.getAbteilung();
            case ARBPLATZ_COL:
                return tempMaterial.getArbPlatz();
            case PMNR_COL:
                return tempMaterial.getPmNr();
            case CHARGE_COL:
                return tempMaterial.getCharge();
            case ROLLEW_COL:
                return tempMaterial.getRollew();
            default:    
                return tempMaterial.getArtikelnr();
        }
    
   
}
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
