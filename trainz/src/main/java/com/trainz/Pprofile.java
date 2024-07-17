//
////ini Pprofile.java
//package com.trainz;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import com.trainz.ProfileModel;
//
//public class Pprofile implements ProsesLogin{
//
//    private Connection conn;
//
//    public Pprofile() {
//        try {
//            conn = connDB.configDB();
//        } catch (SQLException e) {
//            System.err.println("Error saat menghubungkan ke database: " + e.getMessage());
//        }
//    }
//    @Override
//    public void prosesLogin(ProfileModel pp_Model) {
//        PreparedStatement st = null;
//        ResultSet rs = null;
//        String Nama = null;
//        String NIM = null;
//        String NomorHP = null;
//        String AlamatLengkap = null;
//        String sql = "SELECT * from profile_mhs WHERE (nama_lengkap ='"+pp_Model.getNama_lengkap()+"'OR nim='"+pp_Model.getNim()
//                +"OR nomor_hp='"+pp_Model.getNomor_hp()+"OR alamat_lengkap ='"+pp_Model.getAlamat_lengkap();
//
//        try {
//            st = conn.prepareStatement(sql);
//            rs = st.executeQuery();
//            if (rs.next()){
//                Nama = rs.getString("nama_lengkap");
//                NIM = rs.getString("nim");
//                NomorHP = rs.getString("nomor_hp");
//                AlamatLengkap = rs.getString("alamat_lengkap");
//
//                ProfileModel pp = new ProfileModel();
//                pp.setNama_lengkap(Nama);
//                pp.setNim(NIM);
//                pp.setNomor_hp(NomorHP);
//                pp.setAlamat_lengkap(AlamatLengkap);
//
//                Profile profil = new Profile(pp);
//                profil.setVisible(true);
//
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//}
