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
public class UserID {
    private static int ID;
    
    public static void setUserLogin(int ID){
        UserID.ID = ID;
        
    }
    
    public static int getUserLogin(){
    return ID;
    }
}
