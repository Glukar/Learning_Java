/*Zbir matrica*/

class ZbirMatrice1876913876918{
  public static void main(String[] args){
    int i, j;
    
    int[][] A = {{1,2}, {3,4}};
    int[][] B = {{5,6}, {7,8}};
    int[][] C = new int[100][100];
    
    for(i = 0; i < 2; i++){
      for(j = 0; j < 2; j++){
        C[i][j] = A[i][j] + B[i][j];
      }
    }
    
    System.out.println("Zbir matrica je: ");
    for(i = 0; i < 2; i++){
      for(j = 0; j < 2; j++){
        System.out.print(C[i][j] + "\t");
      }
      System.out.println();
    }
    
  }
}