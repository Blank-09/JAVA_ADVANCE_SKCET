import java.util.*;

abstract class Parent {
    abstract void message();
}

class Subclass1 extends Parent {
    String msg;
    
    Subclass1(String msg) {
        this.msg = msg;
    }
    
    @Override
    void message() {
        System.out.println("First subclass message " + msg);
    }
}

class Subclass2 extends Parent {
    String msg;
    
    Subclass2(String msg) {
        this.msg = msg;
    }
    
    @Override
    void message() {
        System.out.println("Second subclass message " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Subclass1(sc.next()).message();
        new Subclass2(sc.next()).message();
        
    }
}