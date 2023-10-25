import java.util.*;

class Bicycle {
    public int gears, speed;
}

class MontaneBike extends Bicycle {
    public int seatHeight;
    
    MontaneBike(int gears, int speed, int seatHeight) {
        this.gears = gears;
        this.speed = speed;
        this.seatHeight = seatHeight;
    }
    
    @Override
    public String toString() {
        return (
            "No of gears are " + gears + "\n" +
            "speed of bicycle is " + speed + "\n" +
            "seat height is " + seatHeight
        );
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gears = sc.nextInt();
        int speed = sc.nextInt();
        int height = sc.nextInt();
        
        MontaneBike mb = new MontaneBike(gears, speed, height);
        System.out.print(mb);
    }
}