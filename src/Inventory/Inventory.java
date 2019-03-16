/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;


import Model.Pengajuan;
import Model.User;
import Backend.PengajuanController;
import Backend.UserController;
import Frontend.Login;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 *
 * @author GHOST
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

//        UserController user = new UserController();
//        PengajuanController pengajuan = new PengajuanController();
//List
//        LinkedList<Pengajuan> record = pengajuan.getAllPengajuan();
//        for (Pengajuan data : record) {
//	  System.out.println("Id : "+data.id);
//          System.out.println("Nama 1 : "+data.nama_1);
//          System.out.println(data.tanggal_pengajuan);
//        }

//Add
//        System.out.println(user.addUser("Infinity", "power", 1, "Infinity Power", "2121", "Alfamart"));

//Update
//        System.out.println(user.updatePassword(1,"password1"));

//Specific
//          User rec = user.getUserByUsernamePass("imam2107","imam2107");
//          if(rec != null){
//              System.out.println(rec.nama);
//          }else{
//              System.out.println("data tidak ditemukan");
//          }
          
        
    }
    
}
