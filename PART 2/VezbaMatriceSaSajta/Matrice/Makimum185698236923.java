/*Unesite prirodan broj n, zatim matricu dimenzije n*n i ispisati matricu kao i  maksimalan clan matrice.*/

class Makimum185698236923{
  public static void main(String[] args){
    int n, i, j;
    
    System.out.println("Unesite dimenziju n");
    n = Svetovid.in.readInt();
    
    int[][] mat = new int[n][n];
    
    //Unos elemenata u matricu
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Unesite elemente matrice [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis elemenata i odredivanja max
    
    int max = mat[0][0];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        if(mat[i][j] > max){
          max = mat[i][j];
        }
        System.out.print(mat[i][j] + "\t");
      }
     System.out.println();
    }
    
    //Ispis max
    
    System.out.println();
    System.out.println("Maksimalni element u matrici je: " + max);
  }
}