import java.util.*;

class Employee {
    private String eName;
    private int eId;
    private int eSalary;
    
    Employee(String eName, int eId, int eSalary) {
        this.eName = eName;
        this.eId = eId;
        this.eSalary = eSalary;
    }
    
    public void display() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee ID: " + eId);
        System.out.println("Employee Salary: " + eSalary);
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
        
        for (Employee emp : emps) {
            emp.display();
        }
    }
}