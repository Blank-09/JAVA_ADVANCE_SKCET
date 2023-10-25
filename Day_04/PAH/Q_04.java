import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile(".*\\d+$");
        Matcher mat = pat.matcher(str);
        
        if (mat.find()) {
            System.out.println(str + "\nFound a match!");
        } else {
            System.out.println(str + "\nNot matched!");
        }
    }
}