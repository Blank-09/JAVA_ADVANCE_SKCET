import java.sql.*;
import java.util.*;

public class Main {
    
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost/ri_db";
    
    static String USER = "test";
    static String PWD = "test123";
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Class.forName(JDBC_DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PWD);
        
        Statement smt = con.createStatement();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE gender=? AND dept=?");
        ps.setString(1, sc.next());
        ps.setString(2, sc.next());
        
        ResultSet st = ps.executeQuery();
        while (st.next()) {
            System.out.printf("Employee ID : %s Name : %s %s\n",
                st.getInt("emp_no"), st.getString("first_name"), st.getString("last_name"));
        }
    }
}