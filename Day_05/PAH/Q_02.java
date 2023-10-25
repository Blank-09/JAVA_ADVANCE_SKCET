import java.util.*;

class Event {
    protected String name, detail, ownerName;
    
    public double projectedRevenue() {
        return 0.0;
    }
}

class Exhibition extends Event {
    protected int noOfStall;
    
    Exhibition(int noOfStall) {
        this.noOfStall = noOfStall;
    }
    
    public double projectedRevenue() {
        return noOfStall * 10000;
    }
}

class StageEvent extends Event {
    public int noOfShows, noOfSeatsPerShow;
    
    StageEvent(int noOfShows, int noOfSeatsPerShow) {
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }
    
    public double projectedRevenue() {
        return 50 * noOfShows * noOfSeatsPerShow;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name =  sc.nextLine();
        String detail =  sc.nextLine();
        String ownerName = sc.nextLine();
        
        int choice = sc.nextInt();
        Event event = new Event();
        
        if (choice == 1)
            event = new Exhibition(sc.nextInt());
        else if (choice == 2)
            event = new StageEvent(sc.nextInt(), sc.nextInt());
        
        System.out.println(event.projectedRevenue());
    }
}
