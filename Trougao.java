import java.util.*;
class Trougao {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, i, j;
    System.out.print("Unesite duzinu kraka trougla: ");
    n = input.nextInt();
    System.out.println("Trougao duzine kraka " + n + ":");
    System.out.println();
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("-");
      }
      System.out.println();
    }
  }
}