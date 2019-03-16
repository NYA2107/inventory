/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Model.Pengajuan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GHOST
 */
public class PengajuanController {
        private LinkedList<Pengajuan> fillList(ResultSet rs){
        LinkedList<Pengajuan> result = new LinkedList<>();
        try {
            while (rs.next()) {
                result.add(new Pengajuan(
                        rs.getInt("id"),
                        rs.getString("nama_1"),
                        rs.getString("nama_2"),
                        rs.getString("nip_1"),
                        rs.getString("nip_2"),
                        rs.getString("jabatan_1"),
                        rs.getString("jabatan_2"),
                        rs.getString("alamat_1"),
                        rs.getString("alamat_2"),
                        rs.getInt("id_user"),
                        rs.getString("nopol"),
                        rs.getString("merk"),
                        rs.getString("jenis"),
                        rs.getString("kondisi"),
                        rs.getDate("tanggal_pengajuan"),
                        rs.getString("status")
                ));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    private Pengajuan fill(ResultSet rs){
        try {
            while (rs.next()) {
                return new Pengajuan(
                        rs.getInt("id"),
                        rs.getString("nama_1"),
                        rs.getString("nama_2"),
                        rs.getString("nip_1"),
                        rs.getString("nip_2"),
                        rs.getString("jabatan_1"),
                        rs.getString("jabatan_2"),
                        rs.getString("alamat_1"),
                        rs.getString("alamat_2"),
                        rs.getInt("id_user"),
                        rs.getString("nopol"),
                        rs.getString("merk"),
                        rs.getString("jenis"),
                        rs.getString("kondisi"),
                        rs.getDate("tanggal_pengajuan"),
                        rs.getString("status")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    
// -------------------------------------------------------------------------------------------------
    public LinkedList<Pengajuan> getAllPengajuan() throws SQLException{
        ResultSet rs = KoneksiDB.executeQuery(Query.getAllPengajuan());
        return fillList(rs); 
    }
    
    public LinkedList<Pengajuan> getAllPengajuanAwal() throws SQLException{
        ResultSet rs = KoneksiDB.executeQuery(Query.getAllPengajuanAwal());
        return fillList(rs); 
    }
    
    
    public Pengajuan getPengajuanById(int id){
        ResultSet rs = KoneksiDB.executeQuery(Query.getPengajuanById(id));
        return fill(rs);
    }
    
    public Pengajuan getPengajuanByIdUser(int id_user){
        ResultSet rs = KoneksiDB.executeQuery(Query.getPengajuanByIdUser(id_user));
        return fill(rs);
    }
    
    public boolean updateStatusPengajuan(int id, String status){
        int rs = KoneksiDB.execute(Query.updateStatusPengajuan(id, status));
        return rs == 1;
    }
    
    public boolean updateStatusPengajuanByNopol(String nopol, String status){
        int rs = KoneksiDB.execute(Query.updateStatusPengajuanByNopol(nopol, status));
        return rs == 1;
    }
    
    //status diajukan
    public boolean addPengajuan(String nama_1, String nama_2, String nip_1, String nip_2, String jabatan_1, String jabatan_2, String alamat_1, String alamat_2, int id_user, String nopol, String merk, String jenis, String kondisi, Date tanggal_pengajuan){
        int rs = KoneksiDB.execute(Query.addPengajuan(nama_1, nama_2, nip_1, nip_2, jabatan_1, jabatan_2, alamat_1, alamat_2, id_user, nopol, merk, jenis, kondisi, tanggal_pengajuan));
        return rs == 1;
    }
    
}
