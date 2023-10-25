import java.util.*;
import java.util.regex.*;

class Demo {
    public static String move(String str) {
        Pattern pat = Pattern.compile("\\W");
        Matcher mat = pat.matcher(str);
        Matcher mat2 = Pattern.compile("\\w").matcher(str);
        
        String special = "";
        while (mat.find()) {
            special += mat.group();
        }
        
        String other = "";
        while (mat2.find()) {
            other += mat2.group();
        }
        
        return other +special;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(Demo.move(str));
    }
}