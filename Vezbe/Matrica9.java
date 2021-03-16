// U?itati dvodimenzionalni niz. Ispisati ?lanove matrice sa indeksom reda koji je djeljiv sa 3.
import java.util.Scanner;
class Matrica9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Unos za broj redova i kolona matrice
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
    // Ispisivanje redova matrice sa indeksom deljivih sa tri
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if ((i + 1) % 3 == 0) {
          System.out.print(A[i][j] + " ");
        }
      }
    }
  }
}