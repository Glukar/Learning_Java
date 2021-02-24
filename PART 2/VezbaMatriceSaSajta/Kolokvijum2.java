class Kolokvijum2{
  public static void main(String[] args){
    int n, m, i, j;
    
    do{
      System.out.println("Ucitatiti dimenzuje n");
      n = Svetovid.in.readInt();
    }while(n <= 0 || n > 20);
    
    do{
      System.out.println("Ucitatiti dimenzuje n");
      m = Svetovid.in.readInt();
    }while(m <= 0 || m > 20);
    
    String[][] A = new String[n][m];
    
    for(i = 0; i < n; i++){
      for(j = 0; j < m; j++){
        System.out.println("Ucitati String u matricu [" + i + "] [" + j + "] =");
        A[i][j] = Svetovid.in.readLine();
      }
    }
    
    int brS = 0;
    String max = "";
    for(i = 0; i < n; i++){
      for(j = 0; j < m; j++){
        String s = A[i][j];
        char c = s.charAt(s.length()-1);
        if((c  == 'a' || c  == 'e' || c  == 'i' || c  == 'o' || c  == 'u') || (c  == 'A' || c  == 'E' || c  == 'I' || c  == 'O' || c  == 'U')){
          brS++;
        }
        
        if(s.length() > max.length()){
          max = s;
        }
      }
    }
    
    System.out.println("Broj elemenata matrice koji zavrsavaju samoglasnikom: " + brS + ".");
    System.out.println("Prvi najduzi string je " + max + " i njegova duzina je " + max.length() + ".");
    System.out.println();
    for(i = 0; i < n; i++){
      for(j = 0; j < m; j++){
        String s = A[i][j];
        s = s.toLowerCase();
        System.out.print(s + "\t");
      }
      System.out.println();
    }
    
  }
}