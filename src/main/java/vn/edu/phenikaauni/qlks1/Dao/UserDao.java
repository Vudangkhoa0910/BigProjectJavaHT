
package vn.edu.phenikaauni.qlks1.Dao;

import vn.edu.phenikaauni.qlks1.Entity.User;


public class UserDao {
    public static boolean checkUser(User user){
        if (user.getUserName().equals("admin") && user.getPassword().equals("admin")){
            return true;
        }
        return false;
    }
}
