//  Formirati dvodimenzionalni niz ?iji su svi elementi glavne dijagonale koji su 1. Elementi iznad glavne dijagonale su 2 a ispod 0. Ispisati dvodimenzionalni niz.
import java.util.Scanner;
class Matrica31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matric: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (i > j) {
          A[i][j] = 2;
        } else if(i == j) {
          A[i][j] = 1;
        } else {
          A[i][j] = 0;
        }
      }
    }
    // Ispisivanje matrice
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}