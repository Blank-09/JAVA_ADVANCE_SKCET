import java.util.*;

public class Main {
  public static void main(String[] arr) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (sc.nextInt() == 1 && i == j) {
          count++;
        }
      }
    }

    if (count == n)
      System.out.print("The both diagonal are filled with 1");
    else
      System.out.print("The diagonal contains other than 1");

    sc.close();
  }
}