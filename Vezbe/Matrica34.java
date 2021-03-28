//  Sa tastature se unosi matrica x[n,n]. Formirati matricu A[n,n] kod kojeg su elementi na sporednoj dijagonali odgovaraju?i elementi matrice x[i,j], a ostali su 1.
import java.util.Scanner;
class Matrica34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova i kolona u matrici x: ");
    int n = input.nextInt();
    int[][] X = new int[n][n];
    // Unos u matricu X
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("X[" + i + ", " + j + "]");
        X[i][j] = input.nextInt();
      }
    }
    // Kreiranje i unos u matricu A
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i + j) == (A.length - 1)) {
          A[i][j] = X[i][j];
        } else {
          A[i][j] = 1;
        }
      }
    }
    // Ispisivanje matrice X
    System.out.println("Matrica X: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(X[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println();
    
    // Ispisivanje matrice A
    System.out.println("Matrica A: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}