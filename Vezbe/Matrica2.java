import java.util.Scanner;
class Matrica2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Dimenzije kvadratne matrice: ");
    int n = input.nextInt();
    int[][] A= new int[n][n];
    System.out.println("Unos clanova kvadratne matrice: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        A[i][j] = input.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          System.out.print(A[i][j] + " ");
        }
      }
    }
  }
}