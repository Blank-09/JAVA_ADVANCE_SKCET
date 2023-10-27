import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        
        String target = sc.next();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (list.get(i).equals(target)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}