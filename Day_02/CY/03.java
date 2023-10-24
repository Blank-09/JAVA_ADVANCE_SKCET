import java.util.*;
import java.util.regex.*;

class EmailValidation {
    public boolean checkEmail(String email) {
        
        Pattern pat = Pattern.compile("^\\w+@\\w+\\.(com|in|net|biz)$");
        Matcher mat = pat.matcher(email);
        
        return mat.find();
    }
}

class EmailValidationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String email = sc.next();
        EmailValidation ev = new EmailValidation();
        
        if (ev.checkEmail(email)) {
            System.out.println("Valid : " + email);
        } else {
            System.out.println("Invalid : " + email);
        }

    }
}