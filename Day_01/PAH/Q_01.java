import java.util.*;

public class Main {
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int n = str.length();
        char prev = 0;
        for (int i = 0; i < n; i++) {
            if (prev != str.charAt(i) || !isVowel(str.charAt(i))) {
                System.out.print(str.charAt(i));
                prev = str.charAt(i);
            }
        }
        
    }
}