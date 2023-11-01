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
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(MyNumbers) FROM Numbers");
        
        while (rs.next()) {
            System.out.println("Largest Single Number :" + rs.getInt(1));
        }

    }
}