/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author GHOST
 */
public class Aset {
    int id;
    String nup;
    String nama; 
    String kondisi; 
    String penggunaan; 
    int nilai_perolehan;
    Date tanggal_kontrak; 
    Date tanggal_akhir_kontrak;
    
    public Aset(int id, String nup, String nama, String kondisi, String penggunaan,int nilai_perolehan,Date tanggal_kontrak, Date tanggal_akhir_kontrak){
        this.id = id;
        this.nup = nup;
        this.nama = nama;
        this.kondisi = kondisi;
        this.penggunaan = penggunaan;
        this.nilai_perolehan = nilai_perolehan;
        this.tanggal_kontrak = tanggal_kontrak;
        this.tanggal_akhir_kontrak = tanggal_akhir_kontrak;
    }
}
