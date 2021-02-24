/*Napisati program koji ucitava prirodan broj n (n < 20) i celobrojnu matricu formata nxn, i proverava da li je matrica simetricna po glavnoj i sporednoj dijagonali. 
  Ispisati odgovarajucu poruku za svaku proveru simetrije.*/

class Program1 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj n: ");
    } while (n <= 0 && n >= 20);
    
    int[][] matrica = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrica[i][j] = Svetovid.in.readInt("Unesite [" + i + "][" + j + "] element: ");
      }
    }
    
    System.out.println("Izvrsio!");
    
    // provera po glavnoj
    boolean glavna = true;
    for (int i = 0; i < n && glavna; i++) {
      for (int j = 0; j < i && glavna; j++) {
        if (matrica[i][j] != matrica[j][i]) {
          glavna = false;
        }
      }
    }
    
    System.out.println("Izvrsio!");
    
    // provera po sporednoj
    boolean sporedna = true;
    for (int i = 0; i < n && sporedna; i++) {
      for (int j = 0; j < n - i - 1 && sporedna; j++) {
        if (matrica[i][j] != matrica[n - j - 1][n - i - 1]) {
          sporedna = false;
        }
      }
    }
    
    System.out.println("Izvrsio!");
    
    if (glavna && !sporedna) {
      System.out.println("Matrica je simetricna po glavnoj dijagonali!");
    } else if (!glavna && sporedna) {
      System.out.println("Matrica je simetricna po sporednoj dijagonali!");
    } else if (glavna && sporedna) {
      System.out.println("Matrica je simetricna i po glavnoj i po sporednoj dijagonali!");
    } else {
      System.out.println("Matrica nije simetricna ni po glavnoj ni po sporednoj dijagonali!");
    }
  }
}