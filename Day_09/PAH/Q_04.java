import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            set2.add(sc.nextInt());
        }
        
        if (set1.equals(set2)) {
            System.out.println("Both sets are same");
        } else {
            System.out.println("Both sets are different");
        }
    }
}