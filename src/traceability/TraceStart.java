/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traceability;

import javax.swing.JOptionPane;

/**
 *
 * @author U14
 */
public class TraceStart extends javax.swing.JFrame {
 

    /**
     * Creates new form TraceStart
     */
    public TraceStart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonTHTMaterial = new javax.swing.JButton();
        jButtonTHTMaterial1 = new javax.swing.JButton();
        jButtonSmdRuesten = new javax.swing.JButton();
        jButtonSmdRuesten1 = new javax.swing.JButton();
        jButtonSmdMaschinenvorbelegeung = new javax.swing.JButton();
        jButtonSmdMaschinenvorbelegeung1 = new javax.swing.JButton();
        jTextFieldKuerzel = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        jButtonTHTMaterialKopieren = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Traceability ");

        jButtonTHTMaterial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTHTMaterial.setText("THT Material erfassen");
        jButtonTHTMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTHTMaterialActionPerformed(evt);
            }
        });

        jButtonTHTMaterial1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTHTMaterial1.setText("THT Baugruppe erfassen");
        jButtonTHTMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTHTMaterial1ActionPerformed(evt);
            }
        });

        jButtonSmdRuesten.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSmdRuesten.setText("SMD Material  rüsten");
        jButtonSmdRuesten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmdRuestenActionPerformed(evt);
            }
        });

        jButtonSmdRuesten1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSmdRuesten1.setText("SMD Material  rüsten");
        jButtonSmdRuesten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmdRuesten1ActionPerformed(evt);
            }
        });

        jButtonSmdMaschinenvorbelegeung.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSmdMaschinenvorbelegeung.setText("SMD Maschine vorbelegen");
        jButtonSmdMaschinenvorbelegeung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmdMaschinenvorbelegeungActionPerformed(evt);
            }
        });

        jButtonSmdMaschinenvorbelegeung1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSmdMaschinenvorbelegeung1.setText("Reparatur");
        jButtonSmdMaschinenvorbelegeung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmdMaschinenvorbelegeung1ActionPerformed(evt);
            }
        });

        jTextFieldKuerzel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKuerzel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKuerzelActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setText("Kürzel:");

        jButtonTHTMaterialKopieren.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTHTMaterialKopieren.setText("THT Material kopieren");
        jButtonTHTMaterialKopieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTHTMaterialKopierenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSmdMaschinenvorbelegeung1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSmdMaschinenvorbelegeung, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSmdRuesten, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTHTMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTHTMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTHTMaterialKopieren, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jButtonSmdRuesten1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKuerzel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTHTMaterial)
                .addGap(18, 18, 18)
                .addComponent(jButtonTHTMaterial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTHTMaterialKopieren)
                .addGap(42, 42, 42)
                .addComponent(jButtonSmdRuesten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSmdMaschinenvorbelegeung)
                .addGap(33, 33, 33)
                .addComponent(jButtonSmdMaschinenvorbelegeung1)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(401, Short.MAX_VALUE)
                    .addComponent(jButtonSmdRuesten1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(109, 109, 109)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTHTMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTHTMaterialActionPerformed
        // TODO add your handling code here:
        if (jTextFieldKuerzel.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte geben Sie Ihr gültiges Mitarbeiterkürzel ein", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else {
            stammdaten.setUser(jTextFieldKuerzel.getText());
            new TraceThtMaterial().setVisible(true);
        }
    }//GEN-LAST:event_jButtonTHTMaterialActionPerformed

    private void jButtonTHTMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTHTMaterial1ActionPerformed
        // TODO add your handling code here:
         if (jTextFieldKuerzel.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte geben Sie Ihr gültiges Mitarbeiterkürzel ein", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else {
            stammdaten.setUser(jTextFieldKuerzel.getText());
            new TraceThtBaugruppe().setVisible(true);
        }
    }//GEN-LAST:event_jButtonTHTMaterial1ActionPerformed

    private void jButtonSmdRuestenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmdRuestenActionPerformed
        // TODO add your handling code here:
        if (jTextFieldKuerzel.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte geben Sie Ihr gültiges Mitarbeiterkürzel ein", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else {
            stammdaten.setUser(jTextFieldKuerzel.getText());
            new TraceSmdRuesten().setVisible(true);
        }
    }//GEN-LAST:event_jButtonSmdRuestenActionPerformed

    private void jButtonSmdRuesten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmdRuesten1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSmdRuesten1ActionPerformed

    private void jButtonSmdMaschinenvorbelegeungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmdMaschinenvorbelegeungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSmdMaschinenvorbelegeungActionPerformed

    private void jButtonSmdMaschinenvorbelegeung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmdMaschinenvorbelegeung1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSmdMaschinenvorbelegeung1ActionPerformed

    private void jTextFieldKuerzelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKuerzelActionPerformed
        // TODO add your handling code here
     
    }//GEN-LAST:event_jTextFieldKuerzelActionPerformed

    private void jButtonTHTMaterialKopierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTHTMaterialKopierenActionPerformed
        // TODO add your handling code here:
        if (jTextFieldKuerzel.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Bitte geben Sie Ihr gültiges Mitarbeiterkürzel ein", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else {
            stammdaten.setUser(jTextFieldKuerzel.getText());
            new TraceTHTMaterialKopieren().setVisible(true);
        }
    }//GEN-LAST:event_jButtonTHTMaterialKopierenActionPerformed

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
            java.util.logging.Logger.getLogger(TraceStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraceStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraceStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraceStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraceStart().setVisible(true);
                stammdaten = new Stammdaten();
             }
        });
    }
    
    public static Stammdaten stammdaten;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSmdMaschinenvorbelegeung;
    private javax.swing.JButton jButtonSmdMaschinenvorbelegeung1;
    private javax.swing.JButton jButtonSmdRuesten;
    private javax.swing.JButton jButtonSmdRuesten1;
    private javax.swing.JButton jButtonTHTMaterial;
    private javax.swing.JButton jButtonTHTMaterial1;
    private javax.swing.JButton jButtonTHTMaterialKopieren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldKuerzel;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
