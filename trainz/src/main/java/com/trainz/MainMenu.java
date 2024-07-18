/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trainz;



public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
    }

    MainMenu(MainMenu parentClass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFormPendaftaran = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnPengumuman = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MENU UTAMA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 50, -1, -1));

        btnFormPendaftaran.setBackground(new java.awt.Color(0, 153, 153));
        btnFormPendaftaran.setText("Pendaftarn");
        btnFormPendaftaran.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFormPendaftaran.setContentAreaFilled(false);
        btnFormPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormPendaftaranActionPerformed(evt);
            }
        });
        jPanel1.add(btnFormPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 20));
        btnFormPendaftaran.getAccessibleContext().setAccessibleDescription("");

        btnPembayaran.setBackground(new java.awt.Color(0, 153, 153));
        btnPembayaran.setText("Pembayaran");
        btnPembayaran.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPembayaran.setContentAreaFilled(false);
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });
        jPanel1.add(btnPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, 20));

        btnPengumuman.setBackground(new java.awt.Color(0, 153, 153));
        btnPengumuman.setText("Pengumuman");
        btnPengumuman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPengumuman.setContentAreaFilled(false);
        btnPengumuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengumumanActionPerformed(evt);
            }
        });
        jPanel1.add(btnPengumuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 110, -1));

        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Logout");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnProfile.setForeground(new java.awt.Color(0, 153, 153));
        btnProfile.setText("Profile");
        btnProfile.setContentAreaFilled(false);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String nimDisimpan;
    String message;
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setNim(String nim){
        this.nimDisimpan = nim;
    }
    
    public String getNim() {
        return this.nimDisimpan;
    }
    
    private void btnFormPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormPendaftaranActionPerformed
        this.setVisible(false); 
        new FormPendaftaran(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFormPendaftaranActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
        this.setVisible(false);
        new FormPembayaran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnPengumumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengumumanActionPerformed
        this.setVisible(false);
        new FormPengumuman(this, message).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPengumumanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
       Profile ProfileFrame = new Profile();
       ProfileFrame.setVisible(true);
       ProfileFrame.pack();
       ProfileFrame.setLocationRelativeTo(null);
       this.dispose();

       
    }//GEN-LAST:event_btnProfileActionPerformed



  
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormPendaftaran;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPengumuman;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
