import java.util.*;

interface Total {
    void display(int[] arr);
}

class Coin implements Total {
    public void display(int[] arr) {
        int oddSum = 0, evenSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }
        
        int startIndex = oddSum > evenSum ? 0 : 1;
        
        for (int i = startIndex; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 1) {
            System.out.println("Enter valid number");
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Coin c = new Coin();
        c.display(arr);
    }
}