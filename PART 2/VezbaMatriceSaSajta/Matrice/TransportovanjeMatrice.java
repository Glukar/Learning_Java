class TransportovanjeMatrice{
  public static void main(String[] args){
    System.out.println("Ucitajte red matrice");
    int red = Svetovid.in.readInt();
    System.out.println("Ucitajte kolonu matrice");
    int kolona = Svetovid.in.readInt();
    int[][] niz = new int[red][kolona];
    
    System.out.println("Ucitaj clanove matrice:");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kolona; j++) {
        System.out.print("X[" +i+ "," +j +"]"+ "-->");
        niz[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis originalne matrice:
    System.out.println("Matrica");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kolona; j++) {
        System.out.print(niz[i][j] + "\t");
      }
      System.out.println();
    }
    
    //Transportovanje
    int[][] b = new int[kolona][red];
    for (int i = 0; i < kolona; i++){
      for (int j = 0; j < red; j++){
        b[i][j] = niz[j][i];
      }
    }
    
    // Zamjena stare matrice novom matricom:
    niz = b;
    b = null;
    int p = red;
    red = kolona;
    kolona = p;
    
    System.out.println("Transponovana matrica je :");
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kolona; j++) {
        System.out.print(niz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}