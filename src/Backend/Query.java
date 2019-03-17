/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Date;

/**
 *
 * @author GHOST
 */
public class Query {
    
//  USER
    public static String getAllUser(){
        return "SELECT * FROM user WHERE 1";
    }
    
    public static String getUserById(int id){
        return "SELECT * FROM user WHERE id = "+id;
    }
    
    public static String getUserLoginByUsernamePass(String username, String password){
        return "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"';";
    }

    public static String getUserByUsernamePass(String username, String password){
        return "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"' AND role = 2";
    }
    
    public static String getAdminByUsernamePass(String username, String password){
        return "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"' AND role = 1";
    }
    
    public static String getUserByIdPass(int id, String password){
        return "SELECT * FROM user WHERE id='"+id+"' AND password='"+password+"'";
    }
    
    public static String addUser(String username, String password, int role, String nama, String nip, String unit_kerja){
        return "INSERT INTO `user` (`id`, `username`, `password`, `role`, `nama`, `nip`, `unit_kerja`) VALUES (NULL, '"+username+"', '"+password+"', '"+role+"', '"+nama+"', '"+nip+"', '"+unit_kerja+"');";
    }
    
    public static String updatePassword(int id, String password){
        return "UPDATE `user` SET `password` = '"+password+"' WHERE `user`.`id` = "+id+";";
    }
    
//  PENGAJUAN
    public static String getAllPengajuan(){
        return "SELECT * FROM pengajuan WHERE 1";
    }
    
    public static String getAllPengajuanAwal(){
        return "SELECT * FROM pengajuan WHERE status='Diajukan'";
    }
    
    public static String getPengajuanById(int id){
        return "SELECT * FROM pengajuan WHERE id = "+id;
    }
    
    public static String getAllPengajuanByIdUser(int id_user){
        return "SELECT * FROM pengajuan WHERE id_user = "+id_user;
    }
    
    public static String getAllPengajuanByTanggal(String tanggal_pengajuan){
        return "SELECT * FROM pengajuan WHERE tanggal_pengajuan = '"+tanggal_pengajuan+"';";
    }
    
    public static String updateStatusPengajuan(int id, String status){
        return "UPDATE `pengajuan` SET `status` = '"+status+"' WHERE `pengajuan`.`id` = "+id+";";
    }
    
    public static String updateStatusPengajuanByNopol(String nopol, String status){
        return "UPDATE `pengajuan` SET `status` = '"+status+"' WHERE `pengajuan`.`nopol` = '"+nopol+"';";
    }
    
    public static String addPengajuan(String nama_1, String nama_2, String nip_1, String nip_2, String jabatan_1, String jabatan_2, String alamat_1, String alamat_2, int id_user, String nopol, String merk, String jenis, String kondisi, Date tanggal_pengajuan){
        return "INSERT INTO `pengajuan` (`id`, `nama_1`, `nama_2`, `nip_1`, `nip_2`, `jabatan_1`, `jabatan_2`, `alamat_1`, `alamat_2`, `id_user`, `nopol`, `merk`, `jenis`, `kondisi`, `tanggal_pengajuan`, `status`) VALUES (NULL, '"+nama_1+"', '"+nama_2+"', '"+nip_1+"', '"+nip_2+"', '"+jabatan_1+"', '"+jabatan_2+"', '"+alamat_1+"', '"+alamat_2+"', '"+id_user+"', '"+nopol+"', '"+merk+"', '"+jenis+"', '"+kondisi+"', '"+tanggal_pengajuan+"', 'Diajukan');";
    }

//  Aset
    public static String getAllAset(){
        return "SELECT * FROM aset_tb WHERE 1";
    }
    
    public static String getAsetById(int id){
        return "SELECT * FROM aset_tb WHERE id = "+id;
    }
    
    public static String getAllAsetByIdUser(int id_user){
        return "SELECT * FROM aset_tb WHERE id_user = "+id_user;
    }
    
    public static String addAset(int id_user, String nup, String nama, String kondisi, String penggunaan,int nilai_perolehan, Date tanggal_kontrak, Date tanggal_akhir_kontrak){
        return "INSERT INTO `aset_tb` (`id`, `id_user`, `nup`, `nama`, `kondisi`, `penggunaan`, `nilai_perolehan`, `tanggal_kontrak`, `tanggal_akhir_kontrak`) VALUES (NULL, '"+id_user+"', '"+nup+"', '"+nama+"', '"+kondisi+"', '"+penggunaan+"', '"+nilai_perolehan+"', '"+tanggal_kontrak+"', '"+tanggal_akhir_kontrak+"');";
    }
    
    public static String updateAset(int id, int id_user, String nup, String nama, String kondisi, String penggunaan,int nilai_perolehan,Date tanggal_kontrak, Date tanggal_akhir_kontrak){
        return "UPDATE `aset_tb` SET `id_user` = '"+id_user+"', `nup` = '"+nup+"', `nama` = '"+nama+"', `kondisi` = '"+kondisi+"', `penggunaan` = '"+penggunaan+"', `nilai_perolehan` = '"+nilai_perolehan+"', `tanggal_kontrak` = '"+tanggal_kontrak+"', `tanggal_akhir_kontrak` = '"+tanggal_akhir_kontrak+"' WHERE `aset_tb`.`id` = "+id+";";
    }
    
    public static String deleteAset(int id){
        return "DELETE FROM `aset_tb` WHERE `aset_tb`.`id` = "+id;
    }
    
}
