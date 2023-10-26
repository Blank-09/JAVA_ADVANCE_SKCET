import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] biscuits = new int[n];
        for (int i = 0; i < n; i++) {
            biscuits[i] = sc.nextInt();
        }
        
        int noOfBiscuits = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            count += biscuits[i];
            
            if (count >= noOfBiscuits * 2) {
                System.out.println("The number of bowls required to feed the rat = " + (i+1));
                return;
            }
        }
        
        System.out.println("The biscuits in all bowls are not enough to feed the rats");
    }
}