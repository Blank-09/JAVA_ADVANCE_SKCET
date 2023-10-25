import java.util.*;

class Quadrilateral {
    public static Scanner sc = new Scanner(System.in);

    int[][] cords;
    int area = 0;
    
    Quadrilateral() {
        cords = new int[4][2];
        
        for (int i = 0; i < cords.length; i++) {
            for (int j = 0; j < cords[i].length; j++) {
                cords[i][j] = Quadrilateral.sc.nextInt();
            }
        }
    }
    
    void displayArea() {
        System.out.println("Area of the Square is " + area);
    }
}

class Square extends Quadrilateral {
    void displayArea() {
        int d1 = (int) Math.sqrt(
            Math.pow(cords[1][0] - cords[0][0], 2) +
            Math.pow(cords[1][1] - cords[0][1], 2)
        );

        System.out.println("Area of the Square is " + d1 * d1);
    }
}

class Rectangle extends Quadrilateral {
    void displayArea() {
        int d1 = (int) Math.sqrt(
            Math.pow(cords[1][0] - cords[0][0], 2) +
            Math.pow(cords[1][1] - cords[0][1], 2)
        );
        
        int d2 = (int) Math.sqrt(
            Math.pow(cords[2][0] - cords[1][0], 2) +
            Math.pow(cords[2][1] - cords[1][1], 2)
        );

        System.out.println("Area of the Rectangle is " + d1 * d2);
    }
}

class Parallelogram extends Quadrilateral {
    int height;
    
    Parallelogram() {
        height = Quadrilateral.sc.nextInt();
    }
    
    void displayArea() {
        int d1 = (int) Math.sqrt(
            Math.pow(cords[1][0] - cords[0][0], 2) +
            Math.pow(cords[1][1] - cords[0][1], 2)
        );

        System.out.println("Area of the Parallelogram is " + d1 * height);
    }
}

class Trapezoid extends Quadrilateral {
    int height;
    
    Trapezoid() {
        height = Quadrilateral.sc.nextInt();
    }
    
    void displayArea() {
        int d1 = (int) Math.sqrt(
            Math.pow(cords[1][0] - cords[0][0], 2) +
            Math.pow(cords[1][1] - cords[0][1], 2)
        );
        
        int d2 = (int) Math.sqrt(
            Math.pow(cords[3][0] - cords[2][0], 2) +
            Math.pow(cords[3][1] - cords[2][1], 2)
        );

        System.out.println("Area of the Trapezoid is " + (d1 + d2) / 2 * height);
    }
}

class TestQuadrilateral {
    public static void main(String[] args) {
        new Square().displayArea();
        new Rectangle().displayArea();
        new Parallelogram().displayArea();
        new Trapezoid().displayArea();
    }
}