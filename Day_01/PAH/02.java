import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = str.length();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j)
          System.out.print(str.charAt(i));
        else if (j == n - i - 1)
          System.out.print(str.charAt(n - i - 1));
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}