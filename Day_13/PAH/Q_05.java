import java.util.*;
import java.sql.*;

public class Main {
    
    final static String URL = "jdbc:mysql://localhost/ri_db";
    
    final static String USER = "test";
    final static String PWD = "test123";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PWD);
    
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        
        while (rs.next()) {
            System.out.printf(
                "%d %s %d %d %d\n", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
        }

    }
}