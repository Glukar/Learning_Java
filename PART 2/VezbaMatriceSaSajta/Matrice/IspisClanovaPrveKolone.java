/*Ucitati dvodimenzionalni niz. Ispisati clanove matrice prve kolone*/

class IspisClanovaPrveKolone{
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
    
    /*-----------------------------------------------------------------*/
    
    System.out.println("Clanovi prve kolone su: ");
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        if(j == 0){
          System.out.println(mat[i][j]);
        }
      }
    }
    
 }
}

