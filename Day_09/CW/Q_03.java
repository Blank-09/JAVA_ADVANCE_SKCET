import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Deque<Integer> d = new ArrayDeque<>();
        
        for (int i = 0; i < 5; i++) {
            d.add(sc.nextInt());
        }
        
        d.removeLast();
        
        while (!d.isEmpty()) {
            System.out.println(d.peek());
            d.pop();
        }
    }
}