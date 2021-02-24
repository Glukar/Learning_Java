/*Ucitati i ispisati dvodimenzionalni niz - matricu nxn. Zatim ispisati ?lanove niza koji su na glavnoj dijagonali.*/

class GlavnaDijagonala{
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
        System.out.print(mat[i][j] + " \t");
      }
      System.out.println();
    }
    
    System.out.println("Clanovi na glavnoj dijagonali su: ");
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        if(i == j){
           System.out.println(mat[i][j]);
        }
      }
    }
    
  }
}