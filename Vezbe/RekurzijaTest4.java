import java.util.Scanner;
class RekurzijaTest4 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Unesite broj redova i kolona u matrici: ");
   int rk = input.nextInt();
   int[][] niz = A(rk);
   stampa(rk, niz);
  }
  static int[][] A(int n) {
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
  static void stampa(int n, int[][] A) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}