//   U?itati dvodimenzionalni niz. Ispisati ?lanove matrice sa neparnim indeksima redova.
import java.util.Scanner;
class Matrica8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Uzimanje velicine matrice
    System.out.print("Unesite broj redova za matricu: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona za matricu: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Upis brojeva u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    // Ispisivanje clanova matrice sa neparnim indeksima redova.
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (i % 2 == 1) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}