 // U?itati dvodimenzionalni niz. Ispisati ?lanove matrice sa parnim indeksima redova.
import java.util.Scanner;
class Matrica7 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    // Velicina matrice
    System.out.print("Unesite broj redova ove matrice: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona ove matrice: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    // Ispisivanje samo redove sa parnim indeksima
    System.out.println("Clanovi sa parnim indeksima redova su: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (i % 2 == 0) {
          System.out.print(A[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}