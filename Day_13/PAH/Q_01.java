import java.util.*;
import java.sql.*;

class Stall {
    private int id;
    private String name;
    private double deposit;
    
    Stall(int id, String name, double deposit) {
        this.id = id;
        this.name = name;
        this.deposit = deposit;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s", id, name, deposit);
    }
}

class StallBO {
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost/ri_db";
    
    final static String USER = "test";
    final static String PWD = "test123";
    
    public static Stall getStall(int id) {
        
        Stall stall = null;
        
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PWD);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Stall WHERE ID=" + id);
            
            if (rs.next()) {
                stall = new Stall(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return stall;
    }
}

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int id = sc.nextInt();
        System.out.format("%-10s %-10s %-10s\n","ID","Name","Deposit");
        System.out.println(StallBO.getStall(id));
        
    }
}