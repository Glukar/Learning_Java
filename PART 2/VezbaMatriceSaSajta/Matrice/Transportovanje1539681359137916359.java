/*Program koji transponuje datu kvadratnu matricu celih brojeva
   tako da rezultujuca matrica bude u originalnoj matrici. Ne koristiti
   pomocne matrice.*/

class Transportovanje1539681359137916359{
  public static void main(String[] args){
    int i, j;
    
    System.out.println("Unesite dimenziju matrice");
    int n = Svetovid.in.readInt();
    
    int[][] mat = unos(n);
    
    //Ispis originalne matrice
    System.out.println("Ispis originalne matrice");
     for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    transport(mat, n);

    //Ispis transportovane matrice
    System.out.println("Ispis transportovane matrice");
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
  }
  
  static int[][] unos(int n){
    int[][] A = new int[n][n];
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.println("Unesite elemete u matricu [" + i + "] [" + j + "] =");
        A[i][j] = Svetovid.in.readInt();
      }
    }
    return A;
  }
    
  
  static void transport(int[][] A, int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < i; j++){
        int pom = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = pom;
      }
    }
  }
  
}