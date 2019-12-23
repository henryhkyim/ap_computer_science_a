import java.util.Scanner;
import java.util.ArrayList;

public class MasterMind {
  public static int[] generateSecret() {
    int[] secret = new int[3];
    for (int i = 0; i < secret.length; i++) {
      secret[i] = (int) (Math.random() * 10);
    }

    return secret;
  }

  public static void printSecret(int[] secret, boolean show) {
    System.out.print("Secret is {");
    for (int i : secret) {
      if (show) {
        System.out.print(" " + i);
      } else {
        System.out.print(" *");
      }
    }
    System.out.println(" }");
  }

  public static int[] readGuess() {
    int[] guess = new int[3];
    System.out.println("--------------------------------------------");
    System.out.println("Please input your guess, separated by space");
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < guess.length; i++) {
      guess[i] = scanner.nextInt();
    }
    System.out.println("Your input: " + guess[0] + " " + guess[1] + " " + guess[2]);
    return guess;
  }

  public static boolean checkResult(int[] secret, int[] guess) {
    int blackCount = 0;
    int whiteCount = 0;
    ArrayList<Integer> tmpSecret = new ArrayList<Integer>();
    ArrayList<Integer> tmpGuess = new ArrayList<Integer>();
    for (int i = 0; i < secret.length; i++) {
      if (secret[i] == guess[i]) {
        blackCount++;
      } else {
        tmpSecret.add(secret[i]);
        tmpGuess.add(guess[i]);
      }
    }
    for (int g : tmpGuess) {
      int idx = tmpSecret.indexOf(g);
      if (idx != -1) {
        whiteCount++;
        tmpSecret.remove(idx);
      }
    }
    if (blackCount == 3) {
      return true;
    } else {
      System.out.println("Hints: " + blackCount + " black and " + whiteCount + " white pegs");
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Welcome to this MasterMind game!");
    System.out.println("  - There is a secret of 3 numbers between 0 and 9, you have 10 attempts to guess the secret");
    System.out.println("  - A hint with black and white pegs will be given for each guess attempt");
    System.out.println("  - A black peg indicates a number guess correctly and in the rigth position");
    System.out.println("  - A white peg indicates a number guess correctly but in a wrong position");

    int[] secret = generateSecret();
    int attempt = 0;
    int[] guess;
    boolean result = false;
    while (attempt < 10) {
      printSecret(secret, true);
      System.out.println("\tYou have " + (10-attempt) + " more attempts");
      guess = readGuess();
      attempt++;
      result = checkResult(secret, guess);
      if (result) {
        System.out.println("BINGO! You get it right in the " + attempt + " attempt(s).");
        printSecret(secret, true);
        break;
      }
    }
    if (!result) {
      System.out.println("Game over! You failed to guess the secret in the 10 attempts.");
      printSecret(secret, true);
    }
  }
}