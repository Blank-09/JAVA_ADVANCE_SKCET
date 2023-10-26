import java.util.*;
import java.io.*;

class ItemType {
    String name;
    double depoisit, costPerDay;
    
    ItemType(String name, double depoisit, double costPerDay) {
        this.name = name;
        this.depoisit = depoisit;
        this.costPerDay = costPerDay;
    }
    
    @Override
    public String toString() {
        return name + " " + depoisit + " " + costPerDay;
    }
}

public class Main {
    public static void main(String[] args) {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String name = sc.readLine();
            double depoisit = Double.parseDouble(sc.readLine());
            double costPerDay = Double.parseDouble(sc.readLine());
            
            ItemType it = new ItemType(name, depoisit, costPerDay);

            System.out.println(it);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}