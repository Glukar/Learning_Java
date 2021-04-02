// Testiranje rekurzije
import java.util.Scanner;
class RekurzijaTest1 {
  // Glavna deklaracija
  static int rk;
  static int A[][];
  public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    System.out.print("Unesite broj redova i kolona matrice A: ");
    rk = input.nextInt();
    A(rk);
    // Stampanje matrice
    for (int i = 0; i < rk; i++) {
      for (int j = 0; j < rk; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static int[][] A (int n) {
    Scanner input = new Scanner(System.in);
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    return A;
  }
}