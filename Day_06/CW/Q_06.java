import java.util.*;

class Rectangle {
    public int length, breadth;
    
    public void calculateArea() {
        System.out.println("Area of rectangle is: " + (double) length * breadth);
    }
}

public class Main extends Rectangle {
    
    Main(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Main(sc.nextInt(), sc.nextInt());
        
        rect.calculateArea();
    }
}