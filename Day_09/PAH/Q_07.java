import java.util.*;

class Student implements Comparable<Student> {
    private int rno, mark1, mark2,mark3;
    private String name;
    private double avg;
    
    Student(int rno, String name, int mark1, int mark2, int mark3) {
        this.rno = rno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        
        avg = (mark1 + mark2 + mark3) / 3;
    }
    
    @Override
    public int compareTo(Student o) {
        return (int) (avg - o.avg);
    }
    
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s", rno, name, avg);
    }
}

class ArrayListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Student> students = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            students.add(
                new Student(
                    sc.nextInt(), sc.next(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt()
                )
            );
        }
        
        Collections.sort(students);
        
        System.out.printf("%-20s%-20s%-20s\n", "Roll No", "Name", "Average");
		for (Student student : students) {
		    System.out.println(student);
		}
    }
}