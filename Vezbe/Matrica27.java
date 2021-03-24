// Formirati dvodimenzionalni niz ?iji su elementi definisani izrazom: x:i,j { 3, i=>j 2, i<j }
import java.util.Scanner;
class Matrica27 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] A = new int[red][kol];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (i >= j) {
          A[i][j] = 3;
        } else {
          A[i][j] = 2;
        }
      }
    }
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}