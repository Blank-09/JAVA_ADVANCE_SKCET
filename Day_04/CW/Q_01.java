import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        Pattern pat = Pattern.compile("^([0-2]?[0-9]{1,2}.){3}[0-2]?[0-9]{1,2}$");
        Matcher mat = pat.matcher(str);
        
        if (mat.find() && str.equals(mat.group())) {
            System.out.print("IP address " + str + " is Valid");
        } else {
            System.out.print("IP address " + str + " is Invalid");
        }
    }
}