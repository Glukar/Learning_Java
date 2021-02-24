/*Program za mnozenje dve celobrojne matrice.*/

class MnozenjeMatrice{
  public static void main(String[] args) {
    final int dim1 = 5;
    final int dim2 = 4;
    final int dim3 = 3;

    int[][] A = new int[dim1][dim2];
    int[][] B = new int[dim2][dim3];
    int[][] C = new int[dim1][dim3];
    
    int i; // 0...dim1-1
    int k; // 0...dim2-1
    int j; // 0...dim3-1
    
    System.out.println("\nUnesite matricu A:");
    for (i = 0; i < dim1; i++) {
      for (k = 0; k < dim2; k++) {
        System.out.print("Unesite element A[" + i + ", " + k + "] = ");
        A[i][k] = Svetovid.in.readInt();
      }
    }
    
    // unos elemenata druge matrice po vrstama
    System.out.println("\nUnesite matricu B:");
    for (k = 0; k < dim2; k++) {
      for (j = 0; j < dim3; j++) {
        System.out.print("Unesite element B[" + k + ", " + j + "] = ");
        B[k][j] = Svetovid.in.readInt();
      }
    }
    
    System.out.println("\nRezultujuca matrica je: ");
    for (i = 0; i < dim1; i++) {
      for (j = 0; j < dim3; j++) {
        System.out.print(C[i][j] + "\t");
      }
      System.out.println();
    }
    
  }
}