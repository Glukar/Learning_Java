/*Ucitati i ispisati dvodimenzionalni niz - matricu nxn. Zatim ispisati clanove niza koji su na glavnoj dijagonali.*/  

class GlavnaDijagonala1515{
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
        if(j == i){
          System.out.print(mat[i][j] + "\t");
        }else{
          System.out.print(" " + "\t");
        }
      }
      System.out.println();
    }
    
  }
}