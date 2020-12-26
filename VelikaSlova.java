import java.util.*;
class VelikaSlova {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    char c;
    
    // Ucitavanje prvog znaka
    System.out.println("Unos znakova zavrsite tackom.");
    System.out.print("Unesite znak: ");
    c = input.next().charAt(0);
    
    // Ispis i ucitavanje ostalih znakova
    while (c != '.') {
      System.out.print("  -->  ");
      if (('a' <= c) && (c <= 'z')) {
        System.out.println((char) (c + 'A' - 'a'));
      }
      else {
        System.out.println(c);
      }
      System.out.print("Unesite znak: ");
      c = input.next().charAt(0);
    }
  }
}