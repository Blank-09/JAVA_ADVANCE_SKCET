import java.util.*;
import java.util.regex.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regno = sc.next();
        String mobno = sc.next();

        try {
            
            if (regno.length() != 9) {
                throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
            }
            
            if (mobno.length() != 10) {
                throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
            }
            
            if (!Pattern.matches("^\\d{2}[a-zA-Z]{3}\\d{4}$", regno)) {
                throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets in format specified");
            }
            
            if (!Pattern.matches("^\\d{10}$", mobno)) {
                throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
            }
            
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
            System.out.println(e);
        }
        
        sc.close();
    }
}