import java.util.*;

class StallCategory {
    public String name, detail;
    
    StallCategory() {
        System.out.println("Using Default Constructor");
    }
    
    StallCategory(String name, String detail) {
        this.name = name;
        this.detail = detail;
        System.out.println("Using Parameterized Constructor");
    }
    
    public void display() {
        System.out.println(name);
        System.out.println(detail);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new StallCategory();
        new StallCategory(sc.nextLine(), sc.nextLine()).display();
        
        sc.close();
    }
}