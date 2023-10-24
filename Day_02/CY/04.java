import java.util.*;

class Employee {
    public String id, name;
    public double salary;
    
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Employee[] emps = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            emps[i] = new Employee(sc.next(), sc.next(), sc.nextDouble());
        }
        
        Double salary = sc.nextDouble();
        
        for (Employee emp : emps) {
            if (emp.salary < salary) {
                emp.display();
            }
        }
    }
}