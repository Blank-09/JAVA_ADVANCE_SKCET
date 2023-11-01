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
        PreparedStatement ps = con.prepareStatement("INSERT INTO OFFICE VALUES (?,?,?)");
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ps.setInt(1, sc.nextInt());
            ps.setString(2, sc.next());
            ps.setInt(3, sc.nextInt());
            ps.execute();
        }
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM OFFICE WHERE ESALARY BETWEEN 10000 AND 50000");
        
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }

    }
}