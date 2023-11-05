import java.util.*;

class Factor implements Runnable {
    int n;
    Factor(int n) {
        this.n = n;
    }
    
    public void run() {
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.printf("%d is divisible by %d\n", n, i);
        }
        System.out.printf("%d is divisible by %d\n", n, n);
    }
}

class Factorial implements Runnable {
    int n;
    Factorial(int n) {
        this.n = n;
    }
    
    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
    
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Factorial : %d! = %d\n", i, factorial(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factor fr = new Factor(sc.nextInt());
        Factorial fl = new Factorial(sc.nextInt());
        
        Thread t1 = new Thread(fr);
        Thread t2 = new Thread(fl);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

    }
}