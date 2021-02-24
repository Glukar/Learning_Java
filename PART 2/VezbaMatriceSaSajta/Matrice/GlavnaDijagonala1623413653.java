/*Ucitati dva dvodimenzionalna niza i formirati treci ciji je opsti clan: 
 cij = xi,j + yi,j za clanove na sporednioj dijagonali, inace je cij = xi,j - yi,j.*/

class GlavnaDijagonala1623413653{
  public static void main(String[] args){
    int i, j;
    
    System.out.println("Ucitati dimenziju matrice");
    int n = Svetovid.in.readInt();
    
    int[][] mat1 = new int[n][n];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Ucitajte clanove niza [" + i + "] [" + j + "] = ");
        mat1[i][j] = Svetovid.in.readInt();
      }
    }
    
    int[][] mat2 = new int[n][n];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Ucitajte clanove niza [" + i + "] [" + j + "] = ");
        mat2[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat1[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat2[i][j] + "\t");
      }
      System.out.println();
    }
    
    int[][] mat3 = new int[n][n];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        if( i+j == n - 1){
          mat3[i][j] = mat1[i][j] + mat2[i][j];
        }else{
          mat3[i][j] = mat1[i][j] - mat2[i][j];
        }
      }
    }
    System.out.println();
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat3[i][j] + "\t");
      }
      System.out.println();
    }
      
  }
}