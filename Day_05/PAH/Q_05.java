import java.util.*;

class Player {
    private String pName, gameType;
    private int pAge;
    
    public void setName(String name) {
        pName = name;
    }
    
    public String getName() {
        return pName;
    }
    
    public void setGameType(String type) {
        gameType = type;
    }
    
    public String getGameType() {
        return gameType;
    }
    
    public void setPAge(int age) {
        pAge = age;
    }
    
    public int getPAge() {
        return pAge;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player pl = new Player();
        
        pl.setName(sc.nextLine());
        pl.setPAge(sc.nextInt());
        pl.setGameType(sc.next());
        
        System.out.println("Player's Name: " + pl.getName());
        System.out.println("Player's Age: " + pl.getPAge());
        System.out.println("Player's Gametype: " + pl.getGameType());

    }
}