import java.util.*;

abstract class Marks {
  abstract double getPercentage();
}

class A extends Marks {
  public int m1, m2, m3;

  A(int m1, int m2, int m3) {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
  }

  double getPercentage() {
    return (m1 + m2 + m3) / 3.0;
  }
}

class B extends Marks {
  public int m1, m2, m3, m4;

  B(int m1, int m2, int m3, int m4) {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.m4 = m4;
  }

  double getPercentage() {
    return (m1 + m2 + m3 + m4) / 4.0;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    A a = new A(sc.nextInt(), sc.nextInt(), sc.nextInt());
    B b = new B(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

    System.out.printf("%.2f\n", a.getPercentage());
    System.out.printf("%.2f\n", b.getPercentage());
  }
}