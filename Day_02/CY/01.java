import java.util.*;

class User {
    private String name, mob, username, password;
    
    public User() {
        name = mob = username = password = "";
    }
    
    public User(String name, String mob, String username, String password) {
        this.name = name;
        this.mob = mob;
        this.username = username;
        this.password = password;
    }
    
    String getName() { return name; }
    String getMob() { return mob; }
    String getUsername() { return username; }
    String getPassword() { return password; }
    
}

class UserBO {
    public void displayAll(User[] userArray) {
        for (User user: userArray) {
            System.out.println(user.getName() + " " + user.getMob() + " " +
                user.getUsername() + " " + user.getPassword());
        }
    }
    
    public boolean deleteUser(User[] userArray, String name) {
        for (User user: userArray) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        User[] users = new User[n];
        
        for (int i = 0; i < n; i++) {
            users[i] = new User(sc.next(), sc.next(), sc.next(), sc.next());
        }
        
        String removeUserByName = sc.next();
        
        UserBO ubo = new UserBO();
        ubo.displayAll(users);
        
        if (ubo.deleteUser(users, removeUserByName)) {
            System.out.println("User deleted successfully");
        } else {
            System.out.println("No user found with the given name");
        }
    }
}