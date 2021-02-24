/*.Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, 
  i proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
  Ispisati odgovarajucu poruku za svaku proveru simetrije.
*/

class Simetricnost124{
  public static void main(String[] args){
    int n, i, j;
    
    //Kontrola unosa n
    do{
      System.out.println("Unesite n");
      n = Svetovid.in.readInt();
    }while(n <= 0 || n > 19);
    
    int[][] mat = new int[n][n];
    
    //Unos
    for(i = 0; i<n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Unesite elemente [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Ispis
    for(i = 0; i<n; i++){
      for(j = 0; j < n; j++){
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    //Provera simetricnosti za glavnu dijagonalu
    boolean glavna = true;
    for(i = 0; i < n && glavna; i++){
      for(j = 0; j < i && glavna; j++){
        if(mat[i][j] != mat[j][i]){
          glavna = false;
        }
      }
    }
    
    //Provera simetricnosi za sporednu dijagonalu
    boolean sporedna = true;
    for(i = 0; i < n && sporedna; i++){
      for(j = 0; j < n - i - 1 && sporedna; j++){
        if(mat[i][j] != mat[n - i - 1][n - j -1]){
          sporedna = false;
        }
      }
    }
    
    //Stamanje rezultata
    if(glavna && sporedna){
      System.out.println("Simetricna je i po glavnoj i po sporednoj");
    }
    else if(glavna && !sporedna){
      System.out.println("Simetricna je samo po glavnoj");
    }
    else if(!glavna && sporedna){
      System.out.println("Simetricna je samo po sporednoj");
    }
    else{
      System.out.println("Nije si simetricna ni po glavnoj ni po sporednoj");
    }
    
  }
}