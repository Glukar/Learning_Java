import java.util.Scanner;
class Matrica4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite dimenziju matrice: ");
    int n = input.nextInt();
    // Uzimanje value-a u matricu
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("A[" + i + ", " + j + "]:");
        A[i][j] = input.nextInt();
      }
    }
    // Ispisivanje matrice
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
    // Ispisivanje neparnih clanova treceg reda
    System.out.println("Ispisivanje neparnih clanova treceg reda: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 2 && (j + 1) % 2 != 0) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}