public class StringCounterLabAnswer {
  private String str;
  public StringCounterLabAnswer(String str) {
    this.str = str;
  }
  public int count(String pattern) {
    int count = 0;
    String tmpStr = new String(str);
    while (tmpStr.indexOf(pattern) != -1) {
      count++;
      tmpStr = tmpStr.substring(tmpStr.indexOf(pattern) + 1);
    }
    return count;
  }
  public static void main(String[] args) {
    String str = "aaaaa";
    StringCounterLabAnswer sc = new StringCounterLabAnswer(str);
    String pattern = "aa";
    int count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 4");
    System.out.println();

    str = "The cat ate late";
    sc = new StringCounterLabAnswer(str);
    pattern = "at";
    count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 3");
    System.out.println();

    str = "This is a test for zero count";
    sc = new StringCounterLabAnswer(str);
    pattern = "whatever";
    count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 0");
    System.out.println();
  }
}
