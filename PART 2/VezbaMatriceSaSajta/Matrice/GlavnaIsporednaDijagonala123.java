/*.Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, 
 i proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
 Ispisati odgovarajucu poruku za svaku proveru simetrije.*/

class GlavnaIsporednaDijagonala123{
  public static void main(String[] args){
    int n, i, j;
    
    do{
      System.out.println("Unesite n");
      n = Svetovid.in.readInt();
    }while(n <= 0 || n >= 20);
    
    int[][] mat = new int[n][n];
    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++){
        System.out.println("Unesite element [" + i + "] [" + j + "] = ");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    System.out.println("Izvrsio!");
    
    //Provera za glavnu
    boolean glavna = true;
    for(i = 0; i < n && glavna; i++){
      for(j = 0; j < i && glavna; j++){
        if(mat[i][j] != mat[j][i]){
          glavna = false;
        }
      }
    }
    
    System.out.println("Izvrsio!");
    
    //Provera za sporednu
    boolean sporedna = true;
    for(i = 0; i < n && sporedna; i++){
      for(j = 0; j < n - 1 - i && sporedna; j++){
        if(mat[i][j] != mat[n - 1 - j][n - 1 - i]){
          sporedna = false;
        }
      }
    }
    
    System.out.println("Izvrsio!");
    
    if(glavna && sporedna){
      System.out.println("I glavna i sporedna dijagonala je simetricna.");
    }else if(glavna && !sporedna){
      System.out.println("Glavna je simetricna a sporedna nije.");
    }else if(!glavna && sporedna){
      System.out.println("Sporedna je simetricna a glavna nije.");
    }else{
      System.out.println("Nijedna nije simetricna.");
    }
    
  }
}