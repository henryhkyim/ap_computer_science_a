public class CapitalizeSentenceLabAnswer {
  public static String capitalize(String sentence) {
    String capitalizeSentence = "";
    String[] words = sentence.split(" ");
    for (String word : words) {
      if (capitalizeSentence.length() > 0) {
        capitalizeSentence = capitalizeSentence + " " + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
      } else {
        capitalizeSentence = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
      }
    }
    return capitalizeSentence;
  }

  public static void main(String[] args) {
    String sentence = "This is a testing senTENCE";
    String capitalizeSentence = capitalize(sentence);
    System.out.println("Origianl: " + sentence);
    System.out.println("Capitalized: " + capitalizeSentence);
    System.out.println("Expected result is:\n  This Is A Testing Sentence");
    System.out.println();

    sentence = "aAA bBB cCC dDD eEE fFF";
    capitalizeSentence = capitalize(sentence);
    System.out.println("Origianl: " + sentence);
    System.out.println("Capitalized: " + capitalizeSentence);
    System.out.println("Expected result is:\n  Aaa Bbb Ccc Ddd Eee Fff");
    System.out.println();

    sentence = "THISISANOTHERTESTCASE";
    capitalizeSentence = capitalize(sentence);
    System.out.println("Origianl: " + sentence);
    System.out.println("Capitalized: " + capitalizeSentence);
    System.out.println("Expected result is:\n  Thisisanothertestcase");
    System.out.println();
  }
}
