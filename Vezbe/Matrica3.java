import java.util.Scanner;
class Matrica3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite dimenziju matrice: ");
    int n = input.nextInt();
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("A[" + i + ", " + j + "]:");
        A[i][j] = input.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          System.out.print(A[i][j] + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }
}