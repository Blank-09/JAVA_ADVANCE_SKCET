import java.util.*;

abstract class Shape {
  abstract void rectangleArea(int l, int h);
  abstract void squareArea(int s);
  abstract void circleArea(int r);
}

class Area extends Shape {
  void rectangleArea(int l, int h) {
    System.out.println(l * h);
  }

  void squareArea(int s) {
    System.out.println(s * s);
  }

  void circleArea(int r) {
    System.out.printf("%.2f", Math.PI * r * r);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Shape shape = new Area();

    shape.rectangleArea(sc.nextInt(), sc.nextInt());
    shape.squareArea(sc.nextInt());
    shape.circleArea(sc.nextInt());
  }
}