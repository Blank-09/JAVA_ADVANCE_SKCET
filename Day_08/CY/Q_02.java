import java.util.*;

class InvalidBalance extends Exception {
    @Override
    public String toString() {
        return "Balance is less than 1000\nInvalidBalanceException";
    }
}

class Bank {
    private int accno;
    private String name;
    private double balance;
    
    Bank(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void display() {
        System.out.println(accno + " " + name + " " + balance);
    }
}

class BankBO {
    public static void validate(Bank b) throws Exception {
        if (b.getBalance() < 1000d)
            throw new InvalidBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank bank = new Bank(sc.nextInt(), sc.next(), sc.nextDouble());
        
        try {
            BankBO.validate(bank);
            bank.display();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        sc.close();
    }
}