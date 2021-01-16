class Zadatak2 {
  
  public static void main(String[] args){
    int n;
    boolean prost = true;
    
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n < 0);
    
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        prost = false;
      }
    } 
    
    if (prost) {
      System.out.println("Broj je prost");
    }
    else {
      System.out.println("Broj nije prost");
    }
    
  }
  
}
