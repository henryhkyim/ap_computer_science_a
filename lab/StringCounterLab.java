public class StringCounterLab {
  private String str;
  public StringCounterLab(String str) {
    this.str = str;
  }
  public int count(String pattern) {
    int count = 0;
    // To be implemented
    return count;
  }
  public static void main(String[] args) {
    String str = "aaaaa";
    StringCounterLab sc = new StringCounterLab(str);
    String pattern = "aa";
    int count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 4");
    System.out.println();

    str = "The cat ate late";
    sc = new StringCounterLab(str);
    pattern = "at";
    count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 3");
    System.out.println();

    str = "This is a test for zero count";
    sc = new StringCounterLab(str);
    pattern = "whatever";
    count = sc.count(pattern);
    System.out.println("Number of \"" + pattern + "\" in string \"" + str + "\" is " + count);
    System.out.println("Expected result is:\n  Number of \"" + pattern + "\" in string \"" + str + "\" is 0");
    System.out.println();
  }
}
