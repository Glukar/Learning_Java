//   U?itati dvodimenzionalni niz. Ispisati neparne ?lanove matrice.
import java.util.Scanner;
class Matrica6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Ucitavanje velicine matrice
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]:");
        A[i][j] = input.nextInt();
      }
    }
    // Ispisivanje sbih neparnih brojeva iz matrice
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (A[i][j] % 2 == 1) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}