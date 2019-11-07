class Factorial {
  public static int factorial(int x) {
  System.out.println("factorial " + x + " start");
  int result = 0;
  if (x == 1) {
    result = 1;
  } else {
    result = x * factorial(x-1);
  }
  System.out.println("factorial " + x + " end");
  return result;
  }
  public static void main(String args[]) {
    System.out.println("Factorial(5) = " + factorial(5));
  }
}