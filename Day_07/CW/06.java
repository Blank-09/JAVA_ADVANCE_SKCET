// Header
import java.util.Scanner;

// code
abstract class First {
  abstract void input();

  abstract void add();

  abstract void result();
}

public class Main extends First {
  public int n1, n2, res;
  public Scanner sc = new Scanner(System.in);

  public void input() {
    n1 = sc.nextInt();
    n2 = sc.nextInt();
  }

  public void add() {
    res = n1 + n2;
  }

  public void result() {
    System.out.println(res);
  }

  // footer
  public static void main(String args[]) {
    Main st = new Main();
    st.input();
    st.add();
    st.result();
  }
}