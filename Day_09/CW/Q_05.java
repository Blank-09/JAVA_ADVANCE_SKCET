import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList<String> ll = new LinkedList<>();
        
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextLine());
        }
        
        int target = sc.nextInt();
        ll.remove(target-1);
        
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}