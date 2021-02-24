/*Ucitati dvodimenzionalni niz - matricu nxm. Zamjeniti elemente kolona i redova (transponovana matrica).*/

class Transportovanje14124{
  public static void main(String[] args){
    int i, j;
    
    int red = 2;
    int kolona = 4;
    int[][] mat = new int[red][kolona];
    
    
    //Ucitavanje matrice
    for(i = 0; i < red; i++){
      for(j = 0; j < kolona; j++){
        System.out.println("Ucitajte elemente u matrici [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis
    for(i = 0; i < red; i++){
      for(j = 0; j < kolona; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    int[][] mat2 = new int[kolona][red];
    for(i = 0; i < kolona; i++){
      for(j = 0; j < red; j++){
        mat2[i][j] = mat[j][i];
      }
    }
    
    mat = mat2;
    mat2 = null;
    int pom = red;
    red = kolona;
    kolona = pom;
    
    for(i = 0; i < red; i++){
      for(j = 0; j < kolona; j++){
        
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    
  }
}