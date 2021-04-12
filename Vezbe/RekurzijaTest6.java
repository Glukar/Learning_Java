import java.util.Scanner;
class RekurzijaTest6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite velicinu pravouglog trougla: ");
    int n = input.nextInt();
    stampa(n);
  }
  static void stampa(int t) {
    for (int i = 1; i <= t; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}