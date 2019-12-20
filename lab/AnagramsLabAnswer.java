public class AnagramsLabAnswer {
  public static int charCountInStr(String str, char ch) {
    int count = 0;
    String upperStr = str.toUpperCase();
    ch = Character.toUpperCase(ch);
    for (int i = 0; i < upperStr.length(); i++) {
      if (ch == upperStr.charAt(i)) {
        count++;
      }
    }
    return count;
  }

  public static boolean isAnagrams(String str1, String str2) {
    String allChars = "";
    for (int i = 0; i < str1.length(); i++) {
      if (allChars.indexOf(Character.toUpperCase(str1.charAt(i))) == -1) {
        allChars += Character.toUpperCase(str1.charAt(i));
      }
    }
    for (int i = 0; i < str2.length(); i++) {
      if (allChars.indexOf(Character.toUpperCase(str2.charAt(i))) == -1) {
        allChars += Character.toUpperCase(str2.charAt(i));
      }
    }
    char ch;
    for (int i = 0; i < allChars.length(); i++) {
      ch = allChars.charAt(i);
      if (charCountInStr(str1, ch) != charCountInStr(str2, ch)) {
        return false;
      }
    }
    return true;
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