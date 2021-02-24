/*Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, 
  i proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
  Ispisati odgovarajucu poruku za svaku proveru simetrije.*/

class ProveraPoGlavnojProveraPoSporednoj{
  public static void main(String[] args){
    int n; 
    
    do{
      System.out.println("Ucitati prirodan broj n");
      n = Svetovid.in.readInt();
    }while(n < 0 || n > 20);
    
    int[][] mat = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = Svetovid.in.readInt("Unesite [" + i + "][" + j + "] element: ");
      }
    }
  }
}