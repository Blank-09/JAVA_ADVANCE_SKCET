import java.util.*;

class Games {
    public int height, width;
    
    Games(int h, int w) {
        height = h;
        width = w;
    }
}

class Carrom extends Games {
    Carrom(int n) {
        super(n, n);
    }
    
    void display() {
        System.out.printf("Area of the Carrom: %dcm\n", height * width);
    }
}
class TT extends Games {
    TT(int h, int w) {
        super(h, w);
    }
    
    void display() {
        System.out.printf("Area of the TT: %dcm\n", height * width);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        new Carrom(sc.nextInt()).display();
        new TT(sc.nextInt(),sc.nextInt()).display();
    }
}