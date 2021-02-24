/*Zbir matrica*/

class ZbirMatrica{
  public static void main(String[] args){
    
    double[][] A = {{1.0, 2.0}, {3.5, 45.5}};
    double[][] B = {{1.0, 2.0}, {3.5, 45.5}};
    double[][] C = new double[2][2];
    
    for(int i = 0; i < A.length; i++){
      for(int j = 0; j < A[i].length; j++){
        C[i][j] = A[i][j] + B[i][j];
      }
    }
    
    for(int i = 0; i < C.length; i++){
      for(int j = 0; j < C[i].length; j++){
        System.out.print(C[i][j] + "\t");
      }
      System.out.println();
    }
    
  }
}