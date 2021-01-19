import java.util.Scanner;
class StepenSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n;
    double x, rez = 1;
    System.out.print("Unesite realan broj x: ");
    x = input.nextInt();
    System.out.print("Unesite prirodan broj n: ");
    n = input.nextInt();
    for (int i = 0; i <= n; i++) {
      rez = rez * x;
    }
    System.out.println("Vas rezultat je: " + rez);
  }
}