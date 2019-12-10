public class HexToDecimalLab {
  public static int hexToDec(String hexNumber) {
    int decNumber = 0;
    // To be implement

    return decNumber;
  }

  public static void main(String[] args) {
    String hexNumber = "ABC";
    int decNumber = hexToDec(hexNumber);
    System.out.println("Hex Number " + hexNumber + " is equal to " + decNumber + " in decimal.");
    System.out.println("Expected result is:\n  Hex Number " + hexNumber + " is equal to 2748 in decimal.");
    System.out.println();

    hexNumber = "A";
    decNumber = hexToDec(hexNumber);
    System.out.println("Hex Number " + hexNumber + " is equal to " + decNumber + " in decimal.");
    System.out.println("Expected result is:\n  Hex Number " + hexNumber + " is equal to 10 in decimal.");
    System.out.println();

    hexNumber = "6";
    decNumber = hexToDec(hexNumber);
    System.out.println("Hex Number " + hexNumber + " is equal to " + decNumber + " in decimal.");
    System.out.println("Expected result is:\n  Hex Number " + hexNumber + " is equal to 6 in decimal.");
    System.out.println();

    hexNumber = "FFFF";
    decNumber = hexToDec(hexNumber);
    System.out.println("Hex Number " + hexNumber + " is equal to " + decNumber + " in decimal.");
    System.out.println("Expected result is:\n  Hex Number " + hexNumber + " is equal to 65535 in decimal.");
    System.out.println();
  }
}