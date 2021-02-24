class MetodTest {

  static void stampajInterval(int a, int b) {
    for (int i = a; i <= b; i++) {
      System.out.print(" " + i);
    }
  }
  
  static boolean jeOperacija(char c) {
    return c == '+' || c == '-' || c == '*' || c == '/';
  }
  
  public static void main(String[] args) {
    stampajInterval(5, 10);
    System.out.println();
    System.out.print("Unesite znak operacije (+, -, *, /): ");
    char c = Svetovid.in.readChar();
    if (jeOperacija(c)) {
      System.out.println("Uneli ste znak operacije " + c + ", hvala!");
    }
    else {
      System.out.println("Niste uneli znak operacije. C c c...");
    }
  }
}