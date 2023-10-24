import java.util.*;

class Address {
  public String street, city, country, pincode;

  public void displayAddress() {
    System.out.println("Street: " + street);
    System.out.println("City: " + city);
    System.out.println("Pincode: " + pincode);
    System.out.println("Country : " + country);
  }
}

class AddressMain {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Address ad = new Address();

    ad.street = sc.nextLine();
    ad.city = sc.nextLine();
    ad.pincode = sc.nextLine();
    ad.country = sc.nextLine();

    ad.displayAddress();
  }
}