/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend;

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
    
    public static String getUserByUsernamePass(String username, String password){
        return "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'";
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
    
    
    
}
