import java.util.*;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "InvalidInputException: ISBN must be exactly 9 digits";
    }
}

class NumberManipulation {
    int[] arr = new int[9];
    
    void extractDigits(int n) {
        for (int i = 9; i > 0; i--) {
            arr[i-1] = n % 10;
            n /= 10;
        }
    }
    
    int findLastDigit() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (i+1);
        }
        
        if (sum % 100 == 10) // last two digit is 10
            return 10;
        
        return sum % 11;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberManipulation nm = new NumberManipulation();
        
        try {
            String num = sc.next();
            
            if (num.length() != 9)
                throw new InvalidInputException();
            
            nm.extractDigits(Integer.parseInt(num));
            int lastDigit = nm.findLastDigit();
            
            if (lastDigit == 10) {
                System.out.println("ISBN : " + num + "X");
            } else {
                System.out.println("ISBN : " + num + lastDigit);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}