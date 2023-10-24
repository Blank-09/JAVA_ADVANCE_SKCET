import java.util.*;

interface Product {
  void ProductDetails();

  void show_Bill();
}

class Customer {
  public int id, noOfItems, cost;
  public String name;

  void getdetails() {
    id = OrderOnline.sc.nextInt();
    name = OrderOnline.sc.next();
    noOfItems = OrderOnline.sc.nextInt();

    for (int i = 0; i < noOfItems; i++) {
      OrderOnline.sc.next(); // product name
      cost += OrderOnline.sc.nextInt(); // cost
    }
  }

  void showdetails() {
    System.out.println("ID:" + id);
    System.out.println("NAME:" + name);
  }

}

class OrderOnline extends Customer implements Product {

  public static Scanner sc = new Scanner(System.in);

  int bill = 0;

  public void ProductDetails() {
    getdetails();
    double gst = 0.0;

    if (cost <= 10_000)
      gst = 0.0;
    else if (10_000 < cost && cost <= 30_000)
      gst = 0.05;
    else if (30_000 < cost && cost <= 50_000)
      gst = 0.07;
    else
      gst = 0.09;

    bill = (int) (cost * gst) + cost;
  }

  public void show_Bill() {
    showdetails();
    System.out.println("Bill:" + bill);
  }

  public static void main(String[] arg) {
    int n = sc.nextInt();

    while (n-- != 0) {
      OrderOnline o = new OrderOnline();
      o.ProductDetails();
      o.show_Bill();
    }
  }
}