import java.util.*;

class Box {
    public double width, height, depth;
    
    Box() {
        this(0.0);
    }
    
    Box(double len) {
        this(len, len, len);
    }
    
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Box box1 = new Box();
        Box box2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Box cube = new Box(sc.nextDouble());
        
        System.out.println("Volume of mybox1 is " + (int) box1.volume());
        System.out.println("Volume of mybox2 is " + (int) box2.volume());
        System.out.println("Volume of mycube is " + (int) cube.volume());
    }
}