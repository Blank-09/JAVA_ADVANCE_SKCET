import java.util.*;

class Book {
    String title, author;
    int price;
    
    void disp() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class MyBook extends Book {
    MyBook(String title, String author, int price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String title = sc.next();
        String author = sc.next();
        int price = sc.nextInt();
        
        MyBook mb = new MyBook(title, author, price);
        mb.disp();
    }
}