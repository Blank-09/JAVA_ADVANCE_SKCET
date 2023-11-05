import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Hall {
    private String name, contactNumber, ownerName;
    private double costPerDay;
    
    Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s", name, contactNumber, costPerDay, ownerName);
    }
}

class ArrayListObjectMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.nextLine();
		
		List<Hall> items = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
            items.add(
                new Hall(
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    sc.nextLine()
                )
            );
		}
		
		int index = sc.nextInt();
		
		if (items.isEmpty()) {
		    System.out.println("The list is empty");
		    return;
		}
		
		// Remove
		items.remove(index);
		
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost Per Day", "Owner Name");
        
		for (Hall item : items) {
		    System.out.println(item);
		}
	}
	
}
