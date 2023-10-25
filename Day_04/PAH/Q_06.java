import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patstr = sc.next();
        String str = sc.next();
        
        Pattern pat = Pattern.compile(patstr);
        Matcher mat = pat.matcher(str);
        
        int count = 0;
        while (mat.find()) count++;
        
        System.out.println("The no of occurences: " + count);
        
    }
}