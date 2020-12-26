import java.util.*;
class NajveciN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double a, b, bNaN;
    int n;
    
    do {
      System.out.print("Unesite realan broj a > 1.0: ");
      a = input.nextDouble();
    } while (a <= 1.0);
    do {
      System.out.print("Unesite realan broj b > 1.0: ");
      b = input.nextDouble();
    } while (b <= 1.0);
    n = 0;
    bNaN = 1.0;
    while (a > bNaN) {
      n++;
      bNaN *= b;
    }
    System.out.println("Najveci n takav da a > b^n je " + (n-1));
  }
}