import java.util.*;
class TrougaoVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n;
    System.out.print("Unesite duzinu stranice: ");
    n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++){
      System.out.print("-");
      }
      System.out.println();
    }
  }
}