import java.util.*;

class Employee {
    public String name;
    public int basic_salary;
    
    Employee(String name, int basic_salary) {
        this.name = name;
        this.basic_salary = basic_salary;
    }
    
    double calculateSalary() {
        return basic_salary;
    }
}

class Manager extends Employee {
    public int bonus;
    
    Manager(String name, int basic_salary, int bonus) {
        super(name, basic_salary);
        this.bonus = bonus;
    }
    
    @Override
    double calculateSalary() {
        return basic_salary + bonus;
    }
    
    void display() {
        System.out.println("Manager Salary: " + calculateSalary());
    }
}

class Engineer extends Employee {
    public int overtime_pay;
    
    Engineer(String name, int basic_salary, int overtime_pay) {
        super(name, basic_salary);
        this.overtime_pay = overtime_pay;
    }
    
    @Override
    double calculateSalary() {
        return basic_salary + overtime_pay;
    }
    
    void display() {
        System.out.println("Engineer Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Manager(
            sc.nextLine(),
            Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine())
        ).display();
        
        new Engineer(
            sc.nextLine(),
            Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine())
        ).display();
    }
}