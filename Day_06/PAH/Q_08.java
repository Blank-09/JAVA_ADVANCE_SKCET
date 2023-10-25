import java.util.*;

class Rectangle {
    public double length;
    public double width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
}

class PoolTable extends Rectangle {
    public double pocketSize;
    
    PoolTable(double length, double width, double pocketSize) {
        super(length,width);
        this.pocketSize = pocketSize;
    }
    
    public void calculatePerimeter() {
        System.out.printf("%.1f\n", 2 * (length + width));
        System.out.printf("%.1f\n", 3.14 * pocketSize);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double p = sc.nextDouble();
        
        new PoolTable(l,w,p).calculatePerimeter();
    }
}