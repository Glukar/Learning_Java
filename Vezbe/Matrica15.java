// U?itati dvodimenzionalni niz. Ispisati ?lanove matrice sa indeksom reda manjim od indeksa kolone (i<j).
import java.util.Scanner;
class Matrica15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matricu: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matricu: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int  j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        niz[i][j] = input.nextInt();
      }
    }
    // Ispisivanje matrice
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (i < j) {
          System.out.print(niz[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}