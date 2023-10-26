import java.util.*;

class InvalidMarksException extends Exception {
    @Override
    public String toString() {
        return "Invalid marks entered! Marks should be between 0 and 100 (inclusive).";
    }
}

class NegativeMarksException extends Exception {
    @Override
    public String toString() {
        return "Negative marks entered! Marks should be non-negative.";
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        try {
            if (marks < 0) {
                throw new NegativeMarksException();
            }
            
            if (marks > 100) {
                throw new InvalidMarksException();
            }
            
            System.out.println("Valid marks entered.");
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}