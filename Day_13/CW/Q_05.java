import java.util.*;
import java.sql.*;

public class Main {
    
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost/ri_db";
    
    final static String USER = "test";
    final static String PWD = "test123";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PWD);
        
        String username = sc.next();
        String password = sc.next();
        
        PreparedStatement ps = con.prepareStatement("SELECT * FROM userdetails WHERE user_name=? AND pass_word=?");
        ps.setString(1, username);
        ps.setString(2, password);
        
        ResultSet rs = ps.executeQuery();
        
        boolean isLogin = false;
        
        if (rs.next()) {
            isLogin = true;
        }
        
        if (isLogin)
            System.out.println("Login Successful");
        else
            System.out.println("Invalid username/password");
        
    }
}