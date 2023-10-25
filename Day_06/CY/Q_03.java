import java.util.*;

class Animal {
    private String name, age;
    
    Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void display() {}
}

class Lion extends Animal {
    Lion(String name, String age) {
        super(name, age);
    }
    
    public void display() {
        System.out.printf("The %s is roaring\n", getName());
    }
}

class Tiger extends Animal {
    Tiger(String name, String age) {
        super(name, age);
    }
    
    public void display() {
        System.out.printf("The %s is swimming.\n", getName());
    }
}

class Bear extends Animal {
    Bear(String name, String age) {
        super(name, age);
    }
    
    public void display() {
        System.out.printf("The %s is climbing a tree.\n", getName());
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Lion(sc.next(), sc.next()).display();
        new Tiger(sc.next(), sc.next()).display();
        new Bear(sc.next(), sc.next()).display();
    }
}