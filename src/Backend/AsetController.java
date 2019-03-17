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
                        rs.getInt("id_user"),
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
                        rs.getInt("id_user"),
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
    public LinkedList<Aset> getAllAset() throws SQLException{
        ResultSet rs = KoneksiDB.executeQuery(Query.getAllAset());
        return fillList(rs); 
    }
    
    public LinkedList<Aset> getAllAsetByIdUser(int id_user) throws SQLException{
        ResultSet rs = KoneksiDB.executeQuery(Query.getAllAsetByIdUser(id_user));
        return fillList(rs); 
    }
    
    public Aset getAsetById(int id){
        ResultSet rs = KoneksiDB.executeQuery(Query.getAsetById(id));
        return fill(rs);
    }
    
    public boolean addAset(int id_user, String nup, String nama, String kondisi, String penggunaan,int nilai_perolehan,Date tanggal_kontrak, Date tanggal_akhir_kontrak){
        int rs = KoneksiDB.execute(Query.addAset(id_user, nup, nama, kondisi, penggunaan,nilai_perolehan,tanggal_kontrak, tanggal_akhir_kontrak));
        return rs == 1;
    }
    
    public boolean updateAset(int id, int id_user, String nup, String nama, String kondisi, String penggunaan,int nilai_perolehan,Date tanggal_kontrak, Date tanggal_akhir_kontrak){
        int rs = KoneksiDB.execute(Query.updateAset(id, id_user, nup, nama, kondisi, penggunaan,nilai_perolehan,tanggal_kontrak, tanggal_akhir_kontrak));
        return rs == 1;
    }
    
    public boolean updateAset(int id){
        int rs = KoneksiDB.execute(Query.deleteAset(id));
        return rs == 1;
    }
    
    
}
