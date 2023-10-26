import java.util.*;
import java.util.regex.*;

class InvalidAgeForDrivingLicenseException extends Exception {
    InvalidAgeForDrivingLicenseException(String msg) {
        super(msg);
    }
    
    @Override
    public String toString() {
        return "InvalidAgeForDrivingLicenseException: " + getMessage();
    }
}

class InvalidMarkForDrivingLicenseException extends Exception {
    
    InvalidMarkForDrivingLicenseException(String msg) {
        super(msg);
    }
    
    @Override
    public String toString() {
        return "InvalidMarkForDrivingLicenseException: " + getMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        int marks = sc.nextInt();

        try {
            
            if (age < 0)
                throw new InvalidAgeForDrivingLicenseException("Invalid age");
                
            if (age < 18)
                throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
                
            if (marks < 0 || marks > 100)
                throw new InvalidMarkForDrivingLicenseException("Invalid mark");
            
            if (marks < 80)
                throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
            
            System.out.println("Approved");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        sc.close();
    }
}