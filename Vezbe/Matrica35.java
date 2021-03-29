// U?itati dva dvodimenzionalna niza i formirati tre?i ?iji je opšti ?lan: cij = xi,j - yi,j.
import java.util.Scanner;
class Matrica35 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u nizovima X i Y: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u nizovima X i Y: ");
    int kol = input.nextInt();
    int[][] X = new int[red][kol];
    int[][] Y = new int[red][kol];
    // Unos u niz X
    System.out.println("Unesite elemente niza X: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < X[i].length; j++) {
        System.out.print("X[" + i + ", " + j + "]");
        X[i][j] = input.nextInt();
      }
    }
     // Unos u niz Y
    System.out.println("Unesite elementa niza Y: ");
    for (int i = 0; i < Y.length; i++) {
      for (int j = 0; j < Y[i].length; j++) {
        System.out.print("Y[" + i + ", " + j + "]");
        Y[i][j] = input.nextInt();
      }
    }
    // Pravljenje i postavljanje clana u nizu A
    int[][] A = new int[red][kol];
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        A[i][j] = X[i][j] - Y[i][j];
      }
    }
    // Ispisivanje niza X
    System.out.println("Niz X: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(X[i][j] + " ");
      }
      System.out.println();
    }
     // Ispisivanje niza Y
    System.out.println("Niz Y: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(Y[i][j] + " ");
      }
      System.out.println();
    }
     // Ispisivanje niza A
    System.out.println("Niz A: ");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}