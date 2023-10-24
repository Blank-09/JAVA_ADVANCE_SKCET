import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double brandingExpenses = sc.nextDouble();
    double travelExpenses = sc.nextDouble();
    double foodExpenses = sc.nextDouble();
    double logisticsExpenses = sc.nextDouble();

    double total = brandingExpenses + travelExpenses +
        foodExpenses + logisticsExpenses;

    double brandingPercent = (brandingExpenses / total) * 100;
    double travelPercent = (travelExpenses / total) * 100;
    double foodPercent = (foodExpenses / total) * 100;
    double logisticsPercent = (logisticsExpenses / total) * 100;

    System.out.printf("Total expenses : Rs.%.2f", total);
    System.out.printf("\nBranding expenses percentage : %.2f%c", brandingPercent, '%');
    System.out.printf("\nTravel expenses percentage : %.2f%c", travelPercent, '%');
    System.out.printf("\nFood expenses percentage : %.2f%c", foodPercent, '%');
    System.out.printf("\nLogistics expenses percentage : %.2f%c", logisticsPercent, '%');

    sc.close();
  }
}