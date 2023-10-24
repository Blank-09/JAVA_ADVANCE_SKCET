import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static class User {
    private String name, username, password, mobileNumber;

    User() {
      name = sc.next();
      username = sc.next();
      password = sc.next();
      mobileNumber = sc.next();
    }

    public boolean compareTo(User o) {
      return mobileNumber.equals(o.mobileNumber);
    }
  }

  public static void main(String[] args) {
    User u1 = new User();
    User u2 = new User();

    if (u1.compareTo(u2)) {
      System.out.println("User 1 and User 2 are equal");
    } else {
      System.out.println("User 1 and User 2 are not equal");
    }
  }
}