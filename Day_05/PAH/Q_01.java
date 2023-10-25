import java.util.*;

class Birds {
    Birds() {
        System.out.print("Birds : ");
    }
}

class Parrot extends Birds {
    Parrot() {
        System.out.println("Grey Parrot");
    }
}

class Cocktail extends Parrot {
    Cocktail() {
        System.out.println("Grey Cocoktail");
    }
}

class Kiwi extends Cocktail {
    Kiwi() {
        System.out.println("Grey Kiwi");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("Kiwi"))
            new Kiwi();
        else if (str.equals("Cocktail"))
            new Cocktail();
        else if (str.equals("Parrot"))
            new Parrot();
        else new Birds();
    }
}