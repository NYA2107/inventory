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
public class Pengajuan {
    public String nama_1, nama_2, nip_1, nip_2, jabatan_1, jabatan_2, alamat_1, alamat_2, nopol, merk, jenis, kondisi, status;
    public int id, id_user;
    public Date tanggal_pengajuan;

    public Pengajuan(int id, String nama_1, String nama_2, String nip_1, String nip_2, String jabatan_1, String jabatan_2, String alamat_1, String alamat_2, int id_user, String nopol, String merk, String jenis, String kondisi, Date tanggal_pengajuan, String status){
        this.id = id;
        this.nama_1 = nama_1;
        this.nama_2 = nama_2;
        this.nip_1 = nip_1;
        this.nip_2 = nip_2;
        this.jabatan_1 = jabatan_1;
        this.jabatan_2 = jabatan_2;
        this.alamat_1 = alamat_1;
        this.alamat_2 = alamat_2;
        this.id_user = id_user;
        this.nopol = nopol;
        this.merk = merk;
        this.jenis = jenis;
        this.kondisi = kondisi;
        this.tanggal_pengajuan = tanggal_pengajuan;
        this.status = status;
    }


}
