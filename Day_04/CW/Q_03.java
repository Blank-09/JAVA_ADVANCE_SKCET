import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher(str);
        
        if (mat.find()) {
            int num = Integer.parseInt(mat.group());
            System.out.print(num);
        }
        
        while (mat.find()) {
            int num = Integer.parseInt(mat.group());
            System.out.print("." + num);
        }
    }
}