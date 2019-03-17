/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

/**
 *
 * @author dimashv
 */
public class Tanggal {
    private static String cariTanggal;
    
    public static void setCariTanggal(String cariTanggal){
        Tanggal.cariTanggal = cariTanggal;
        
    }
    
    public static String getCariTanggal(){
    return cariTanggal;
    }
}
