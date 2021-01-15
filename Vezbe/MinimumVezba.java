import java.util.*;
class MinimumVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, m, min;
    System.out.print("Unesite broj cifara u skupu: ");
    m = input.nextInt();
    System.out.print("Unesite 1. broj: ");
    n = input.nextInt();
    min = n;
    for (int i = 2; i <= m; i++) {
      System.out.print("Unesite " + i + ". broj: ");
      n = input.nextInt();
     if (min > n) {
      min = n;
    }
    }
    System.out.println("Najmanji broj: " + min);
  }
}