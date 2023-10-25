import java.util.*;

class Account {
    private int account_no;
    private int account_balance;
    
    public int getAccountNo() {
        return account_no;
    }
    
    public int getAccountBalance() {
        return account_balance;
    }
    
    public void setAccountNo(int n) {
        account_no = n;
    }
    
    public void setAccountBalance(int n) {
        account_balance = n;
    }
}

class User extends Account {
    public String username;
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        
        for (int i = 0; i < n; i++) {
            users[i] = new User();
            users[i].setAccountNo(sc.nextInt());
            users[i].setAccountBalance(sc.nextInt());
            users[i].username = sc.next();
        }
        
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (users[i].getAccountNo() == target) {
                System.out.println(users[i].getAccountBalance());
                return;
            }
        }
        
        System.out.println("Account Number does not exist");

    }
}