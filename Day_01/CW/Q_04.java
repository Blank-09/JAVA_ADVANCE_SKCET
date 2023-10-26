import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        int[] histogram = new int[128];
        for (int i = 0; i < n; i++) {
            histogram[str.charAt(i)]++;
        }
        
        for (int i = 0; i < 128; i++) {
            if (histogram[i] != 0) {
                System.out.println((char) i + "-" + histogram[i]);
            }
        }
    }
}