//  U?itati dvodimenzionalni niz. Ispisati ?lanove matrice koji su deljive sa 3.
import java.util.Scanner;
class Matrica17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        niz[i][j] = input.nextInt();
      }
    }
    // Ispisivanje matrice
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] % 3 == 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}