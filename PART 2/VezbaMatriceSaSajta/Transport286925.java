/*Program koji transponuje datu kvadratnu matricu celih brojeva
 tako da rezultujuca matrica bude u originalnoj matrici. Ne koristiti
 pomocne matrice.*/

class Transport286925{
  public static void main(String[] args){
    int i, j;
    
    int n = 3;
    int[][] mat = upisMat(n);
    
    System.out.println("Originalna matrica:");
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    transport(mat,n);
    
    System.out.println("Transportovana matrica:");
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
  }
  
  static int[][] upisMat(int n){
    int[][] B = new int[n][n];
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.println("Unesite elemente matrice [" + i + "] [" + j + "] = ");
        B[i][j] = Svetovid.in.readInt();
      }
    }
    
    return B; 
  }
  
  static void transport(int[][] B, int n){
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        int pom = B[i][j];
        B[i][j] = B[j][i];
        B[j][i] = pom; 
      }
    }
  }
  
}

