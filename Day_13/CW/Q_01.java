import java.util.*;
import java.sql.*;

public class Main {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ri_db";
    
    static final String USER = "test";
    static final String PWD = "test123";


    public static void main(String[] args) {
        Connection con = null;
        
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PWD);
            var smt = con.createStatement();
            
            String sql;
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                sql = "INSERT INTO BILL VALUES (?,?,?,?,?)";
                var st = con.prepareStatement(sql);
                
                st.setInt(1, sc.nextInt());
                st.setString(2, sc.next());
                st.setString(3, sc.next());
                st.setString(4, sc.next());
                st.setFloat(5, sc.nextFloat());
                
                st.execute();
            }
            
            String query = sc.next();
            sql = "SELECT * FROM BILL WHERE DNAME='" + query + "'";
            
            ResultSet rs = smt.executeQuery(sql);
            int count = 0;
            
            while (rs.next()) {
                count++;
                System.out.printf("%s %s %s %s %s",
                    rs.getInt("SID"), rs.getString("SNAME"), rs.getString("DNAME"),
                    rs.getString("ADDRESS"), rs.getFloat("GPA"));
            }
            
            if (count == 0) {
                System.out.printf("No students in %s department", query);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
