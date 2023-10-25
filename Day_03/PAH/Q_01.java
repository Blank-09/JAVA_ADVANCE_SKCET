import java.util.*;

class Copy {
    public int rollno;
    public String name;
    
    // Copy Constructor
    Copy(Copy o) {
        rollno = o.rollno;
        name = o.name;
    }
    
    // Parameterized Constructor
    Copy(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    void display() {
        System.out.println(rollno + " " +name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Copy c1 = new Copy(sc.nextInt(), sc.next());
        Copy c2 = new Copy(c1);
        
        c1.display();
        c2.display();
    }
}