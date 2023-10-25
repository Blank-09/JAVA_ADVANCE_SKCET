import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile("^[7-9]\\d{9}$");
        Matcher mat = pat.matcher(str);
        
        if (mat.find()) {
            System.out.println(str + " : Valid Number");
        } else {
            System.out.println(str + " : Invalid Number");
        }
    }
}