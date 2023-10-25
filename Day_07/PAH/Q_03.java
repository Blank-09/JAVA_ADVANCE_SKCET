import java.util.*;

abstract class AbstractClass {
    abstract int getValue();
    abstract int divisorSum(int n);
}

class Calculator extends AbstractClass {
    int n = 0;
    
    int getValue() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }
    
    int divisorSum(int n) {
        
        if (n <= 0) {
            return 0;
        }
        
        int sum = 1;
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int n = calc.getValue();
        
        System.out.println(calc.divisorSum(n));
    } 
}