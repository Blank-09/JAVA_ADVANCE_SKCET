import java.util.*;

class Professor {
    public int id, salary;
    public String name;
    
    Professor() {}
    
    Professor (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Professor[] professors = new Professor[n];
        
        for (int i = 0; i < n; i++) {
            professors[i] = new Professor(
                sc.nextInt(),
                sc.next(),
                sc.nextInt()
            );
        }
        
        for (Professor professor : professors) {
            if (professor.salary >= 20_000) {
                professor.display();
            }
        }
    }
}