import java.util.*;

class Hall {
    private String name, contactNumber, ownerName;
    private double costPerDay;
    
    Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    
    boolean equals(Hall o) {
        return (
            name.equals(o.name) &&
            contactNumber.equals(o.contactNumber) &&
            ownerName.equals(o.ownerName) &&
            costPerDay == o.costPerDay
        );
    }
}

class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        Hall h1 = new Hall(sc.next(), sc.next(), sc.nextDouble(), sc.next());
        Hall h2 = new Hall(sc.next(), sc.next(), sc.nextDouble(), sc.next());
        
        if (h1.equals(h2))
            System.out.println("Halls are same");
        else
            System.out.println("Halls are different");

    }
}
