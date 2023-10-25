import java.util.*;

class Account {
    private int account_number, account_balance;
    
    int getAccountNumber() {
        return account_number;
    }
    
    int getAccountBalance() {
        return account_balance;
    }
    
    void setAccountNumber(int num) {
        account_number = num;
    }
    
    void setAccountBalance(int num) {
        account_balance = num;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Account[] account = new Account[n];
        
        for (int i = 0; i < n; i++) {
            account[i] = new Account();
            account[i].setAccountNumber(sc.nextInt());
            account[i].setAccountBalance(sc.nextInt());
        }
        
        int target = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (account[i].getAccountNumber() == target) {
                System.out.println(account[i].getAccountBalance());
                return;
            }
        }
        
        
        System.out.println("Account Number does not exist");
        
    }
}
