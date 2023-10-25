import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile("^\\w+$");
        Matcher mat = pat.matcher(str);
        
        System.out.println(str + "\n" + mat.find());
    }
}
