import java.util.*;

abstract class Shapes {
    public abstract void calculate();
}

class Circle extends Shapes {
    int r;
    
    Circle(int r) { this.r = r; }
    
    @Override
    public void calculate() {
        System.out.println("Circle area = " + 3.14 * r * r);
    }
}

class Triangle extends Shapes {
    public double b, h;
    Triangle(double b, double h) { this.b = b; this.h = h; }
    
    @Override
    public void calculate() {
        System.out.println("Triangle area=" + 0.5 * b * h);
    }
}

class Rectangle extends Shapes {
    public int l, b;
    Rectangle(int l, int b) { this.l = l; this.b = b; }
    
    @Override
    public void calculate() {
        System.out.println("Rectangle area=" + l * b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Circle(sc.nextInt()).calculate();
        new Triangle(sc.nextDouble(), sc.nextDouble()).calculate();
        new Rectangle(sc.nextInt(), sc.nextInt()).calculate();
    }
}