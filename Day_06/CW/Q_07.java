import java.util.*;

public class Main {
    
    public double convert(double celsius) {
        return celsius * 1.8 + 32;
    }
    
    public double convert(double fahrenheit, boolean toCelsius) {
        if (toCelsius) 
            return convert(fahrenheit);
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double temp = sc.nextDouble();
        char ch = sc.next().charAt(0);
        
        Main main = new Main();
        
        System.out.println(
            temp + " " + ch + " = " + main.convert(temp, ch == 'C') + 
            (ch == 'C' ? "F" : "C")
        );
    }
}
