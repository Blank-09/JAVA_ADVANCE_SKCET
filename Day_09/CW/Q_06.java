import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        
        System.out.println(q);
        System.out.println("removed element : " + q.remove());
        System.out.println(q);
        
        System.out.println("head of the queue : " + q.peek());
        System.out.println("Size of the queue : " + q.size());
        
        int target = sc.nextInt();
        Iterator it = q.iterator();
        
        while (it.hasNext()) {
            if ((int) it.next() == target) {
                System.out.println("The element is present.");
                return;
            }
        }
        
        System.out.println("The element is not present.");
    }
}