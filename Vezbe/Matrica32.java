// Formirati dvodimenzionalni niz ?iji su svi elementi glavne dijagonale koji su 0. Elementi iznad glavne dijagonale su 5 a ispod 3. Ispisati dvodimenzionalni niz.  
import java.util.Scanner;
class Matrica32 {
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
        if (i == j) {
          A[i][j] = 0;
        } else if (i < j) {
          A[i][j] = 5;
        } else {
          A[i][j] = 3;
        }
      }
    }
    // Ispis matrice
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}