import java.util.*;

interface ShapeCalculator {
  void calc(int n);
}

class Square implements ShapeCalculator {
  public void calc(int n) {
    int perimeter = 4 * n;
    int area = n * n;
    System.out.println(area + " " + perimeter);
  }
}

class Circle implements ShapeCalculator {
  public void calc(int r) {
    double perimeter = 2 * 3.14 * r;
    double area = 3.14 * r * r;
    System.out.printf("%.2f %.2f", area, perimeter);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ShapeCalculator sq = new Square();
    ShapeCalculator circ = new Circle();

    int n = sc.nextInt();

    sq.calc(n);
    circ.calc(n);
  }
}