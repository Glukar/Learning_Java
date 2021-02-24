/*Ucitati dvodimenzionalni niz.  Ispisati clanove tre?eg reda sa neparnim indeksima kolone.*/

class ClanoviTrecegRedaSaNeparnimIndeksom{
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
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    System.out.println();
    for(i = 0; i < mat.length; i++){
      for(j = 0; j < mat[i].length; j++){
        if(i == 2 && (j + 1)% 2 != 0){
          System.out.println(mat[i][j]);
        }
      } 
    }
    
  }  
}