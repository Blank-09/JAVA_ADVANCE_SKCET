import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int p = 1, i = 1;
        while (p < n) {
            p *= ++i;
        }
        
        if (i % 2 == 0)
            System.out.println(n + " Michael wins");
        else
            System.out.println(n + " John wins");

    }
}