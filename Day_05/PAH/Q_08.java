import java.util.*;

class Basic {
    public String name, city, age, gender;
    public int totalAmount;
    
    int calculateDiscount() {
        int amt = totalAmount;
        
        if (1 <= amt && amt <= 4999) return 100;
        if (5000  <= amt && amt <= 7499) return 250;
        if (7500  <= amt && amt <= 9999) return 500;
        if (10000 <= amt && amt <= 19999) return 750;
        if (20000 <= amt && amt <= 29999) return 1000;
        return 1500;
    }
    
    void display() {
        System.out.println(
            name + "\n" + city + "\n" + age + "\n" + 
            gender + "\n" + totalAmount + "\n" +
            calculateDiscount()
        );
    }
}

class Premium extends Basic {
    public int subscription;
    
    void display() {
        System.out.println(
            name + "\n" + city + "\n" + age + "\n" + 
            gender + "\n" + totalAmount + "\n" +
            subscription + "\n" + calculateDiscount()
        );
    }
    
    int calculateDiscount() {
        int amt = totalAmount;
        
        if (1 <= amt && amt <= 4999) return 200;
        if (5000  <= amt && amt <= 7499) return 400;
        if (7500  <= amt && amt <= 9999) return 700;
        if (10000 <= amt && amt <= 19999) return 1000;
        if (20000 <= amt && amt <= 29999) return 1500;
        return 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        String city = sc.nextLine();
        String age = sc.nextLine();
        String gender = sc.nextLine();
        
        int totalAmount = sc.nextInt();
        int choice = sc.nextInt();
        
        if (choice == 0) {
            Basic BA = new Basic();
            BA.name = name;
            BA.city = city;
            BA.age = age;
            BA.gender = gender;
            BA.totalAmount = totalAmount;
            BA.display();
        }
        
        else if (choice == 1) {
            Premium BA = new Premium();
            BA.name = name;
            BA.city = city;
            BA.age = age;
            BA.gender = gender;
            BA.totalAmount = totalAmount;
            BA.totalAmount = totalAmount;
            BA.subscription = sc.nextInt();
            BA.display();
        }
    }
}