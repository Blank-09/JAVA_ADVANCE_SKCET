import java.util.Scanner;

public class Main {

  public void alph(char ch) {
    ch = Character.toLowerCase(ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.print(ch + " :vowel");
    } else {
      System.out.print(ch + " :consonant");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    Main obj = new Main();
    obj.alph(ch);
  }
}