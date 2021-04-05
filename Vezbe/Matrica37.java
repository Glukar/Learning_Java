// U?itati dvodimenzionalni niz. Ispisati ?lanove matrice koji nisu djeljive sa 3.
import java.util.Scanner;
class Matrica37 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    // Ispisivanje matrice
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (A[i][j] % 3 != 0) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}