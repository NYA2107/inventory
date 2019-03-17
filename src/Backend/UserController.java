/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

//import java.sql.*;
import java.util.LinkedList;
import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GHOST
 */
public class UserController {
    
    private LinkedList<User> fillList(ResultSet rs){
        LinkedList<User> result = new LinkedList<>();
        try {
            while (rs.next()) {
                result.add(new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getString("nama"),
                        rs.getString("nip"),
                        rs.getString("unit_kerja")
                ));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    private User fill(ResultSet rs){
        try {
            while (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getString("nama"),
                        rs.getString("nip"),
                        rs.getString("unit_kerja")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    
// -------------------------------------------------------------------------------------------------
    public LinkedList<User> getAllUser() throws SQLException{
        ResultSet rs = KoneksiDB.executeQuery(Query.getAllUser());
        return fillList(rs);
        
    }
    
    public User getUserById(int id){
        ResultSet rs = KoneksiDB.executeQuery(Query.getUserById(id));
        return fill(rs);
    }
    
    public User getUserByUsernamePass(String username, String password){
        ResultSet rs = KoneksiDB.executeQuery(Query.getUserByUsernamePass(username, password));
        return fill(rs);
    }
    
    public User getAdminByUsernamePass(String username, String password){
        ResultSet rs = KoneksiDB.executeQuery(Query.getAdminByUsernamePass(username, password));
        return fill(rs);
    }
    
    public User getUserByIdPass(int id, String password){
        ResultSet rs = KoneksiDB.executeQuery(Query.getUserByIdPass(id, password));
        return fill(rs);
    }
    
    public boolean addUser(String username, String password, int role, String nama, String nip, String unit_kerja){
        int rs = KoneksiDB.execute(Query.addUser(username, password, role, nama, nip, unit_kerja));
        return rs == 1;
    }
    
    public boolean updatePassword(int id, String password){
        int rs = KoneksiDB.execute(Query.updatePassword(id, password));
        return rs == 1;
    }
    
}
