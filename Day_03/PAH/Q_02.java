import java.util.*;

class ItemType {
    private String name;
    private double deposit, costPerDay;
    
    // Default Constructor
    ItemType() {}
    
    // Parameterized Constructor
    ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    
    public String getName() {
        return name;
    }
    
    public void display() {
        System.out.println(name + " " + deposit + " " + costPerDay);
    }
}

class ItemTypeBO {
    public void search(String target, ItemType[] items) {
        for (var item : items) {
            if (item.getName().equals(target)) {
                item.display();
                return;
            }
        }
        
        
        System.out.println("Searched item Type not found");
    }
    
    public void display(ItemType[] items) {
        for (var item : items) {
            item.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ItemType[] items = new ItemType[n];
        
        for (int i = 0; i < n; i++) {
            items[i] = new ItemType(sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        
        ItemTypeBO ibo = new ItemTypeBO();
        
        ibo.search(sc.next(), items);
        ibo.display(items);
    }
}