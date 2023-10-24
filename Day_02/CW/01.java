import java.util.*;

class Player {
  public String name;
  public String country;
  public String skill;

  Player(String name, String country, String skill) {
    this.name = name;
    this.country = country;
    this.skill = skill;
  }

  public void display() {
    System.out.println("Player Details");
    System.out.println("Player Name: " + name);
    System.out.println("Country Name: " + country);
    System.out.println("Skill : " + skill);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Player pl = new Player(
        sc.nextLine(), sc.nextLine(), sc.nextLine());

    pl.display();
  }
}