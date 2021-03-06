/*Ucitati dvodimenzionalni niz.  Ispisati clanove treceg reda sa neparnim indeksima kolone.*/

class TreciRed321312{
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
    
    //Ispis originalne
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
//Ispis
    for(i = 2; i < 3; i++){
      for(j = 0; j < n; j++){
        if((j+1) % 2 == 0){
          System.out.print(mat[i][j] + "\t");
        }
      }
      System.out.println();
    }
    
  }
}
