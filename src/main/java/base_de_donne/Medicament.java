/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_donne;

import Application.Parametre;
import Application.ResultSetTableModel;
import Application.BDD;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;








public class Medicament extends javax.swing.JFrame {

   ResultSet rs;
   BDD db;
   
   
    public Medicament() {
        db= new BDD(new Parametre() .HOST_DB,new Parametre() .USERNAME_DB,
                new Parametre() .PASSWORD_DB,new Parametre() .IPHOST,new Parametre() .PORT);
        initComponents();
        table();
    }
    
     public void table(){
        String a [] = {"id", "id_user", "username", "password", "type"};
        rs = db.querySelect(a, "Utilisateur");
        Table_med.setModel(new ResultSetTableModel(rs));
    }
    void Actualiser(){
        txt_nom.setText("");
        txt_four.setText("");
        txt_ref.setText("");
        //com_.setSelectedItem("type");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_med = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JLabel();
        txt_nom = new javax.swing.JLabel();
        txt_ref = new javax.swing.JLabel();
        txt_rang = new javax.swing.JLabel();
        txt_four = new javax.swing.JLabel();
        txt_prix = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel1.setText("Gestion Des Medicaments");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(105, 19, 440, 44);

        Table_med.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table_med);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 60, 590, 90);

        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButton2.setText("Ajouter");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(10, 190, 130, 29);

        jToggleButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButton3.setText("Modifier");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(135, 190, 95, 29);

        jToggleButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButton4.setText("Supprimer");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(210, 190, 130, 29);

        jToggleButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButton5.setText("Actualiser");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(310, 190, 140, 29);

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel8.setText("rangement");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 370, 90, 23);

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel9.setText("nom_medicament");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 260, 140, 23);

        jLabel10.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel10.setText("reference");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 320, 90, 23);

        jLabel12.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel12.setText("fournisseur");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 410, 110, 50);

        jLabel13.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel13.setText("prix");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(240, 280, 70, 50);

        jLabel14.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel14.setText("stock");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(220, 350, 70, 50);

        txt_stock.setText("jLabel2");
        getContentPane().add(txt_stock);
        txt_stock.setBounds(310, 370, 60, 14);

        txt_nom.setText("jLabel2");
        getContentPane().add(txt_nom);
        txt_nom.setBounds(160, 270, 60, 14);

        txt_ref.setText("jLabel2");
        getContentPane().add(txt_ref);
        txt_ref.setBounds(150, 320, 70, 14);

        txt_rang.setText("jLabel2");
        getContentPane().add(txt_rang);
        txt_rang.setBounds(150, 370, 70, 14);

        txt_four.setText("jLabel2");
        getContentPane().add(txt_four);
        txt_four.setBounds(140, 420, 60, 14);

        txt_prix.setText("jLabel2");
        getContentPane().add(txt_prix);
        txt_prix.setBounds(320, 310, 60, 14);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(600, 330, 90, 14);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Recherche par categorie");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 250, 240, 29);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Recherche");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(450, 320, 120, 29);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(0, 0, 57, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(0, 0, 57, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nom_medicament", "reference", "fournisseur", "rangement", "prix", "stock" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(610, 250, 109, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_med;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JLabel txt_four;
    private javax.swing.JLabel txt_nom;
    private javax.swing.JLabel txt_prix;
    private javax.swing.JLabel txt_rang;
    private javax.swing.JLabel txt_ref;
    private javax.swing.JLabel txt_stock;
    // End of variables declaration//GEN-END:variables
}
