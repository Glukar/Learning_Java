import java.util.*;
class TablicaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, x;
    System.out.print("Unesite n: ");
    n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        x = i * j;
        System.out.print(x + "\t");
      }
      System.out.println();
    }
  }
}