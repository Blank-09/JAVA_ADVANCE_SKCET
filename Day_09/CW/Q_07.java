import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        
        System.out.println(st.pop());
        System.out.println("Top Element : " + st.peek());
        
        int target = sc.nextInt();
        int index = st.search(target);
        
        if (index != -1)
            System.out.println("Element is found at position : " + index);
        else
            System.out.println("Element not found");
    }
}