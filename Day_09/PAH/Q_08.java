import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> arr = new ArrayList();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1) >= arr.get(i)) {
                arr.remove(i--);
            }
        }
        
        System.out.println(arr);
    }
}

