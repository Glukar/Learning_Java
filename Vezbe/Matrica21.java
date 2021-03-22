// U?itati dvodimenzionalni niz. Ispisati susedne ?lanove reda ?ija je suma parna.
import java.util.Scanner;
class Matrica21 {
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
    // Ispis matrice
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if ((A[i][j] + A[i][j + 1]) % 2 == 0) {
          System.out.print(A[i][j] + " " + A[i][j + 1] + "; ");
        }
      }
      System.out.println();
    }
  }
}