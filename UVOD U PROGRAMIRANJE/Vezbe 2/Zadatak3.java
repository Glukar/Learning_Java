class Zadatak3 {
  
  public static void main(String[] args) {
    int n, x;
    int count = 0;
    boolean prost = true;
    
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while(n < 0);
    
    x = n;
    
    while(x > 0) {
      int temp = x % 10;
      
      if (temp == 2 || temp == 3 || temp == 5 || temp == 7)
        count++;     
      
      x /= 10;      
    }
    
    System.out.println(n + " ima " + count + " prostih cifara.");
    
  }
  
  
}