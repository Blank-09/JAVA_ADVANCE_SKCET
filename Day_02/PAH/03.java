import java.util.*;

public class Main {
    
    static class Money {
        private int rupee, paisa;
        
        public int getRupee() { return rupee; }
        public int getPaisa() { return paisa; }

        public void setRupee(int num) { rupee = num; }
        public void setPaisa(int num) { paisa = num; }
        
        public float sum(Money m) {
            return (rupee + m.rupee) + (paisa + m.paisa) / 100f;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money m1 = new Money();
        Money m2 = new Money();
        
        m1.setRupee(sc.nextInt());
        m1.setPaisa(sc.nextInt());
        
        m2.setRupee(sc.nextInt());
        m2.setPaisa(sc.nextInt());
        
        System.out.printf("%.2f", m1.sum(m2));
    }
}