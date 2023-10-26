import java.util.*;

class InsufficientBalanceException extends Exception {
    @Override
    public String toString() {
        return "Insufficient balance: Insufficient balance to perform the withdrawal.";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = sc.nextDouble();
        double withdrawal = sc.nextDouble();
        
        try {
            
            if (balance < withdrawal) 
                throw new InsufficientBalanceException();
            
            System.out.println("Transaction successful.");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println();
        sc.close();
    }
}