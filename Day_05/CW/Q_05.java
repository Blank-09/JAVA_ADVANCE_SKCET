import java.util.*;

class Employee {
    private String name;
    private int id, salary;
    public static String companyName = "ABC Corp";
    
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Company Name: " + companyName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Employee[] emps = new Employee[n];
        for (int i = 0; i < n; i++) {
            emps[i] = new Employee(sc.next(), sc.nextInt(), sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            emps[i].display();
        }
        
        System.out.println("Updated Details");
        
        Employee.companyName = sc.next();
        
        for (int i = 0; i < n; i++) {
            emps[i].display();
        }
        
    }
}