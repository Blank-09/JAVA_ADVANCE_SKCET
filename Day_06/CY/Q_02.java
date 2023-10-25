import java.util.*;

public class Main {
    
    public static void calculate(int n) {
        System.out.printf("Square of %d: %d\n", n, n*n);
    }
    
    public static void calculate(int a, int b) {
        System.out.printf("Modulus of %d, %d: %d\n", a, b, a%b);
    }
    
    public static void calculate(float a, float b) {
        System.out.println("Quotient of " + a + ", " + b + ": " + a / b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        
        calculate(a);
        calculate(a, b);
        calculate(c, d);
    }
}