import java.util.*;

class Player {
    public String name, country, skill;
    
    Player(String details) {
        String[] arr = details.split(",");
        name = arr[0];
        country = arr[1];
        skill = arr[2];
    }
    
    public void displayPlayer() {
        System.out.println("Player Details");
        System.out.println("Player Name: " + name);
        System.out.println("Country Name: " + country);
        System.out.println("Skill: " + skill);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Player pl = new Player(str);
        pl.displayPlayer();
        
        sc.close();
    }
}