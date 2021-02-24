/*Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, 
  i proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
  Ispisati odgovarajucu poruku za svaku proveru simetrije.*/

class SporednaGlavna2151242{
  public static void main(String[] args){
    int n, i, j;
    
    System.out.println("Ucitajte n");
    n = Svetovid.in.readInt();
    
    int[][] mat = new int[n][n];
    
    //Unos matrice
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Ucitajte elemente matrice [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt(); 
      }
    }
    
    //Ispis matrice
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t"); 
      }
      System.out.println();
    }
    
    //Provera po glavnoj
    boolean glavna = true;
    for(i = 0; i < n && glavna; i++){
      for(j = 0; j < i && glavna; j++){
        if(mat[i][j] != mat[j][i]){
          glavna = false;
        }
      }
    }
    
    //Provera po sporednoj
    boolean sporedna = true;
    for(i = 0; i < n && sporedna; i++){
      for(j = 0; j < n - i - 1 && sporedna; j++){
        if(mat[i][j] != mat[n - j - 1][n - i - 1]){
          sporedna = false;
        }
      }
    }
    
    if(glavna && sporedna){
      System.out.println("Simetricna je po glavnoj i  po sporednoj");
    }else if(glavna && !sporedna){
      System.out.println("Simetricna je po glavnoj!");
    }else if(!glavna && sporedna){
      System.out.println("Simetricna je po sporednoj!");
    }else{
      System.out.println("Nije simetricna!5");
    }
    
  }
}

