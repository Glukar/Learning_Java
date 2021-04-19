/* Program koji ucitava dva broja, znak za operaciju (+: sabiranje,    *: mnozenje, /: deljenje), primenjuje datu operaciju na ucitane    brojeve i ispisuje rezultat izracunavanja. */
import java.util.Scanner;
class RekurzijaTest14 {
  public static void main(String[] args) {
    int prvi = prvi();
    int drugi = drugi();
    char op = op();
    int rez = rez(prvi, drugi, op);
    System.out.println("Vas rezultat je: " + rez);
  }
  public static int prvi() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite prvi broj: ");
    int a = input.nextInt();
    return a;
  }
  public static int drugi() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite drugi broj: ");
    int b = input.nextInt();
    return b;
  }
  public static char op() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite operaciju(+, *, /): ");
    char oper = input.next().charAt(0);
    return oper;
  }
  public static int rez(int a, int b, char op) {
    int rez;
    if (op == '+') {
      rez = a + b;
      return rez;
    } else if(op == '*') {
      rez = a * b;
      return rez;
    } else if(op == '/') {
      rez = a / b;
      return rez;
    } else {
      System.out.println("Niste uneli validnu operaciju.");
      return 0;
    }
  }
}