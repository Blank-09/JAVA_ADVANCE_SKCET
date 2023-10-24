import java.text.*;
import java.util.*;

abstract class Account {
  String name;
  int number, balance;
  Date startDate;

  Account(String name, int number, int balance, Date startDate) {
    this.name = name;
    this.number = number;
    this.balance = balance;
    this.startDate = startDate;
  }

  abstract double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account {

  public CurrentAccount(String name, int number, int balance, Date startDate) {
    super(name, number, balance, startDate);
  }

  public double calculateInterest(Date dueDate) {
    int noOfMonths = monthsDifference(startDate, dueDate);
    return (double) balance * (0.05 * noOfMonths / 12.0);
  }

  public int monthsDifference(Date startDate, Date endDate) {
    Calendar c1 = new GregorianCalendar();
    c1.setTime(startDate);

    Calendar c2 = new GregorianCalendar();
    c2.setTime(endDate);

    int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
    ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);

    return ans;
  }
}

class SavingsAccount extends Account {

  public SavingsAccount(String name, int number, int balance, Date startDate) {
    super(name, number, balance, startDate);
  }

  public double calculateInterest(Date dueDate) {
    int noOfMonths = monthsDifference(startDate, dueDate);
    return (double) balance * (0.12 * noOfMonths / 12.0);
  }

  public int monthsDifference(Date startDate, Date endDate) {
    Calendar c1 = new GregorianCalendar();
    c1.setTime(startDate);

    Calendar c2 = new GregorianCalendar();
    c2.setTime(endDate);

    int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
    ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);

    return ans;
  }

}

class AccountsMain {
  public static void main(String args[]) throws ParseException {
    Scanner sc = new Scanner(System.in);

    int type = sc.nextInt();
    String name = sc.next();
    int acc_no = sc.nextInt();
    int amount = sc.nextInt();

    String startDateStr = sc.next();
    String endDateStr = sc.next();

    var sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date startDate = sdf.parse(startDateStr);
    Date endDate = sdf.parse(endDateStr);

    Account acc;
    double res = 0;

    if (type == 2) {
      acc = new CurrentAccount(name, acc_no, amount, startDate);
      res = acc.calculateInterest(endDate);
    } else if (type == 1) {
      acc = new SavingsAccount(name, acc_no, amount, startDate);
      res = acc.calculateInterest(endDate);
    }

    System.out.printf("%.1f", res);
  }
}