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
        PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE dept=? AND cgpa > ?");
        
        ps.setString(1, sc.next());
        ps.setInt(2, sc.nextInt());
        ps.execute();
    
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        
        while (rs.next()) {
            System.out.println(
                rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " +
                rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + 
                rs.getString(7) + " " +  rs.getString(8) + " " + rs.getString(9)
            );
        }

    }
}