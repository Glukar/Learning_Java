import java.util.*;
class ParneCifte {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, cifra;
    do {
      System.out.print("Unesite broj n: ");
      n = input.nextInt();
    } while(n < 0);
    do {
      cifra = n % 10;
      n = n / 10;
    } while (n > 0 && cifra % 2 == 0);
    if (cifra % 2 == 0) {
      System.out.println("Sve cifre unetog broja su parne.");
    } else {
      System.out.println("Cifra " + cifra + " nije parna.");
    }
  }
}