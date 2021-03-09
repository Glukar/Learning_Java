import java.util.Scanner;
class TransponovanjeVezba1 {
  static int[][] unos (int d) {
    Scanner input = new Scanner(System.in);
    int[][] A = new int[d][d];
    for (int i = 0; i < d; i++) {
      for (int j = 0; j < d; j++) {
        System.out.print("Unesite element " + i + ". vrsti i " + j + ". koloni: ");
        A[i][j] = input.nextInt();
      }
    }
    return A;
  }
  static void stampa(int[][] A, int d) {
    for (int i = 0; i < d; i++) {
      for (int j = 0; j < d; j++) {
        System.out.print(A[i][j] + "\t");
      }
      System.out.println();
    }
  }
  static void transp(int[][] A, int d) {
    for (int i = 1; i < d; i++) {
      for (int j = 0; j < i; j++) {
        int pom = A[i][j];
        A[i][j] = A[j][i];
        A[i][j] = pom;
      }
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\nUnesite dimenziju matrice: ");
    int dim = input.nextInt();
    int[][] M = unos(dim);
    stampa(M, dim);
  }
}