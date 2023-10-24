import java.util.*;

interface Growing {
  void isGrowing();
}

class GrowingNumber implements Growing {
  int num;

  public GrowingNumber(int i) {
    num = i;
  }

  public void isGrowing() {
    int n = num;
    boolean growing = true;

    int prev = n % 10;
    n /= 10;

    while (n != 0) {
      int digit = n % 10;
      growing = growing && prev > digit;
      prev = digit;
      n /= 10;
    }

    if (growing) {
      System.out.println("Growing number");
    } else {
      System.out.println("Not growing number");
    }
  }
}

class GrowingString implements Growing {
  String str;

  public GrowingString(String string) {
    str = string;
  }

  public void isGrowing() {
    boolean growing = true;
    char prev = str.charAt(0);
    int n = str.length();

    for (int i = 1; i < n; i++) {
      growing = growing && prev < str.charAt(i);
      prev = str.charAt(i);
    }

    if (growing) {
      System.out.println("Growing string");
    } else {
      System.out.println("Not growing string");
    }
  }
}

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String str = sc.next();

    new GrowingNumber(n).isGrowing();
    new GrowingString(str).isGrowing();
  }

}