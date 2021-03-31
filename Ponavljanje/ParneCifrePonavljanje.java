/* Napisati program koji ucitava prirodan broj i proverava    da li su sve cifre unetog broja parne. */
import java.util.Scanner;
class ParneCifreVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    boolean paran = true;
    int n;
    do {
      System.out.print("Unesite broj n: ");
      n = input.nextInt();
    } while (n < 0);
    do {
    int cifra = n % 10;
    n /= 10;
    if (cifra % 2 != 0) {
      paran = false;
    }
    } while (n != 0 && paran);
    if (paran) {
      System.out.println("Vas broj je paran");
    } else {
        System.out.println("Vas broj je neparan");
      }
  }
}