/*Unesite prirodan broj n, zatim matricu dimenzije n*n i ispisati matricu kao i  maksimalan clan matrice.*/

class MaksimumMatrice{
  public static void main(String[] args){
    int n, i, j;
    
    do{
      System.out.println("Unesite prirodan broj n");
      n = Svetovid.in.readInt();
    }while(n <= 0);
    
    int[][] mat = new int[n][n];
    
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Uneiste elemente matrice [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    int max = mat[0][0];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
        if(mat[i][j] > max){
          max = mat[i][j];
        }
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println("Maksimalan clan ove matrice je: " + max);
  }
}