import java.util.*;

class NumberConverter {
    
    static int baseOf(char ch) {
        if (ch == 'B') return 2;
        if (ch == 'O') return 8;
        if (ch == 'H') return 16;
        return 10;
    }
    
    public static String convert(char src, char dest, String num) {
        int decimal = Integer.parseInt(num, baseOf(src));
        return Integer.toString(decimal, baseOf(dest));
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char src = sc.next().charAt(0);
        char dest = sc.next().charAt(0);
        String num = sc.next();
        
        System.out.println(
            NumberConverter.convert(src, dest, num)
        );
    }
}
