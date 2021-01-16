class Zadatak2 {
  
  public static void main(String[] args) {
    
    
    System.out.print("Unesite znak, broj, ili slovo: ");
    char z;
    z = Svetovid.in.readChar();
    
    if(z >= '0' && z <= '9') {
      System.out.println("Broj");
    } else if (z >= 'a' && z <= 'z') {
      System.out.println("Znak");
    } else if (z >= 'A' && z <= 'Z') {
      System.out.println("Znak");
    } else {
      System.out.println("Slovo");
    }
  
  }

}