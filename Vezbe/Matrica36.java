// U?itati dvodimenzionalni niz - matricu nxm. Na?i i ispisati najve?i elemenat matrice X[n,m].
import java.util.Scanner;
class Matrica36 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] X = new int[red][kol];
    // Unos u matricu X
    for (int i = 0; i < X.length; i++) {
      for (int j = 0; j < X[i].length; j++) {
        System.out.print("X[" + i + ", " + j + "]");
        X[i][j] = input.nextInt();
      }
    }
    // Pronalazenje najveceg clana matrice
    int n = 0;
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (X[i][j] > n) {
          n = X[i][j];
        }
      }
    }
    // Ispisivanje najveceg clana matrice i same matrice
    System.out.println("Matrice X: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(X[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Najveci clan matrice X je: " + n);
    
  }
}