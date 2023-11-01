import java.util.*;
import java.sql.*;

public class Main {
    
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost/ri_db";
    
    final static String USER = "test";
    final static String PWD =  "test123";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PWD);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO OFFICE VALUES (?,?,?)");
            ps.setInt(1, sc.nextInt());
            ps.setString(2, sc.next());
            ps.setString(3, sc.next());
            ps.execute();
        }
        
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM OFFICE WHERE DESIGNATION IN ('elon','sapiens','jarvis')");
        
        while (rs.next()) {
            System.out.printf(
                "%s %s %s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
        }

    }
}
