import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = null;
        
        try {
            System.out.println(a);
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        
        sc.close();
    }
}