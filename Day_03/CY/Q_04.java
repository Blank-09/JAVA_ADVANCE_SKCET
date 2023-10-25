import java.util.*;

class Shape {
    int width, height;
    
    Shape(int side) {
        this(side, side);
    }
    
    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    int volume() {
        return width * height;
    }
    
    void display() {
        System.out.println(volume());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Shape(sc.nextInt()).display();
        new Shape(sc.nextInt(), sc.nextInt()).display();
    }
}