import java.util.*;
class Absolute {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int x, abs;
    // Unos broja u promenljivu x
    System.out.print("Unesite ceo broj: ");
    x = input.nextInt();
    // Izracunavanje absolutne vrednosti broja
    abs = x;
      if(x < 0) {
      abs = -x;
    }
    // Stampanje rezultata
    System.out.println("Apsolutna vrednost je: " + abs);
  }
}