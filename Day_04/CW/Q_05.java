import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        Pattern cpat = Pattern.compile("[^aeiou]+", Pattern.CASE_INSENSITIVE);
        Pattern vpat = Pattern.compile("[aeiou]+", Pattern.CASE_INSENSITIVE);
        Matcher cmat = cpat.matcher(str);
        Matcher vmat = vpat.matcher(str);
        
        System.out.println("Original String: " + str);
        System.out.print("Separate consonants and vowels of the said string: ");
        
        while (cmat.find())
            System.out.print(cmat.group());
        
        while (vmat.find())
            System.out.print(vmat.group());
    }
}
