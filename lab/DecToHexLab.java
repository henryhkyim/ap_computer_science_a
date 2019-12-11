public class DecToHexLab {
  public static String decToHex(int decNumber) {
    String hexNumber = "";

    // To be implemented

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