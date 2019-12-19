public class PalindromeLab {
  public static boolean isPalindrome(String str) {
    boolean palindrome = false;
    // To be implement
    return palindrome;
  }

  public static void testIsPalindrome(String str) {
    boolean palindrome = isPalindrome(str);
    if (palindrome) { 
      System.out.println(str + " is palindrome"); 
    } else { 
      System.out.println(str + " is not palindrome"); 
    }
    System.out.println("Expected result is:\n  " + str + " is palindrome.");
    System.out.println();
  }

  public static void main(String[] args) {
    String[] strArr = {"ABCCBA", "ABC", "DEF", "ABA", "AAA"};
    for (String str : strArr) {
      testIsPalindrome(str);
    }
  }
}