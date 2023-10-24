import java.util.*;

public class Main {
    
    private String[] daysOfWeek = {
        "Weekend", "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"
    };
    
    Main(int n) {
        if (n > 7)
            System.out.println("Invalid");
        else
            System.out.println(daysOfWeek[n]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc.nextInt());
        
        sc.close();
    }
}