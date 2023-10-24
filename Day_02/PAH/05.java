import java.util.*;

class Occurrence {
    public static int count(String str, char target) {
        int count = 0;    
        
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char ch = sc.next().charAt(0);
        
        System.out.println(Occurrence.count(str, ch));
    }
}