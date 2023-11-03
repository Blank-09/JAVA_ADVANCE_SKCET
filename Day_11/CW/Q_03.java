import java.util.*;

class ItemType extends Thread {
    private String name;
    private double deposit,costPerItem;
    private int costPerDay;
    
    ItemType(String name, double deposit, double costPerItem, int costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerItem = costPerItem;
        this.costPerDay = costPerDay;
    }
    
    public void run() {
        System.out.printf("%.2f\n", costPerItem * costPerDay);
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        ItemType[] it = new ItemType[n];
        
        for(int i = 0; i < n; i++) {
            s.nextLine();
            it[i] = new ItemType(s.nextLine(), s.nextDouble(), s.nextDouble(), s.nextInt());
        }
        
        for(int i = 0; i < n; i++) {
            it[i].start();
        }
        
        for(int i = 0; i < n; i++) {
            it[i].join();
        }
    }
}