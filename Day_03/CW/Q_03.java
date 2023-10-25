import java.util.*;

class Innings {
    
    private String battingTeam;
    private long runs;
    
    Innings() {
        battingTeam = "";
        runs = 0;
    }
    
    Innings(String battingTeam, long runs) {
        this.battingTeam = battingTeam;
        this.runs = runs;
    }
    
    String getBattingTeam() {
        return battingTeam;
    }
    
    void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }
    
    long getRuns() {
        return runs;
    }
    
    void setRuns(long runs) {
        this.runs = runs;
    }
    
    public void displayInningsDetails() {
        System.out.println("BattingTeam : " + battingTeam);
        System.out.println("Runs scored : " + runs);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Innings[] igs = new Innings[2];
        
        for (int i = 0; i < igs.length; i++) {
            Innings ig = new Innings( sc.next(), sc.nextLong());
            igs[i] = ig;
        }
        
        for (int i = 0; i < igs.length; i++) {
            System.out.println("Innings " + (i+1) + " Details");
            igs[i].displayInningsDetails();
        }
        
        sc.close();
    }
}