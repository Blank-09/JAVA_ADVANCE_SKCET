import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String patstr = sc.nextLine();
        
        Pattern pat = Pattern.compile(patstr);
        Matcher mat = pat.matcher(str);
        
        System.out.println(str + " contains " + patstr + " : " + mat.matches());
        
    }
}