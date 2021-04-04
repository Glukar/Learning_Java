import java.util.Scanner;
class RekurzijaTest3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj m: ");
    int m = input.nextInt();
    System.out.print(broj(m));
  }
//  static void broj(int n) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Unesite broj: ");
//    n = input.nextInt();
//    System.out.println(n);
//  }
  static int broj(int n) {
    Scanner operacija = new Scanner(System.in);
    System.out.println(n);
    System.out.print("Izaberite operaciju(+, -, *, /): ");
    char op = operacija.next().charAt(0);
    if (op == '+') {
      return n + n;
    } else if (op == '-') {
      return  n - n;
    } else if (op == '*') {
      return n * n;
    } else if (op == '/') {
      return n / n;
    } else {
      System.out.print("Niste uneli validnu operaciju.");
      return n;
    }
  }
}