// U?itati dvodimenzionalni niz. Ispisati ?lanove matrice prve kolone.
import java.util.Scanner;
class Matrica10 {
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
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (j == 0) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}