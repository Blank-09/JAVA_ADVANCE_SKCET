import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> arr = new ArrayDeque<>();
        
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        
        arr.removeLast();
        
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}