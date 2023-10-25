import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        boolean length = Pattern.compile("^.{8,15}$").matcher(str).find();
        boolean upper = Pattern.compile("[A-Z]").matcher(str).find();
        boolean lower = Pattern.compile("[a-z]").matcher(str).find();
        boolean special = Pattern.compile("[\\W]").matcher(str).find();
        boolean number = Pattern.compile("[0-9]").matcher(str).find();
        
        if (length && upper && lower && special && number) {
            System.out.println(str + " is a valid password");
        } else {
            System.out.println(str + " is a invalid password");
        }
    }
}