import java.util.*;
class Minimum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, x, i, min;
    // Ucitavanje broja brojeva
    System.out.print("Unesite ceo broj n, n > 0: ");
    n = input.nextInt();
    // Ucitavanje prvog broja i postavljanje minimuma
    System.out.print("Unesite 1. broj: ");
    x = input.nextInt();
    min = x;
    // Ucitavanje ostalih brojeva i racunanje minimuma
    for (i = 2; i <= n; i++) {
      System.out.print("Unesite " + i + ". broj: ");
      x = input.nextInt();
      if (min > x) {
        min = x;
      }
    }
    // Stampanje rezultata
    System.out.println("Najmanji uneti broj je: " + min);
  }
}