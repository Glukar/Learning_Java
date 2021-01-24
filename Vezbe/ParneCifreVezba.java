import java.util.*;
class ParneCifreVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, broj = 0, skup = 0;
    System.out.print("Unesite broj za koji zelite da proverite da li su sve njegove cifre parne: ");
    n = input.nextInt();
    do {
      broj = n % 10;
      skup = broj + skup;
      n = n / 10;
      skup = skup % 2;
      if (skup == 1) {
        break;
      } else {
        continue;
      }
    } while (n != 0);
    if (skup == 1) {
     System.out.println("Broj: " + broj + " nije paran.");
    } else {
      System.out.println("Svaka cifra vaseg broja je parna.");
    }
  }
}