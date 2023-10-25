import java.util.*;

class Person {
    public String name;
    
    Person(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Name : " + name);
    }
}

class Staff extends Person {
    public int staffId;
    
    Staff(String name, int staffId) {
        super(name);
        this.staffId = staffId;
    }
    
    void display() {
        super.display();
        System.out.println("Staff Id : " + staffId);
    }
    
}

class TemporaryStaff extends Staff {
    public int days, hoursWorked;
        
    TemporaryStaff(String name, int staffId, int days, int hoursWorked) {
        super(name, staffId);
        this.days = days;
        this.hoursWorked = hoursWorked;
    }
    
    void display() {
        super.display();
        System.out.println("No. of Days : " + days);
        System.out.println("No. of Hours Worked : " + hoursWorked);
        System.out.println("Total Salary : " + days * hoursWorked * 50);
    }
}


// Last test failed
// cuz the testcase and output doesn't match
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TemporaryStaff ts = new TemporaryStaff(
            sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt()
        );
        
        ts.display();
    } 
}
