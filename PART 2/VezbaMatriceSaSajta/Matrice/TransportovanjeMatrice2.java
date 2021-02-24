class TransportovanjeMatrice2{
  public static void main(String[] args){
    System.out.println("Ucitajte dimenziju kvadratne matrice");
    int dim = Svetovid.in.readInt();
    int[][] niz = new int[dim][dim];
    
    System.out.println("Ucitaj clanove matrice:");
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print("X[" +i+ "," +j +"]"+ "-->");
        niz[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis originalne matrice:
    System.out.println("Matrica");
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print(niz[i][j] + "\t");
      }
      System.out.println();
    }
    
    //Transportovanje
    int[][] b = new int[dim][dim];
    for (int i = 0; i < dim; i++){
      for (int j = 0; j < dim; j++){
        b[i][j] = niz[j][i];
      }
    }
    
    // Zamjena stare matrice novom matricom:
    niz = b;
    b = null;
    
    System.out.println("Transponovana matrica je :");
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print(niz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}