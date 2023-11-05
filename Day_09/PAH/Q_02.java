import java.util.*;

class Book {
    private int id, quantity;
    private String name, author, publisher;
    
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + author + " " + publisher + " " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        LinkedHashSet<Book> books = new LinkedHashSet();
        
        for (int i = 0; i < n; i++) {
            books.add(
                new Book(
                    Integer.parseInt(sc.nextLine()),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
                )
            );
        }
        
        String target = sc.nextLine();
        boolean isFound = false;
        
        for (Book book : books) {
            System.out.println(book);
            
            if (target.equals(book.getName())) {
                isFound = true;
            }
        }
        
        if (isFound)
            System.out.println(target + " is present in the set");
        else
            System.out.println(target + " is not present in the set");
    }
}