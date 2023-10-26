import java.util.*;

class DotException extends Exception {
    @Override
    public String toString() {
        return "DotException: Invalid Dot usage";
    }
}

class AtTheRateException extends Exception {
    @Override
    public String toString() {
        return "AtTheRateException: Invalid @ usage";
    }
}

class DomainException extends Exception {
    @Override
    public String toString() {
        return "DomainException: Invalid Domain";
    }
}


public class Main {
    public static String[] domains = { "in", "com", "net", "biz" };
    
    public static boolean isValidDomain(String email) {
        String domain = email.substring(email.lastIndexOf(".")+1, email.length());
        boolean isFound = false;
        
        for (int i = 0; i < domains.length; i++) {
            isFound = isFound || domains[i].equals(domain);
        }
        
        return isFound;
    }
    
    public static boolean isValidDot(String email) {
        int count = 0;
        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.') count++;
        }
        
        return count == 1;
    }
    
    public static boolean isValidAtTheRate(String email) {
        int count = 0;
        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') count++;
        }
        
        return count == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        
        try {
            if (!isValidDot(email))
                throw new DotException();
            
            if (!isValidAtTheRate(email)) 
                throw new AtTheRateException();
            
            if (!isValidDomain(email)) 
                throw new DomainException();
            
            System.out.println("Valid email address");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Invalid email address");
        }
        
        sc.close();
    }
}