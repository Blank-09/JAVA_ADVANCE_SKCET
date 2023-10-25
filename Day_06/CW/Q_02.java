import java.util.*;

class Hello {
    public void sayHello() {
        sayHello("");
    }
    
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hello hello = new Hello();
        
        hello.sayHello();
        hello.sayHello(sc.nextLine());
    }
}