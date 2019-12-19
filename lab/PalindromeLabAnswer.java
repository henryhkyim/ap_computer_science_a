public class PalindromeLabAnswer {
  public static boolean isPalindrome(String str) {
    String reverseString = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverseString = reverseString + str.charAt(i);
    }
    return str.equals(reverseString);
  }

  public static void testIsPalindrome(String str) {
    boolean palindrome = isPalindrome(str);
    if (palindrome) { 
      System.out.println(str + " is palindrome"); 
    } else { 
      System.out.println(str + " is not palindrome"); 
    }
    System.out.println();
  }

  public static void main(String[] args) {
    String[] strArr = {"ABCCBA", "ABC", "DEF", "ABA", "AAA"};
    for (String str : strArr) {
      testIsPalindrome(str);
    }
  }
}