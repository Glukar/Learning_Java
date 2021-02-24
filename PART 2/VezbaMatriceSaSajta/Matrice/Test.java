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
    
    int duzina = mat.length;
    int duzina2 = mat[0].length;
    
    System.out.println(duzina);
    System.out.println(duzina2);
    
  }
}