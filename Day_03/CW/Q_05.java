import java.util.Scanner;

public class Wall {
    private double length, height;

    public Wall(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double calculateArea() {
        return length * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        double l2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();

        Wall w1 = new Wall(l1, h1);
        Wall w2 = new Wall(l2, h2);

        System.out.println("Area of Wall 1: " + w1.calculateArea());
        System.out.println("Area of Wall 2: " + w2.calculateArea());
    }
}