import java.util.*;
import java.util.regex.*;

class AgeNotWithinRangeException extends Exception {
    @Override
    public String toString() {
        return "Age is not between 15 and 21";
    }
}

class NameNotValidException extends Exception {
    @Override
    public String toString() {
        return "Name is not Valid";
    }
}

class Student {
    int id, age;
    String name, course;
    
    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public void display() {
        System.out.println(id + " " + name + " " + age + " " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
        
        try {
            
            if (15 > stu.age || stu.age > 21)
                throw new AgeNotWithinRangeException();
            
            if (!Pattern.matches("^[a-zA-Z]+$", stu.name))
                throw new NameNotValidException();
            
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            stu.display();
        }
        
        sc.close();
    }
}