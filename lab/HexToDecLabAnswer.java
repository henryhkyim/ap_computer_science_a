public class HexToDecLabAnswer {
  public static int hexToDec(String hexNumber) {
    int decNumber = 0;
    int digit = 0;
    for (int i = 0; i < hexNumber.length(); i++) {
      if (hexNumber.charAt(i) == '0') {
        digit = 0;
      } else if (hexNumber.charAt(i) == '1') {
        digit = 1;
      } else if (hexNumber.charAt(i) == '2') {
        digit = 2;
      } else if (hexNumber.charAt(i) == '3') {
        digit = 3;
      } else if (hexNumber.charAt(i) == '4') {
        digit = 4;
      } else if (hexNumber.charAt(i) == '5') {
        digit = 5;
      } else if (hexNumber.charAt(i) == '6') {
        digit = 6;
      } else if (hexNumber.charAt(i) == '7') {
        digit = 7;
      } else if (hexNumber.charAt(i) == '8') {
        digit = 8;
      } else if (hexNumber.charAt(i) == '9') {
        digit = 9;
      } else if (hexNumber.charAt(i) == 'A') {
        digit = 10;
      } else if (hexNumber.charAt(i) == 'B') {
        digit = 11;
      } else if (hexNumber.charAt(i) == 'C') {
        digit = 12;
      } else if (hexNumber.charAt(i) == 'D') {
        digit = 13;
      } else if (hexNumber.charAt(i) == 'E') {
        digit = 14;
      } else if (hexNumber.charAt(i) == 'F') {
        digit = 15;
      }
      decNumber += digit * Math.pow(16, hexNumber.length() - 1 - i);
    }
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