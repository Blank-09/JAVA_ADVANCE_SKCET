import java.util.*;
import java.util.regex.*;

class WeakPasswordException extends Exception {
    @Override
    public String toString() {
        return "Your password is weak\nWeakPasswordException";
    }
}

class User {
    String name, mobile, username, password;

    User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " " + mobile + " " + username + " " + password;
    }
}

class UserBO {
    public static void validate(User u) throws Exception {
        String pwd = u.password;
        
        if (!(
            Pattern.matches("^.{10,20}$", pwd) &&
            Pattern.matches(".*\\d.*", pwd) &&
            Pattern.matches(".*[!@#$%^&*].*", pwd)
        )) {
            throw new WeakPasswordException();
        }
        
        System.out.println(u);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(sc.next(), sc.next(), sc.next(), sc.next());
        
        try {
            UserBO.validate(user);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}