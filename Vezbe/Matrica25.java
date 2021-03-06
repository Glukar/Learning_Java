// U?itati dvodimenzionalni niz. Ispisati sve elemente koji nisu na sporednog dijagonali.
import java.util.Scanner;
class Matrica25 {
  public static void main(String[] args) {
    Scanner unos = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = unos.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = unos.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        niz[i][j] = unos.nextInt();
      }
    }
    // Ispis matrice
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (i + j != niz.length - 1) {
          System.out.print(niz[i][j] + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }
}