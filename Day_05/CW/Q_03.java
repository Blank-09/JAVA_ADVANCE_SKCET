import java.util.*;

class Employee {
    public int empId;
    public float salary;
}

class EmpLevel extends Employee {
    public int level;
    
    EmpLevel(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println(empId);
        System.out.println(salary);
        System.out.println(salary > 100 ? "1" : "2");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        float f = sc.nextFloat();
        
        EmpLevel emp = new EmpLevel(n, f);
        emp.display();
    }
}