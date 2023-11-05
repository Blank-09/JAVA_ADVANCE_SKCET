import java.util.*;

public class Main extends Thread {
    
    static int[][] mat1, mat2;
    
    int i;
    Main(int i) {
        this.i = i;
    }
    
    public void run() {
        String output = "";
        for (int j = 0; j < mat2.length; j++) {
            int sum = 0;
            for (int k = 0; k < mat1.length; k++) {
                sum += mat1[i][k] * mat2[k][j];
            }
            
            output += sum + " ";
        }
        System.out.println(output);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        mat1 = new int[r1][c1];
        mat2 = new int[r2][c2];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        
        // Handling row threads each
        for (int i = 0; i < r1; i++) {
            new Main(i).start();
        }
    }
}