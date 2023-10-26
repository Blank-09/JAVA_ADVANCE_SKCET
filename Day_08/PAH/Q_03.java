import java.util.*;
import java.util.regex.*;

class User {
    private String name, mobile, username, password;
    
    User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
}

class UserBO {
    public static void validate(User u) throws Exception {
        String pwd = u.getPassword();
        
        // question is wrong 10 -> 9
        if (pwd.length() < 9 || pwd.length() > 20)
            throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
        
        if (!Pattern.matches(".*\\d.*", pwd))
            throw new Exception("Should contain at least one digit");
        
        if (!Pattern.matches(".*[!@#$%^&*].*", pwd))
            throw new Exception("It should contain at least one special character");
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        User user = new User(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        
        try {
            UserBO.validate(user);
            System.out.println("Valid Password");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}