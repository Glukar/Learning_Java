/*Ucitati dvodimenzionalni niz. Ispisati parne clanove matrice.*/

class Parni153476{
  public static void main(String[] args){
    int i, j;
    
    System.out.println("Ucitajte n");
    int n = Svetovid.in.readInt();
    
    int[][] mat = new int[n][n];
    
    //Ucitavanje matrice
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Ucitajte elemente u matrici [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    System.out.println();
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        if(mat[i][j] % 2 == 0){
          System.out.print(mat[i][j] + " ");
        }
      }
    }
    
  }
}

