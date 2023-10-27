import java.util.*;

class Hall implements Comparable<Hall> {
    public String name, contactNumber, ownerName;
    public double costPerDay;
    
    Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }


    @Override
    public int compareTo(Hall o) {
        return (int) (costPerDay - o.costPerDay);
    }
    
    @Override
    public String toString() {
        return name + " " + contactNumber + " " + costPerDay + " " + ownerName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Hall> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            Hall hall = new Hall(
                sc.nextLine(),
                sc.nextLine(),
                Double.parseDouble(sc.nextLine()),
                sc.nextLine()
            );
            
            list.add(hall);
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}