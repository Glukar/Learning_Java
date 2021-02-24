/*Program za mnozenje dve celobrojne matrice. */

class MnozenjeMatrice123{
  public static void main(String[] args){
    final int dim1 = 2;
    final int dim2 = 3;
    final int dim3 = 2;
    
    int[][] A = new int[dim1][dim2];
    int[][] B = new int[dim2][dim3];
    int[][] C = new int[dim1][dim3];
    
    int i; // Dimenzija dim1
    int k; // Dimenzija dim2
    int j; // Dimenzija dim3
    
    //Ucitavanje u A
    for(i = 0; i < dim1; i++){
      for(k = 0; k < dim2; k++){
        System.out.println("Ucitajte elemente matrice A [" + i + "] [" + k + "] =");
        A[i][k] = Svetovid.in.readInt();
      }
    }
    
    //Ucitavanje u B
    for(k = 0; k < dim2; k++){
      for(j = 0; j < dim3; j++){
        System.out.println("Ucitajte elemente matrice B [" + k + "] [" + j + "] =");
        B[k][j] = Svetovid.in.readInt();
      }
    }
    
    
    //Racunanje proizvoda
    for(i = 0; i < dim1; i++){
      for(j = 0; j < dim3; j++){
        C[i][j] = 0;
        for(k = 0; k < dim2; k++){
          C[i][j] = C[i][j] + A[i][k] * B[k][j]; 
        }
      }
    }
    
    //Ispis proizvoda
    for(i = 0; i < dim1; i++){
      for(j = 0; j < dim3; j++){
        System.out.print(C[i][j] + "\t");
      }
      System.out.println();
    }
    
  }
}