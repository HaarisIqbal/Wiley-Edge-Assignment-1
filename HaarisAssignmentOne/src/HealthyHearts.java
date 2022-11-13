/**
 * HealthyHearts class, for Wiley Edge Assignment 1, November 2022.
 *
 * @author Haaris Iqbal
 */

import java.util.Scanner;

public class HealthyHearts {
  /**
   * Main method running HealthyHearts program in terminal.
   *
   * @param args the input arguments.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Introduction - getting human age.
    System.out.print("What is your age: ");
    int input = scanner.nextInt();

    // Calculating maximum heart rate.
    int maximumHeartRate = 220-input;
    System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");

    // Calculating target heart rate zone.
    int lowerRange = (int) Math.ceil((maximumHeartRate*50.0)/100.0);
    int upperRange = (int) Math.ceil((maximumHeartRate*85.0)/100.0);
    System.out.println("Your target HR Zone is " + lowerRange + " - " + upperRange + " beats per minute.");

    scanner.close();
  }
}
