/**
 * SummativeSums class, for Wiley Edge Assignment 1, November 2022.
 *
 * @author Haaris Iqbal
 */

public class SummativeSums {
  /**
   * arraySum method, iterating though array and summing integers.
   *
   * @param arr the one-dimensional integer array to iterate though and sum.
   * @return Returns an integer that is the sum of all integers in arr.
   */
  private static int arraySum(int[] arr) {
    int sum = 0;

    // Iteration through array to sum integers.
    for (int num : arr) {
      sum += num;
    }

    return sum;
  } // End of "arraySum" method.

  /**
   * main method of the program, running arraySum method.
   *
   * @param args the input arguments.
   */
  public static void main(String[] args) {
    // Variables with example data.
    int[] exampleOne = {1, 90, -33, -55, 67, -16, 28, -55, 15};
    int[] exampleTwo = {999, -60, -77, 14, 160, 301};
    int[] exampleThree = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

    // Displaying results of arraySum method using example data.
    System.out.println("#1 Array Sum: " + arraySum(exampleOne));
    System.out.println("#2 Array Sum: " + arraySum(exampleTwo));
    System.out.println("#3 Array Sum: " + arraySum(exampleThree));
  } // End of "main" method.
}
