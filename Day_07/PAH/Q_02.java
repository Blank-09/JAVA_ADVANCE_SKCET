import java.util.*;
import java.util.regex.*;

interface Case {
    String moveUpperCase(String str);
}

public class Main implements Case {
    
    public String moveUpperCase(String str) {
        Matcher upper = Pattern.compile("[A-Z]").matcher(str);
        Matcher lower = Pattern.compile("[a-z]").matcher(str);
        
        String res = "";
        
        while (lower.find()) res += lower.group();
        while (upper.find()) res += upper.group();
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Main m = new Main();
        
        String res = m.moveUpperCase(sc.next());
        System.out.println(res);
    }
}
