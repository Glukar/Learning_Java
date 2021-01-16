class Zadatak1 {
  
  public static void main(String[] args) {
    int broj1, broj2;
    
    Svetovid.out.print("Unesite prvi prirodan broj: ");
    broj1 = Svetovid.in.readInt();
    
    Svetovid.out.print("Unesite drugi prirodan broj: ");
    broj2 = Svetovid.in.readInt();
    
    Svetovid.out.print("Aritmeticka sredina je: " + (broj1 + broj2) / 2);   
    
  }

}