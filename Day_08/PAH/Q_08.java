import java.util.*;

class BookQuantityNotAvailableException extends Exception {
    @Override
    public String toString() {
        return "InvalidQuantityException: Quantity not available";
    }
}

class Book {
    int availability, price;
    String id, title, name;
    
    public void purchase(int qty) throws BookQuantityNotAvailableException {
        
        if (availability < qty) {
            throw new BookQuantityNotAvailableException();
        }
        
        availability -= qty;
        System.out.println("New quantity : " + availability);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Book book = new Book();
        
        book.id = sc.nextLine();
        book.title = sc.nextLine();
        book.name = sc.nextLine();
        book.price = sc.nextInt();
        book.availability = sc.nextInt();
        
        int purchaseQty = sc.nextInt();
        
        try {
            book.purchase(purchaseQty);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}