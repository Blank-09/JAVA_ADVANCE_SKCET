import java.util.*;

class Stall {
    private String stallName, owner;
    private double stallArea, stallCost;
    
    Stall(String stallName, double stallArea, String owner, double stallCost) {
        this.stallName = stallName;
        this.stallArea = stallArea;
        this.stallCost = stallCost;
        this.owner = owner;
    }
    
    public boolean equals(Object s) {
        
        if (!(s instanceof Stall)) return false;
        
        Stall o = (Stall) s;
        
        return (
            stallName.equals(o.stallName) &&
            owner.equals(o.owner) &&
            stallArea == o.stallArea &&
            stallCost == o.stallCost
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stall s1 = new Stall(
            sc.nextLine(),
            Double.parseDouble(sc.nextLine()),
            sc.nextLine(),
            Double.parseDouble(sc.nextLine())
        );
        
        Stall s2 = new Stall(
            sc.nextLine(),
            Double.parseDouble(sc.nextLine()),
            sc.nextLine(),
            Double.parseDouble(sc.nextLine())
        );
        
        if (s1.equals(s2)) {
            System.out.println("Stalls are same");
        } else {
            System.out.println("Stalls are different");
        }
    } 
}