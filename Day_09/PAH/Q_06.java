import java.util.*;

class Card implements Comparable<Card> {
    char symbol;
    int number;
    
    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    
    public int compareTo(Card o) {
        return symbol - o.symbol;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Card> cards = new TreeSet();
        
        int count = 0;
        while (sc.hasNext()) {
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            cards.add(new Card(symbol, number));
            count++;
        }
        
        System.out.printf("Four symbols gathered in %d cards\n", count);
        System.out.println("Cards in Set are:");
        
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}