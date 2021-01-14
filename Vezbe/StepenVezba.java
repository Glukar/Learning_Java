import java.util.*;
class StepenVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double x, rez = 1.0;
    int n;
    System.out.print("Unesite realan broj: ");
    x = input.nextInt();
    System.out.print("Unesite prirodan broj: ");
    n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      rez = rez * x;
    }
    System.out.println("Vas rezultat je: " + rez);
  }
}