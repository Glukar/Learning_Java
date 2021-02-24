/*Ucitati i ispisati dvodimenzionalni niz - matricu nxn. Zatim ispisati clanove niza koji nisu na glavnoj dijagonali. 
   Elemente na glavnoj dijagonali pri ispisu zamjeniti prazninom.*/ 

class GlavnaDijagonalaPraznaOstaliIspisani{
  public static void main(String[] args){
    int i, j, n;
    
    System.out.println("Ucitati dimenziju matrice n");
    n = Svetovid.in.readInt();
    int[][] mat = new int[n][n];
    
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        System.out.println("Unesite clanove matrice [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        if(i != j){
          System.out.print(mat[i][j] + "\t");
        }else{
          System.out.print(" " + " " + "\t");
        }
      }
      System.out.println();
    }
    
  }
}