/**
 * DogGenetics class, for Wiley Edge Assignment 1, November 2022.
 *
 * @author Haaris Iqbal
 */

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
  /**
   * main method running DogGenetics program in terminal.
   *
   * @param args the input arguments.
   */
  public static void main(String[] args) {
    // Initializing key variables.
    Scanner scanner = new Scanner(System.in);
    String[] dogTypes = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

    // Introduction - getting dog name.
    System.out.print("What is your dogs name: ");
    String input = scanner.nextLine();

    // Producing report.
    System.out.println("Well then, I have this highly reliable, not-at-all-random report on " + input + "'s prestigious background right here.");
    System.out.println("\n" + input + " is: \n");

    // All cases before final - generate random numbers without exceeding a total of 100.
    int remainder = 100;

    for (int i = 0; i < dogTypes.length-1; i++) {
      int randomNumber = new Random().nextInt(75-1)+1;

      if (randomNumber < remainder) {
        System.out.println(randomNumber + "% " + dogTypes[i]);
        remainder = remainder-randomNumber; // Keeping track of remaining amount.
      } else {
        System.out.println(0 + "% " + dogTypes[i]);
      }
    }

    // In final case, present remaining percentage to reach 100%.
    System.out.println(remainder + "% " + dogTypes[dogTypes.length-1] + "\n");

    // Conclusive remark.
    System.out.println("Wow, what a diverse dog!");
    scanner.close();
  }
}

