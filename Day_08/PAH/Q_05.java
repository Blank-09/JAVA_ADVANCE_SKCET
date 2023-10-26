import java.util.*;

class MyCalculator {
    long power(int n, int p) throws Exception {
    
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        
        if (n == 0 && p == 0) {
            throw new Exception("Both n and p should not be zero");
        }
    
        return (long) Math.pow(n, p);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        MyCalculator calc = new MyCalculator();
        
        try {
            System.out.println(calc.power(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}