import java.util.*;

class Innings {
    
    public String number, battingTeam;
    public long runs;
    
    public void displayInningsDetails() {
        System.out.println("Innings Details");
        System.out.println("Innings number: " + number);
        System.out.println("Batting Team : " + battingTeam);
        System.out.println("Runs scored :" + runs);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Innings igs = new Innings();
        igs.number = sc.nextLine();
        igs.battingTeam = sc.nextLine();
        igs.runs = sc.nextLong();
        
        igs.displayInningsDetails();
    }
}