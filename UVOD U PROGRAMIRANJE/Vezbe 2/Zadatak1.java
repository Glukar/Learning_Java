class Zadatak1 {
  public static void main(String[] args) {
    
    int n;
        
    do {
      n= Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    
    for(int i = 1; i < n; i++) {
      if (n % i == 0) {
        System.out.println(i);
      }    
    }    
  
  } 

}