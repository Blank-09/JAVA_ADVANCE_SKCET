import java.util.*;

class Overloading {
    private String name, day;
    private int temp;
    
    Overloading() {
        name = "Argentina";
        day = "Yesterday";
        temp = 29;
    }
    
    Overloading(String name, int temp) {
        this.name = name;
        this.temp = temp;
        this.day = "Today";
    }
    
    Overloading(String name, String day, int temp) {
        this.name = name;
        this.temp = temp;
        this.day = day;
    }
    
    public void display() {
        System.out.printf("%s %s Temperature: %d°\n", name, day, temp);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Overloading().display();
        new Overloading(sc.next(), sc.nextInt()).display();
        new Overloading(sc.next(), sc.next(), sc.nextInt()).display();
    }
}