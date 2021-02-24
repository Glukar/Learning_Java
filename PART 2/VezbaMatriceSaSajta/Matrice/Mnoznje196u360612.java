/*Program za mnozenje dve celobrojne matrice. */

class Mnoznje196u360612{
  public static void main(String[] args){
    
    final int dim1 = 5;
    final int dim2 = 4;
    final int dim3 = 3;
    
    int i; // za dim1
    int k; // za dim2
    int j; // za dim3
    
    int[][] A = new int[dim1][dim2];
    int[][] B = new int[dim2][dim3];
    int[][] proizvod = new int[dim1][dim3];
    
    //Unos u matricu A
    for(i = 0; i < dim1; i++){
      for(k = 0; k < dim2; k++){
        System.out.println("Unesite elemente u matricu A [" + i + "] [" + k + "] = ");
        A[i][k] = Svetovid.in.readInt();
      }
    }
    //Unos u matricu B
    for(k = 0; k < dim2; k++){
      for(j = 0; j < dim3; j++){
        System.out.println("Unesite elemente u matricu B [" + k + "] [" + j + "] = ");
        B[k][j] = Svetovid.in.readInt();
      }
    }
    //Racunanje proizvoda
    for(i = 0; i < dim1; i++){
      for(j = 0; j < dim3; j++){
        proizvod[i][j] = 0;
        for(k = 0; k < dim2; k++){
          proizvod[i][j] = proizvod[i][j] + A[i][k] * B[k][j];
        }
      }
    }
    //Ispis matrice A
    for(i = 0; i < dim1; i++){
      for(k = 0; k < dim2; k++){
        System.out.print(A[i][k] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    
    //Ispis matrice B
    for(k = 0; k < dim2; k++){
      for(j = 0; j < dim3; j++){
        System.out.print(B[k][j] + "\t");
      }
      System.out.println();
    }
    
    //Ispis proizvoda
    System.out.println("Proizvod matrice A i B");
     
    for(i = 0; i < dim1; i++){
      for(j = 0; j < dim3; j++){
        System.out.print(proizvod[i][j] + "\t");
      }
      System.out.println();
    }
  }
}