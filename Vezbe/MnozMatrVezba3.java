import java.util.Scanner;
class MnozMatrVezba3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    final int dim1 = 5;
    final int dim2 = 4;
    final int dim3 = 3;
    
    int[][] A = new int[dim1][dim2];
    int[][] B = new int[dim2][dim3];
    int[][] C = new int[dim1][dim3];
    
    int i,k,j;
    // Deo koda za unos u prvu matricu
    System.out.println("Unos u prvu matricu: ");
    for (i = 0; i < dim1; i++) {
      for (k = 0; k < dim2; k++) {
        System.out.print("A[" + i + ", " + k + "] = ");
        A[i][k] = input.nextInt();
      }
    }
    // Deo koda za unos u drugu matricu
    System.out.println("Unos u drugu matricu: ");
    for (k = 0; k < dim2; k++) {
      for (j = 0; j < dim3; j++) {
        System.out.print("B[" + k + ", " + j + "] = ");
        B[k][j] = input.nextInt();
      }
    }
    // Izracunavanje C matrice
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        C[i][j] = 0;
        for (k = 0; k < dim2; k++) {
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
        }
      }
    }
    System.out.println("Proizvod je: ");
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        System.out.print("\t" + C[i][j]);
      }
      System.out.println();
    }
  }
}