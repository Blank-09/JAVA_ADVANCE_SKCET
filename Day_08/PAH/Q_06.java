import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = null;
        int target = sc.nextInt();
        
        try {
            System.out.println(str);
            str.charAt(target);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}