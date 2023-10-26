import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int target = sc.nextInt();
        
        try {
            System.out.print(str.charAt(target));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print(e);
        }
    }
}