/*Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, i 
  proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
  Ispisati odgovarajucu poruku za svaku proveru simetrije.*/

class SimetrijaDijagonala{
  public static void main(String[] args){
    
    System.out.println("Ucitajte prirodan broj n");
    int n = Svetovid.in.readInt();
    
    int[][] mat = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.println("Ucitajte elemente matrice: ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }

    
  }
}