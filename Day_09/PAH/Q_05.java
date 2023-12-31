import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        
        Collections.sort(list, (String a, String b) -> a.length() - b.length());
        
        System.out.println(list);
    }
}