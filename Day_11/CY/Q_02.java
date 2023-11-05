import java.util.*;

public class Main extends Thread {
    int start, end, count;
    static int[] arr;
    
    Main(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public void run() {
        for (int i = start; i < end; i++) {
            if (arr[i] == 100) {
                count++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Main thread1 = new Main(0, n/2);
        Main thread2 = new Main(n/2, n);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {}
        
        System.out.println("Winners : " + (thread1.count + thread2.count));
    }
}