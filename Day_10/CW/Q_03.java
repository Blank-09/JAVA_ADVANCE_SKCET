import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        
        for (var str : arr.toArray()) {
            System.out.println(str);
        }
        
    }
}