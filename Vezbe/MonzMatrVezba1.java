/* Program za mnozenje dve celobrojne matrice. */
import java.util.Scanner;

class MonzMatrVezba1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    final int dim1 = 5;
    final int dim2 = 4;
    final int dim3 = 3;
    
    int[][] A = new int[dim1] [dim2];
    int[][] B = new int[dim2] [dim3];
    int[][] C = new int[dim1] [dim3];
    int i,k,j;
    
    System.out.println("\nUnesite matricu A: ");
    for (i = 0; i < dim1; i++) {
      for (k = 0; k < dim2; k++) {
        System.out.print("Unesite element A[" + i + ", " + k + " ] = ");
        A [i][k] = input.nextInt();
      }
    }
    System.out.println("\nUnesite matricu B: ");
    for (k = 0; k < dim2; k++){
      for (j = 0; j < dim3; j++) {
        System.out.print("Unesite element B[" + k + ", " + j + "] = ");
        B [k][j] = input.nextInt();
      }
    } 
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        C[i][j] = 0;
        for (k = 0; k < dim2; k++) {
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
        }
      }
    }
    System.out.println("\nRezultujuca matrica je: ");
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++ ){
        System.out.print(C[i][j] + "\t");
      }
      System.out.println();
    }
  }
}