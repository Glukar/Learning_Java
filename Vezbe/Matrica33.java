/* Formirati dvodimenzionalni niz ?iji su svi elementi sporedne dijagonale 0. Elementi iznad sporedne dijagonale su 4 a ispod 2. Ispisati dvodimenzionalni niz.
 Sa tastature se unosi niz x[n]. Formirati niz A[n,n] kod kojeg su elementi na glavnoj dijagonali x[i], a ostali su nula: ai,j = {xi,j, i = j 0, i<>j} */
import java.util.Scanner;
class Matrica33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova i kolona niza A: ");
    int n = input.nextInt();
    int[] A = new int[n];
     int[][] niz = new int[n][n];
    // Unos u A
    for (int i = 0; i < n; i++) {
      System.out.print("A[" + i + "]");
      A[i] = input.nextInt();
    }
    // Unos u niz
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          niz[i][j] = A[i];
        } else {
          niz[i][j] = 0;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <n; j++) {
        System.out.print(niz[i][j] + " ");
      }
      System.out.println();
    }
  }
}