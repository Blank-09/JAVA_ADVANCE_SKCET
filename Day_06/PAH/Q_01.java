import java.util.*;

class Gift {
    private int amount;
    public static int totalAmount = 0;
    
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int n) {
        amount = n;
        Gift.totalAmount += n;
    }
    
    public static void display() {
        System.out.println("Total amount of gifts: " + Gift.totalAmount);
    }
}

class Mobile extends Gift {}
class Laptop extends Gift {}
class Bike extends Gift {}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Gift g1 = new Gift();
        Gift g2 = new Gift();
        Gift g3 = new Gift();
        
        int cost = sc.nextInt();
        
        g1.setAmount(cost);
        g2.setAmount(cost);
        g2.setAmount(sc.nextInt());
        
        g1.display();
    }
}