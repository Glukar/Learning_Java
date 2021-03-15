//   U?itati dvodimenzionalni niz. Ispisati parne ?lanove matrice.
import java.util.Scanner;
class Matrica5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Unosenje velicine matrice
    System.out.print("Unesite broj redova matrice: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona matrice: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    // Ispis
    for (int i = 0;i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (A[i][j] % 2 == 0) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}