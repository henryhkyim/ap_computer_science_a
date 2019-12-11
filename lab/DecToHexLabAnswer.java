public class DecToHexLabAnswer {
  public static int powerOf16(int number) {
    if (number < 16) {
      return 0;
    } else {
      return 1 + powerOf16(number / 16);
    }
  }

  public static String decToHex(int decNumber) {
    String hexNumber = "";
    if (decNumber < 10) {
      hexNumber = Integer.toString(decNumber);
    } else if (decNumber == 10) {
      hexNumber = "A";
    } else if (decNumber == 11) {
      hexNumber = "B";
    } else if (decNumber == 12) {
      hexNumber = "C";
    } else if (decNumber == 13) {
      hexNumber = "D";
    } else if (decNumber == 14) {
      hexNumber = "E";
    } else if (decNumber == 15) {
      hexNumber = "F";
    } else {
      int power = powerOf16(decNumber);
      int digit = decNumber / (int) Math.pow(16, power);
      decNumber -= digit * (int) Math.pow(16, power);
      if (digit < 10) {
        hexNumber = Integer.toString(digit);
      } else if (digit == 10) {
        hexNumber = "A";
      } else if (digit == 11) {
        hexNumber = "B";
      } else if (digit == 12) {
        hexNumber = "C";
      } else if (digit == 13) {
        hexNumber = "D";
      } else if (digit == 14) {
        hexNumber = "E";
      } else if (digit == 15) {
        hexNumber = "F";
      }
      String restHexString = decToHex(decNumber);
      if (power > restHexString.length()) {
        for (int i = 0; i < (power - restHexString.length()); i++) {
          hexNumber += "0";
        }
      }
      hexNumber += restHexString;
    }
    return hexNumber;
  }

  public static void main(String[] args) {
    int decNumber = 2748;
    String hexNumber = decToHex(decNumber);
    System.out.println("Dec Number " + decNumber + " is equal to " + hexNumber + " in Hexadecimal.");
    System.out.println("Expected result is:\n  Dec Number " + decNumber + " is equal to ABC in Hexadecimal.");
    System.out.println();

    decNumber = 10;
    hexNumber = decToHex(decNumber);
    System.out.println("Dec Number " + decNumber + " is equal to " + hexNumber + " in Hexadecimal.");
    System.out.println("Expected result is:\n  Dec Number " + decNumber + " is equal to A in Hexadecimal.");
    System.out.println();

    decNumber = 259;
    hexNumber = decToHex(decNumber);
    System.out.println("Dec Number " + decNumber + " is equal to " + hexNumber + " in Hexadecimal.");
    System.out.println("Expected result is:\n  Dec Number " + decNumber + " is equal to 103 in Hexadecimal.");
    System.out.println();

    decNumber = 65535;
    hexNumber = decToHex(decNumber);
    System.out.println("Dec Number " + decNumber + " is equal to " + hexNumber + " in Hexadecimal.");
    System.out.println("Expected result is:\n  Dec Number " + decNumber + " is equal to FFFF in Hexadecimal.");
    System.out.println();

    decNumber = 4195087;
    hexNumber = decToHex(decNumber);
    System.out.println("Dec Number " + decNumber + " is equal to " + hexNumber + " in Hexadecimal.");
    System.out.println("Expected result is:\n  Dec Number " + decNumber + " is equal to 40030F in Hexadecimal.");
    System.out.println();
  }
}