/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Model.Aset;
import Model.Pengajuan;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GHOST
 */
public class AsetController {
    private LinkedList<Aset> fillList(ResultSet rs){
        LinkedList<Aset> result = new LinkedList<>();
        try {
            while (rs.next()) {
                result.add(new Aset(
                        rs.getInt("id"),
                        rs.getString("nup"),
                        rs.getString("nama"),
                        rs.getString("kondisi"),
                        rs.getString("penggunaan"),
                        rs.getInt("nilai_perolehan"),
                        rs.getDate("tanggal_kontrak"),
                        rs.getDate("tanggal_akhir_kontrak")
                ));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    private Aset fill(ResultSet rs){
        try {
            while (rs.next()) {
                return new Aset(
                        rs.getInt("id"),
                        rs.getString("nup"),
                        rs.getString("nama"),
                        rs.getString("kondisi"),
                        rs.getString("penggunaan"),
                        rs.getInt("nilai_perolehan"),
                        rs.getDate("tanggal_kontrak"),
                        rs.getDate("tanggal_akhir_kontrak")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    
// -------------------------------------------------------------------------------------------------
//    public LinkedList<Pengajuan> getAllPengajuan() throws SQLException{
//        ResultSet rs = KoneksiDB.executeQuery(Query.getAllPengajuan());
//        return fillList(rs); 
//    }
//    
//    public LinkedList<Pengajuan> getAllPengajuanAwal() throws SQLException{
//        ResultSet rs = KoneksiDB.executeQuery(Query.getAllPengajuanAwal());
//        return fillList(rs); 
//    }
//    
//    
//    public Pengajuan getPengajuanById(int id){
//        ResultSet rs = KoneksiDB.executeQuery(Query.getPengajuanById(id));
//        return fill(rs);
//    }
//    
//    public Pengajuan getPengajuanByIdUser(int id_user){
//        ResultSet rs = KoneksiDB.executeQuery(Query.getPengajuanByIdUser(id_user));
//        return fill(rs);
//    }
//    
//    public boolean updateStatusPengajuan(int id, String status){
//        int rs = KoneksiDB.execute(Query.updateStatusPengajuan(id, status));
//        return rs == 1;
//    }
    
    //status diajukan
//    public boolean addPengajuan(String nama_1, String nama_2, String nip_1, String nip_2, String jabatan_1, String jabatan_2, String alamat_1, String alamat_2, int id_user, String nopol, String merk, String jenis, String kondisi, Date tanggal_pengajuan){
//        int rs = KoneksiDB.execute(Query.addPengajuan(nama_1, nama_2, nip_1, nip_2, jabatan_1, jabatan_2, alamat_1, alamat_2, id_user, nopol, merk, jenis, kondisi, tanggal_pengajuan));
//        return rs == 1;
//    }
}
