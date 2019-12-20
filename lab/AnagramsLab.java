public class AnagramsLab {
  public static boolean isAnagrams(String str1, String str2) {
    // To be implement
    return false;
  }

  public static void testIsAnagrams(String str) {
    String[] strs = str.split(",");
    boolean anagrams = isAnagrams(strs[0], strs[1]);
    if (anagrams) { 
      System.out.println(strs[0] + " and " + strs[1] + " is anagrams"); 
    } else { 
      System.out.println(strs[0] + " and " + strs[1] + " is not anagrams"); 
    }
    System.out.println();
  }

  public static void main(String[] args) {
    String[] strArr = {"anagramm,marganaa", "Hello,hello", "DEFE,feed", "cool,colo", "cool,color"};
    for (String str : strArr) {
      testIsAnagrams(str);
    }
  }
}