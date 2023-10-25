import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if (Pattern.compile("^\\d+$").matcher(str).find()) {
            System.out.println("The datatype of " + str + " is: java.lang.Integer");
        }
        
        else if (Pattern.compile("^\\d+\\.\\d+").matcher(str).find()) {
            System.out.println("The datatype of " + str + " is: java.lang.Double");
        }
        
        else if (Pattern.compile("^\\d{2}[/-](\\d|\\w){2,5}[/-]\\d{2,4}").matcher(str).find()) {
            System.out.println("The datatype of " + str + " is: java.util.Date");
        }
        
        else {
            System.out.println("The datatype of " + str + " is: java.lang.String");
        }
    }
}