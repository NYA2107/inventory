/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author GHOST
 */
public class User {
    
    public String nama, username, password, nip, unit_kerja;
    public int id, role;
    
    
    public User(int id, String username, String password, int role, String nama, String nip, String unit_kerja){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.nama = nama;
        this.nip = nip;
        this.unit_kerja = unit_kerja;
    }
}
