import java.util.*;
import java.text.*;

class icecream {
    
    DecimalFormat d = new DecimalFormat("0.00");
    
    public void Quantity(int r, int h) {
        double c = 3.14 * (r * r) * (0.33) * h;
        System.out.println(d.format(c));
    }
    
    public void Quantity(int r) {
        double c = 1.33 * 3.14 * (r * r * r);
        System.out.println(d.format(c));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        icecream ice = new icecream();
        int h, r = sc.nextInt();
        
        if (sc.hasNextInt()) {
            h = sc.nextInt();
            ice.Quantity(r, h);
        } else {
            ice.Quantity(r);
        }
    }
}