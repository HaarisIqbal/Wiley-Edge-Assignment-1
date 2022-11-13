/**
 * RockPaperScissors class, for Wiley Edge Assignment 1, November 2022.
 *
 * @author Haaris Iqbal
 */

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  /**
   * main method running RockPaperScissors program in terminal.
   *
   * @param args the input arguments.
   */
  public static void main(String[] args) {
    // Initializing key variables.
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    HashMap<String, Integer> results = new HashMap<String, Integer>();

    System.out.println("Welcome to Rock Paper Scissors!");

    // Main loop of the program.
    while (loop) {
      // (Re)set data.
      results.put("Rounds", 0);
      results.put("Wins", 0);
      results.put("Draws", 0);
      results.put("Losses", 0);

      // Introduction - getting number of rounds.
      System.out.print("Please enter the the number of rounds you would like to play (1-10): ");
      int rounds = scanner.nextInt();

      // Guard clause - checking if int input is in valid range.
      if (rounds < 1 || rounds > 10) {
        System.out.println("\nUnfortunately, this number is not within the valid range.");
        System.out.println("Terminating program.");
        return;
      }

      // Playing requested number of rounds.
      for (int i = 0; i < rounds; i++) {
        // Obtaining user choice.
        System.out.println("\n1 = Rock | 2 = Paper | 3 = Scissors");
        System.out.print("Please enter your choice as a number (1-3): ");
        int humanChoice = scanner.nextInt();

        // Guard clause - checking if choice input is in valid range.
        if (humanChoice < 1 || humanChoice > 3) {
          System.out.println("\nUnfortunately, this is not a valid move.");
          System.out.println("This round will be skipped.");
          continue;
        }

        // Generating computer choice - number between 1 and 3 inclusive.
        int computerChoice = new Random().nextInt(4-1)+1;

        // Switch statement to calculate outcome.
        switch (humanChoice) {
          case 1:
            System.out.println("\nYou played Rock.");

            // Determining result based on computer selection.
            switch (computerChoice) {
              case 1:
                System.out.println("The computer played Rock.");
                System.out.println("This round was a draw.");

                // Updating scores.
                results.put("Draws", results.get("Draws")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 2:
                System.out.println("The computer played Paper.");
                System.out.println("Paper wraps Rock. The computer wins this round.");

                // Updating scores.
                results.put("Losses", results.get("Losses")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 3:
                System.out.println("The computer played Scissors.");
                System.out.println("Rock breaks scissors. You win this round.");

                // Updating scores.
                results.put("Wins", results.get("Wins")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
            } // End of inner "switch" statement (1/3).

            break;
          case 2:
            System.out.println("\nYou played Paper.");

            // Determining result based on computer selection.
            switch (computerChoice) {
              case 1:
                System.out.println("The computer played Rock.");
                System.out.println("Paper wraps Rock. You win this round.");

                // Updating scores.
                results.put("Wins", results.get("Wins")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 2:
                System.out.println("The computer played Paper.");
                System.out.println("This round was a draw.");

                // Updating scores.
                results.put("Draws", results.get("Draws")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 3:
                System.out.println("The computer played Scissors.");
                System.out.println("Scissors cuts paper. The computer wins this round.");

                // Updating scores.
                results.put("Losses", results.get("Losses")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
            } // End of inner "switch" statement (2/3).

            break;
          case 3:
            System.out.println("\nYou played Scissors.");

            // Determining result based on computer selection.
            switch (computerChoice) {
              case 1:
                System.out.println("The computer played Rock.");
                System.out.println("Rock breaks scissors. The computer wins this round.");

                // Updating scores.
                results.put("Losses", results.get("Losses")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 2:
                System.out.println("The computer played Paper.");
                System.out.println("Scissors cuts paper. You win this round.");

                // Updating scores.
                results.put("Wins", results.get("Wins")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
              case 3:
                System.out.println("The computer played Scissors.");
                System.out.println("This round was a draw.");

                // Updating scores.
                results.put("Draws", results.get("Draws")+1);
                results.put("Rounds", results.get("Rounds")+1);
                break;
            } // End of inner "switch" statement (3/3).

            break;
        } // End of outer "switch" statement.
      } // End of "for" loop.

      // Game over - presenting stats.
      System.out.println("\n**********\n");
      System.out.println("The game is now over! Here are your stats:");
      System.out.println("* Rounds Played: " + results.get("Rounds"));
      System.out.println("* Wins: " + results.get("Wins"));
      System.out.println("* Draws: " + results.get("Draws"));
      System.out.println("* Losses: " + results.get("Losses"));

      // Determining winner.
      String winner = "No one - It's a draw!";

      if (results.get("Wins") > results.get("Losses")) {
        winner = "You, the player!";
        if (results.get("Draws") > results.get("Wins")) {
          winner = "No one - It's a draw!";
        }
      } else if (results.get("Losses") > results.get("Wins")) {
        winner = "The computer!";
        if (results.get("Draws") > results.get("Losses")) {
          winner = "No one - It's a draw!";
        }
      }

      System.out.println("\nThe Overall Winner is: " + winner);

      // Determining whether to end program.
      System.out.print("\nWould you like to play again? (1 = yes || 0 = no): ");
      int keepLoop = scanner.nextInt();

      if (keepLoop == 0) {
        loop = false;
      } else if (keepLoop == 1){
        System.out.println("\nUnderstood, looping program to start.\n");
      } else {
        System.out.println("\nInvalid input, automatically selecting 0.");
        loop = false;
      }
    } // End of "while" loop.

    // Conclusive remark.
    System.out.println("\nThanks for playing! Terminating program now.");
    scanner.close();
  } // End of "main" method.
}
