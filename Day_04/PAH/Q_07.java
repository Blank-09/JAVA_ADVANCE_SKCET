import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(str);
        
        int count = 0;
        while (mat.find()) count++;
        
        System.out.println("Original string: " + str);
        System.out.println("New string: " + count);
    }
}