import java.util.*;

class Prof {
    public String id, name, dept;
    public int age, salary;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Prof[] arr = new Prof[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = new Prof();
            arr[i].id = sc.next();
            arr[i].name = sc.next();
            arr[i].dept = sc.next();
            arr[i].age = sc.nextInt();
            arr[i].salary = sc.nextInt();
        }
        
        int highest = arr[0].salary, index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i].salary > highest) {
                highest = arr[i].salary;
                index = i;
            }
        }
        
        Prof profHS = arr[index];
        System.out.println(
            profHS.id + " " + profHS.name + " " + profHS.dept + " " +
            profHS.age + " " + profHS.salary
        );
    }
}