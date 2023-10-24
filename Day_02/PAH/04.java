import java.util.*;

public class Main {
    static class Box {
        double width, height, depth;
        
        void calculate() {
            if (width <= 0 || height <= 0 || depth <= 0) {
                System.out.println("Invalid");
                return;
            }
            
            System.out.println(width * height * depth);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Box box = new Box();
        
        box.width = sc.nextDouble();
        box.height = sc.nextDouble();
        box.depth = sc.nextDouble();
        
        box.calculate();
        
        sc.close();
    }
}