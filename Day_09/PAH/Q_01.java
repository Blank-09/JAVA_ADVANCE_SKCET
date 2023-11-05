import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class ItemType {
    private String name;
    private double deposit, costPerDay;
    
    ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
    
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s", name, deposit, costPerDay);
    }
}

class ArrayListObjectMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<ItemType> items = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
            items.add(
                new ItemType(sc.next(),sc.nextDouble(),sc.nextDouble())
            );
		}
		
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "Cost Per Day");
        
		for (ItemType item : items) {
		    System.out.println(item);
		}
	}
	
}
