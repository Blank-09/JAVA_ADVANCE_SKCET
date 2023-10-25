import java.util.*;

interface Matrix {
    void diagonalsMinMax(int[][] mat);
}

public class Main implements Matrix {
    
    public void diagonalsMinMax(int[][] mat) {
        int n = mat.length;

        int maxd1 = mat[0][0], mind1 = mat[0][0];
        int maxd2 = mat[0][n-1], mind2 = mat[0][n-1];
        for (int i = 0; i < n; i++) {
            maxd1 = Math.max(maxd1, mat[i][i]);
            mind1 = Math.min(mind1, mat[i][i]);
            maxd2 = Math.max(maxd2, mat[i][n-i-1]);
            mind2 = Math.min(mind2, mat[i][n-i-1]);
        }
        
        System.out.println("Smallest Element - 1: " + mind1);
        System.out.println("Greatest Element - 1: " + maxd1);
        System.out.println("Smallest Element - 2: " + mind2);
        System.out.println("Greatest Element - 2: " + maxd2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        Main m = new Main();
        m.diagonalsMinMax(mat);
    }
}