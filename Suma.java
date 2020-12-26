import java.util.*;
class Suma {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, i;
    double rez;
    // Unos prirodnog broja n;
    System.out.print("Unesite prirodan broj n: ");
    n = input.nextInt();
    // izracunavanje sume
    rez = 0.0;
    for (i = 1; i <= n; i++) {
      rez = rez + 1.0 / i;
    }
    // ispis rezultata
    System.out.println("Suma 1/i,  i= 1..." + n + " je " + rez);
  }
}