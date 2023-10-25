import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        Pattern pat = Pattern.compile("\\'\\w+\\'");
        Matcher mat = pat.matcher(str);
        
        if (mat.find())
            System.out.println("First Extracted part: " + mat.group().replace("'", ""));
            
        Matcher mat2 = pat.matcher(sc.nextLine());
        
        if (mat2.find())
            System.out.println("Second Extracted part: " + mat2.group().replace("'", ""));
        
    }
}