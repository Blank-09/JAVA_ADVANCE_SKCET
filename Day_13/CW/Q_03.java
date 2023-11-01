import java.util.*;
import java.sql.*;

public class Main {
    
    static String DRIVER = "com.mysql.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost/ri_db";

    static String USER = "test";
    static String PWD  = "test123";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PWD);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?)");
            ps.setInt(1, sc.nextInt());
            ps.setString(2, sc.next());
            ps.setInt(3, sc.nextInt());
            ps.execute();
        }
        
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM STUDENT");
        
        while (rs.next()) {
            System.out.printf("%s %s %s\n", rs.getInt(1), rs.getString(2), rs.getInt(3));
        }
    }
}