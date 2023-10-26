import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            count++;
        }
        
        System.out.println(
            "Count of all digits: " +  count
        );
    }
}