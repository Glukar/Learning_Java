import java.util.Scanner;
class MnozMatrVezba2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    final int dim1 = 5;
    final int dim2 = 4;
    final int dim3 = 3;
    
    int[][] A = new int[dim1][dim2]; // Prva matrica
    int[][] B = new int[dim2][dim3]; // Druga matrica
    int[][] C = new int[dim1][dim3]; // Matrica koja se dobija proizvodom prve dve matrice
    
    int i;
    int k;
    int j;
    // Unos u prvu matricu
    System.out.println("Unesite elemente prve matrice: ");
    for (i = 0; i < dim1; i++) {
      for (k = 0; k < dim2; k++) {
        System.out.print("Unos A[" + i + ", " + k + "] = ");
        A[i][k] = input.nextInt();
      }
    }
    // Unos u drugu matricu
    System.out.println("Unesite elemente druge matrice: ");
    for (k = 0; k < dim2; k++) {
      for (j = 0; j < dim3; j++) {
        System.out.print("Unos B[" + k + ", " + j + "] = ");
        B[k][j] = input.nextInt();
      }
    }
    // Izracunavanje trece matrice
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        C[i][j] = 0;
        for (k = 0; k < dim2; k++){
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
        }
      }
    }
    // Ispisivanje rezultata
    System.out.println("Dobivena matrica je: ");
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        System.out.print("\t" + C[i][j]);
      }
      System.out.println();
    }
  }
}