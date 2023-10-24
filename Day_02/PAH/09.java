import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int k = n, l = m;
        
        while (k != l) {
            if (k > l) l += m;
            else k += n;
        }
        
        System.out.println(k);
    }
}