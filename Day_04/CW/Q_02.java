import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Pattern pat = Pattern.compile("^[^g].*g.*[^g]$");
        Matcher mat = pat.matcher(str);
        
        boolean matchFound = mat.find();
        
        if (matchFound)
            System.out.println("Found a match!");
        else
            System.out.println("Not matched!");
    }
}