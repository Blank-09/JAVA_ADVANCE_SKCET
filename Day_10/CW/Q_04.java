import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList<String> ll = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            ll.add(sc.next());
        }
        
        System.out.println(ll);
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Element at index %d %s\n", i, ll.get(i));
        }
        
        System.out.printf("Last element in the list: %s", ll.getLast());
    }
}
