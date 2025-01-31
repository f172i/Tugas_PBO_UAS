/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trainz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class FormPendaftaran extends javax.swing.JFrame {

   
    private MainMenu parentClass;
    
    public FormPendaftaran(MainMenu parentClass) {
        this.parentClass = parentClass;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAgama = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTglLahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtJenisKel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProdi = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAsalSklh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNilai2 = new javax.swing.JTextField();
        txtNilai5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNilai1 = new javax.swing.JTextField();
        txtNilai3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNilai4 = new javax.swing.JTextField();
        txtKonfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PENDAFTARAN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("FORMULIR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("PENDAFTARAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 56, -1, -1));

        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setText("Nama Lengkap");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 117, -1, -1));
        jPanel1.add(txtNamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 139, 167, 30));

        jLabel4.setText("Program Studi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 181, -1, -1));

        txtAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Kristen", "Hindu", "Budha", "Khonghucu" }));
        txtAgama.setSelectedIndex(-1);
        jPanel1.add(txtAgama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 170, 30));

        jLabel5.setText("Tanggal Lahir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 245, -1, -1));
        jPanel1.add(txtTglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 267, 167, 30));

        jLabel6.setText("* smt 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        txtJenisKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        txtJenisKel.setSelectedIndex(-1);
        jPanel1.add(txtJenisKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 331, 167, 30));

        jLabel7.setText("Nomor HP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 20));
        jPanel1.add(txtTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 170, 30));

        jLabel8.setText("Alamat");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        txtProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika (S1)", "Sistem Informasi (S1)", "Desain Komunikasi Visual (S1)", "Akuntansi (S1)", "Bahasa Inggris (S1)", "Sastra Jepang (S1)", "Kesehatan Masyarakat (S1)", "Rekam Medik & Info. Kes. (D3)", "Teknik Elektro (S1)", "Teknik Industri (S1)", "Kedokteran (S1)" }));
        txtProdi.setSelectedIndex(-1);
        jPanel1.add(txtProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 203, 167, 30));

        jLabel9.setText("Agama");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, 30));

        jLabel10.setText("Asal Sekolah");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 20));
        jPanel1.add(txtAsalSklh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 170, 30));

        jLabel11.setText("Jenis Kelamin");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 309, -1, -1));

        jLabel12.setText("Nilai kelas 3");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel13.setText("* smt 1");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));
        jPanel1.add(txtNilai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 50, -1));
        jPanel1.add(txtNilai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 50, -1));

        jLabel14.setText("Nilai kelas 1");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel15.setText("* smt 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel16.setText("* smt 2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));
        jPanel1.add(txtNilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 50, -1));
        jPanel1.add(txtNilai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 50, -1));

        jLabel17.setText("Nilai kelas 2");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jLabel18.setText("* smt 1");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));
        jPanel1.add(txtNilai4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 50, -1));

        txtKonfirm.setBackground(new java.awt.Color(0, 153, 153));
        txtKonfirm.setForeground(new java.awt.Color(255, 255, 255));
        txtKonfirm.setText("Konfirmasi");
        txtKonfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKonfirmActionPerformed(evt);
            }
        });
        jPanel1.add(txtKonfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void openMainMenu() {
        new MainMenu().setVisible(true);
        this.dispose(); // Close current window
    }

    private void simpanDataMahasiswa() {
        String sql = "INSERT INTO data_mhsbaru (nama_lengkap, program_studi, agama, tanggal_lahir, jenis_kelamin, nomor_hp, alamat, asal_sekolah, nilai_kelas1_smt1, nilai_kelas1_smt2, nilai_kelas2_smt1, nilai_kelas2_smt2, nilai_kelas3_smt1, nim) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            java.sql.Connection conn = (Connection) connDB.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, txtNamaLengkap.getText());
            String programStudi = (String) txtProdi.getSelectedItem();
            statement.setString(2, programStudi);
            statement.setString(3, (String) txtAgama.getSelectedItem());
            statement.setString(4, txtTglLahir.getText());
            statement.setString(5, (String) txtJenisKel.getSelectedItem());
            statement.setString(6, txtTelp.getText());
            statement.setString(7, txtAlamat.getText());
            statement.setString(8, txtAsalSklh.getText());
            statement.setDouble(9, parseNilai(txtNilai1.getText()));
            statement.setDouble(10, parseNilai(txtNilai2.getText()));
            statement.setDouble(11, parseNilai(txtNilai3.getText()));
            statement.setDouble(12, parseNilai(txtNilai4.getText()));
            statement.setDouble(13, parseNilai(txtNilai5.getText()));

            double rataRata = hitungRataRata();
            String message = null;
            if (rataRata >= 75) {
                String nim = generateNIM();
                statement.setString(14, nim);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data mahasiswa berhasil disimpan.");
                    message = "Selamat Anda dinyatakan lulus";
                    simpanDataProfileMahasiswa(txtNamaLengkap.getText(), txtAlamat.getText(), txtTelp.getText(), nim);
                    // Insert announcement into the announcements table
                    insertAnnouncement(nim, message);

                    // Tambahkan code untuk membuka Profile setelah data disimpan
//                    ProfileModel ppMhs = null;
//
//                    new Profile(ppMhs).setVisible(true);
                    parentClass.setNim(nim);                    
                    parentClass.setMessage(message);

                    resetForm();
                }
            } else {
                System.out.println("Rata-rata nilai kurang dari 75, data mahasiswa tidak disimpan.");
                message = "Anda dinyatakan tidak lolos";
                // Insert announcement into the announcements table
                insertAnnouncement(null, message);
                resetForm();
            }

            // Display the announcement message
//            FormPengumuman pengumuman = new FormPengumuman(message);
            new FormPengumuman(parentClass, message).setVisible(true);

        } catch (SQLException e) {
            System.err.println("Error saat menyimpan data mahasiswa: " + e.getMessage());
        }
    }

    private void insertAnnouncement(String nim, String message) {
        String sql = "INSERT INTO announcements (message, nim) VALUES (?, ?)";

        try {
            java.sql.Connection conn = (Connection) connDB.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, message);
            statement.setString(2, nim);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error saat menyimpan pengumuman: " + e.getMessage());
        }
    }

    // Metode untuk menyimpan data profile ke tabel profile_mhs
    private void simpanDataProfileMahasiswa(String namaLengkap, String alamatLengkap, String nomorHp, String nim) {
        String sql = "INSERT INTO profile_mhs (nama_lengkap, alamat_lengkap, nomor_hp, nim) VALUES (?, ?, ?, ?)";

        try {
            java.sql.Connection conn = (Connection)connDB.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, namaLengkap);
            statement.setString(2, alamatLengkap);
            statement.setString(3, nomorHp);
            statement.setString(4, nim);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data profile mahasiswa berhasil disimpan ke tabel profile_mhs.");
                System.out.println(namaLengkap);
            }
        } catch (SQLException e) {
            System.err.println("Error saat menyimpan data profile mahasiswa: " + e.getMessage());
        }
    }

    // Metode untuk menghitung rata-rata nilai
    private double hitungRataRata() {
        double nilai1 = parseNilai(txtNilai1.getText());
        double nilai2 = parseNilai(txtNilai2.getText());
        double nilai3 = parseNilai(txtNilai3.getText());
        double nilai4 = parseNilai(txtNilai4.getText());
        double nilai5 = parseNilai(txtNilai5.getText());

        return (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;
    }

    // Metode untuk mereset form setelah data disimpan
    private void resetForm() {
        txtNamaLengkap.setText("");
        txtProdi.setSelectedIndex(-1);
        txtAgama.setSelectedIndex(-1);
        txtTglLahir.setText("");
        txtJenisKel.setSelectedIndex(-1);
        txtTelp.setText("");
        txtAlamat.setText("");
        txtAsalSklh.setText("");
        txtNilai1.setText("");
        txtNilai2.setText("");
        txtNilai3.setText("");
        txtNilai4.setText("");
        txtNilai5.setText("");
    }

    // Metode untuk menghasilkan NIM berdasarkan program studi
    private String generateNIM() {
        String kodeProdi = ""; // Tentukan kode prodi berdasarkan pilihan
        switch (txtProdi.getSelectedIndex()) {
            case 0: kodeProdi = "A11"; break; // Teknik Informatika
            case 1: kodeProdi = "A12"; break; // Sistem Informasi
            case 2: kodeProdi = "A14"; break; // Desain Komunikasi Visual
            case 3: kodeProdi = "B12"; break; // Akuntansi
            case 4: kodeProdi = "C11"; break; // Bahasa Inggris
            case 5: kodeProdi = "D11"; break; // Kesehatan Masyarakat
            case 6: kodeProdi = "D22"; break; // Rekam Medik & Info. Kes.
            case 7: kodeProdi = "E11"; break; // Teknik Elektro
            case 8: kodeProdi = "E12"; break; // Teknik Industri
            case 9: kodeProdi = "K11"; break; // Kedokteran
            default: break;
        }

        String newNIM = kodeProdi + "0001"; // Default NIM if no existing NIM found

        String sql = "SELECT nim FROM data_mhsbaru WHERE nim LIKE ? ORDER BY nim DESC LIMIT 1";

        try {
            java.sql.Connection conn = (Connection) connDB.configDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, kodeProdi + "%");
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String lastNIM = resultSet.getString("nim");
                int lastNIMNumber = Integer.parseInt(lastNIM.substring(3));
                int newNIMNumber = lastNIMNumber + 1;
                newNIM = kodeProdi + String.format("%04d", newNIMNumber);
            }
        } catch (SQLException e) {
            System.err.println("Error saat menghasilkan NIM: " + e.getMessage());
        }

        return newNIM;
    }

    // Metode untuk mengubah String nilai menjadi double
    private double parseNilai(String nilai) {
        try {
            // Hapus spasi dan koma jika ada
            String cleanedNilai = nilai.replace(",", "").trim();
            // Konversi ke double
            return Double.parseDouble(cleanedNilai);
        } catch (NumberFormatException e) {
            // Handle jika input tidak valid, misalnya tampilkan pesan error atau nilai default
            System.err.println("Error parsing nilai: " + e.getMessage());
            return 0.0; // Nilai default jika terjadi kesalahan
        }
    }


    private void txtKonfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKonfirmActionPerformed
        MainMenu MainMenuFrame = new MainMenu();
        MainMenuFrame.setVisible(true);
        MainMenuFrame.pack();
        MainMenuFrame.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_txtKonfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new FormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> txtAgama;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAsalSklh;
    private javax.swing.JComboBox<String> txtJenisKel;
    private javax.swing.JButton txtKonfirm;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JTextField txtNilai1;
    private javax.swing.JTextField txtNilai2;
    private javax.swing.JTextField txtNilai3;
    private javax.swing.JTextField txtNilai4;
    private javax.swing.JTextField txtNilai5;
    private javax.swing.JComboBox<String> txtProdi;
    private javax.swing.JTextField txtTelp;
    private javax.swing.JTextField txtTglLahir;
    // End of variables declaration//GEN-END:variables
}
