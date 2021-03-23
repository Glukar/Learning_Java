// U?itati dvodimenzionalni niz. Ispisati elemente na sporednoj dijagonali.
import java.util.Scanner;
class Matrica24 {
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
    // Ispis matrice bez promena
    System.out.println("Vasa matrica izgleda ovako: ");
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
    // Ispis na sporednoj dijagonali
    System.out.println("Ispis na sporednoj dijagonali: ");
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (i + j == red - 1) {
          System.out.print(A[i][j] + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }
}