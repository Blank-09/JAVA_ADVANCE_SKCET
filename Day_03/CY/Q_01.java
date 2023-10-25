import java.util.*;

class Welcome {
    Welcome(String name) {
        System.out.println("Welcome " + name);
    }
}

class Hello {
    Hello(String name) {
        System.out.println("Hello " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        new Welcome(str);
        new Hello(str);
    }
}