import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        
        int target = sc.nextInt();
        list.remove(target-1);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}