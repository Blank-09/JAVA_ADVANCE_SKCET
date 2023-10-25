import java.util.*;

abstract class math {
    abstract void rectanglePerimeter();
    abstract void squarePerimeter();
    abstract void trianglePerimeter();
    abstract void trapezoidPerimeter();
    abstract void circlePerimeter();
}

class perimeter extends math {
    
    public Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    
    void rectanglePerimeter() {
        int l = sc.nextInt();
        int b = sc.nextInt();
        int peri = 2 * (l + b);
        arr[0] = peri;
        System.out.println(peri);
    }

    void squarePerimeter() {
        int a = sc.nextInt();
        int peri = 4 * a;
        arr[1] = peri;
        System.out.println(peri);
    }

    void trianglePerimeter() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int peri = a + b + c;
        arr[2] = peri;
        System.out.println(peri);
    }

    void trapezoidPerimeter() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int peri = a + b + c + d;
        arr[3] = peri;
        System.out.println(peri);
    }

    void circlePerimeter() {
        int r = sc.nextInt();
        int peri = (int) 3.14 * 2 * r;
        arr[4] = peri;
        System.out.println(peri);
    }

    void calculateSum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    void sortPerimeter() {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        perimeter p = new perimeter();
        p.rectanglePerimeter();
        p.squarePerimeter();
        p.trianglePerimeter();
        p.trapezoidPerimeter();
        p.circlePerimeter();
        p.calculateSum();
        p.sortPerimeter();
    }
}