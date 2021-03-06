/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import DAO.BaugruppeDAO;
import daten.Baugruppe;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static traceability.TraceStart.stammdaten;

/**
 *
 * @author U14
 */
public class TraceThtBaugruppe extends javax.swing.JFrame {
    
    private BaugruppeDAO baugruppeDAO;

    /**
     * Creates new form TraceThtBaugruppe
     */
    public TraceThtBaugruppe() {
        try {
            this.seriennummern = new ArrayList<>();
            initComponents();
            
            baugruppeDAO = new BaugruppeDAO();
        } catch (IOException | SQLException ex) {
            Logger.getLogger(TraceThtBaugruppe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSeriennummer = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jTextFieldBetriebsauftrag = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        jTextFieldAnzahlLK = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label4 = new java.awt.Label();
        labelAnzahlErfasseSN = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaErfasseSn = new javax.swing.JTextArea();
        label5 = new java.awt.Label();
        labelArbeitsplatz = new java.awt.Label();
        jButtonNeuBetriebsauftrag = new javax.swing.JButton();

        setTitle("Traceabiloity THT Baugruppe erfassen");
        setLocation(new java.awt.Point(350, 10));
        setName("frameThtBaugruppeErfassen"); // NOI18N
        setResizable(false);

        jTextFieldSeriennummer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldSeriennummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSeriennummerActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Seriennummer:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THT Baugruppe erfassen");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setName(""); // NOI18N
        label3.setText("Betriebsauftrag:");

        jTextFieldBetriebsauftrag.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldBetriebsauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBetriebsauftragActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setText("Ende mit 9999");

        jTextFieldAnzahlLK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldAnzahlLK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnzahlLKActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("Anzahl Leiterkarten im Rahmen");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Anzahl erfasste Seriennummern:");

        labelAnzahlErfasseSN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jTextAreaErfasseSn.setEditable(false);
        jTextAreaErfasseSn.setColumns(20);
        jTextAreaErfasseSn.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextAreaErfasseSn.setRows(5);
        jScrollPane1.setViewportView(jTextAreaErfasseSn);

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Arbeitsplatz (Tisch):");

        labelArbeitsplatz.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelArbeitsplatz.setText("*******");
        labelArbeitsplatz.setText(stammdaten.getArbeitsplatz());

        jButtonNeuBetriebsauftrag.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNeuBetriebsauftrag.setText("Neuer Betriebsauftrag");
        jButtonNeuBetriebsauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNeuBetriebsauftragActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAnzahlErfasseSN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAnzahlLK, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBetriebsauftrag, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(labelArbeitsplatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jTextFieldSeriennummer, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNeuBetriebsauftrag)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBetriebsauftrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelArbeitsplatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAnzahlLK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSeriennummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnzahlErfasseSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNeuBetriebsauftrag)))
                .addContainerGap())
        );

        label3.getAccessibleContext().setAccessibleName("Betriebsauftrag");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSeriennummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSeriennummerActionPerformed
        // TODO add your handling code here:
         if (jTextFieldSeriennummer.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte machen Sie eine gültige Eingabe", "Fehler", JOptionPane.WARNING_MESSAGE);
            jTextFieldSeriennummer.requestFocus();
        } else {
            jTextFieldAnzahlLK.requestFocus();
            insertSeriennummer();
        }
        
      
    }//GEN-LAST:event_jTextFieldSeriennummerActionPerformed

    private void jTextFieldBetriebsauftragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBetriebsauftragActionPerformed
        // TODO add your handling code here:
          if (jTextFieldBetriebsauftrag.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte machen Sie eine gültige Eingabe", "Fehler", JOptionPane.WARNING_MESSAGE);
            jTextFieldBetriebsauftrag.requestFocus();
        } else {
            jTextFieldAnzahlLK.requestFocus();
        }
        
    }//GEN-LAST:event_jTextFieldBetriebsauftragActionPerformed

    private void jTextFieldAnzahlLKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnzahlLKActionPerformed
        // TODO add your handling code here:
        boolean error = false;
        try {
        Integer.parseInt(jTextFieldAnzahlLK.getText());
        } catch (NumberFormatException ex) {
            error = true;
            JOptionPane.showMessageDialog(null,"Bitte geben sie eine Ganzzahl im Feld 'Anzahl Leiterkarten im Rahmen' ein","Fehler", JOptionPane.ERROR_MESSAGE);
            jTextFieldAnzahlLK.requestFocus();
            jTextFieldAnzahlLK.setText("");
        }
        if (error  == false) {
            jTextFieldSeriennummer.requestFocus();
        }        
        
    }//GEN-LAST:event_jTextFieldAnzahlLKActionPerformed

    private void jButtonNeuBetriebsauftragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNeuBetriebsauftragActionPerformed
        // TODO add your handling code here:
        jTextFieldBetriebsauftrag.setEnabled(true);
        jTextFieldBetriebsauftrag.setText("");
        jTextFieldAnzahlLK.setText("");
        jTextFieldBetriebsauftrag.setVisible(true);
        jTextFieldBetriebsauftrag.requestFocus();
        jTextFieldBetriebsauftrag.setEditable(true);
    }//GEN-LAST:event_jButtonNeuBetriebsauftragActionPerformed

    protected void insertSeriennummer() {
        
        int maxLK;
       
        maxLK = Integer.parseInt(jTextFieldAnzahlLK.getText());
        zaelerLK++;
        seriennummern.add(jTextFieldSeriennummer.getText());
     
        if ( "9999".equals(jTextFieldSeriennummer.getText()) ) {
            if (  zaelerLK != (maxLK+1)  )  {
                JOptionPane.showMessageDialog(null,"Anzahl erfasse Leiterkarten falsch, bitte Rahmen komplett wiederholen", "Fehler", JOptionPane.ERROR_MESSAGE);
                seriennummern.clear();
                jTextAreaErfasseSn.setText("");
                jTextFieldSeriennummer.setText("");
                zaelerLK = 0;
            
            } else {
                //Erfasste Serienummern in die Datenbank schrenben
                JOptionPane.showMessageDialog(null,"OK, Daten werden in die Datenbank geschrieben", "OK", JOptionPane.OK_OPTION);
                
                Baugruppe tempBaugruppe = null;
                
                String kuerzel = stammdaten.getUser();
                String betriebsauftrag = jTextFieldBetriebsauftrag.getText();
                String arbeitsplatz = stammdaten.getArbeitsplatz();
                String abteilung = stammdaten.getAbteilung();
                String artikelnr ;
                
                for (int i = 0; i < ((seriennummern.size()-1)) ;i++){
                    artikelnr = seriennummern.get(i);
                    System.out.println("ArtNr:" + artikelnr);
                    
                     tempBaugruppe = new Baugruppe ( kuerzel, artikelnr, abteilung, arbeitsplatz, betriebsauftrag);
                
                     baugruppeDAO.insertBaugruppe(tempBaugruppe);
                   
                    }
                seriennummern.clear();
                jTextAreaErfasseSn.setText("");
                jTextFieldSeriennummer.setText("");
                zaelerLK = 0;
                
            }
        }
        jTextAreaErfasseSn.append(jTextFieldSeriennummer.getText() + "\n");
        
        labelAnzahlErfasseSN.setText(String.valueOf(zaelerLK) + " / " + jTextFieldAnzahlLK.getText());
        jTextFieldSeriennummer.requestFocus();
        jTextFieldSeriennummer.setText("");
      
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TraceThtBaugruppe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraceThtBaugruppe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraceThtBaugruppe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraceThtBaugruppe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraceThtBaugruppe().setVisible(true);
            }
        });
    }

    int zaelerLK = 0;
    ArrayList<String> seriennummern;
  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNeuBetriebsauftrag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaErfasseSn;
    private javax.swing.JTextField jTextFieldAnzahlLK;
    private javax.swing.JTextField jTextFieldBetriebsauftrag;
    private javax.swing.JTextField jTextFieldSeriennummer;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label labelAnzahlErfasseSN;
    private java.awt.Label labelArbeitsplatz;
    // End of variables declaration//GEN-END:variables
}
