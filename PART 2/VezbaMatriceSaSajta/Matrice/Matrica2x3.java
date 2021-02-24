/*Ucitiat i ispisati dvodimenzionalni niz - matricu 2x3.*/

class Matrica2x3{
  public static void main(String[] args){
    int r, k;
    
    System.out.println("Ucitajte broj redova za vasu matricu");
    r = Svetovid.in.readInt();
    System.out.println("Ucitajte broj kolona za vasu matricu");
    k = Svetovid.in.readInt();
    
    int[][] mat = new int[r][k];
    
    for(int i = 0; i < r; i++){
      for(int j = 0; j < k; j++){
        System.out.println("Ucitajte [" + i + "] [" + j + "] =");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    for(int i = 0; i < r; i++){
      for(int j = 0; j < k; j++){
        System.out.print(mat[i][j] + " \t");
      }
      System.out.println();
    }
  }
  
}