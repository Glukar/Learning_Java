class Zadatak3 {
  public static void main(String[] args) {
  
    System.out.print("Unesite iznos plate: ");
    int plata = Svetovid.in.readInt();
    int x;
    

      x = plata / 100;
      System.out.println("Broj apoena od 100: " + x);
      
      plata = plata % 100;
      
      x = plata / 50;
      System.out.println("Broj apoena od 50: " + x);
      
      plata = plata % 50;
      
      x = plata / 20;
      System.out.println("Broj apoena od 20: " + x);
      
      plata = plata % 20;
      
      x = plata / 10;
      System.out.println("Broj apoena od 10: " + x);
      
      plata = plata % 10;
      
      x = plata / 5;
      System.out.println("Broj apoena od 5: " + x);
      
      plata = plata % 5;
      
      x = plata / 2;
      System.out.println("Broj apoena od 2: " + x);
      
      plata = plata % 2;
      
      x = plata;
      System.out.println("Broj apoena od 1:" + x);
    
  
  }
}