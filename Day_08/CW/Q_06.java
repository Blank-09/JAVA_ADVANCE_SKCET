import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        try {
            System.out.println(arr[target]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound.");
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        
        String str = null;
        int index = sc.nextInt();
        
        try {
            System.out.println(str);
            System.out.println(str.charAt(index));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        
        
        sc.close();
    }
}