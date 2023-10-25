import java.util.*;

class Vehicle {
    public void move(String str) {
        System.out.println(str);
    }
}

class Motorbike extends Vehicle {
    @Override
    public void move(String str) {
        System.out.println(str);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        Vehicle v = new Vehicle();
        Vehicle m = new Motorbike();
        
        m.move(s2);
        v.move(s1);
    }
}