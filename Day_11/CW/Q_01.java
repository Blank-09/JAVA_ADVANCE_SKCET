import java.util.*;

class Account extends Thread {
    
    private String accountNumber, accountHoldername;
    private double balance;
    
    Account(String accountNumber, double balance, String accountHoldername) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHoldername = accountHoldername;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void run() {
        double interest = 0;
        if (balance >= 10_000)
            interest = balance * 0.08;
        else
            interest = balance * 0.05;
        balance = balance + interest;
        System.out.printf("%.2f\n", interest);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Account[] accounts = new Account[n];
        for (int i = 0; i < n; i++) {
            accounts[i] = new Account(sc.next(), sc.nextDouble(), sc.next());
        }
        
        for (int i = 0; i < n; i++) {
            accounts[i].start();    
            accounts[i].join();
            System.out.printf("%.2f\n", accounts[i].getBalance());
        }
        
    }
}
