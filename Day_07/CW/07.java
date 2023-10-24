import java.util.*;

abstract class ItemType {
  abstract double calculateAmount();
}

class wooden extends ItemType {
  int noOfItems;
  double cost;

  wooden(int noOfItems, double cost) {
    this.noOfItems = noOfItems;
    this.cost = cost;
  }

  double calculateAmount() {
    return noOfItems * cost;
  }
}

class electronics extends ItemType {
  String type;
  double amount;

  electronics(String type, double amount) {
    this.type = type;
    this.amount = amount;
  }

  double calculateAmount() {
    if (type.equals("Academics"))
      return amount - 0.05 * amount;
    return amount;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    double amt = 0;

    if (choice == 1)
      amt = new wooden(sc.nextInt(), sc.nextInt()).calculateAmount();

    else if (choice == 2)
      amt = new electronics(sc.next(), sc.nextInt()).calculateAmount();

    System.out.println(amt);
  }
}