import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile("^[a-zA-Z]\\w+");
        Matcher mat = pat.matcher(str);
        
        if (mat.find() && str.equals(mat.group()))
            System.out.println(str + ":Valid Identifier");
        else
            System.out.println(str + ":Invalid Identifier");
        
        sc.close();
    }
}