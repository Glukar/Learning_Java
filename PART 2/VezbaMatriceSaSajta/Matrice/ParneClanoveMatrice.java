/*Ucitati dvodimenzionalni niz. Ispisati parne clanove matrice.*/

class ParneClanoveMatrice{
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
    
    System.out.println("Parni clanovi matrice su: ");
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        if(mat[i][j] % 2 == 0){
          System.out.print(mat[i][j] + "\t");
        }
      }
    }
    
  }
}