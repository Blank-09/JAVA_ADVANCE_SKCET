import java.util.*;

class ArrayListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }
    }
}