import java.util.*;
class Pogadjanje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj1, broj2, n;
    
    // Postavljanje zamisljenog broja
    broj1 = (int) (Math.random() * 100) + 1;
    
    // Pogadjanje zamisljenog broja
    System.out.print("Pogadjajte zamisljeni broj od 1 do 100: ");
    broj2 = input.nextInt();
    n = 1;
    while (broj1 != broj2) {
      if (broj1 > broj2) {
        System.out.print("Unesite veci broj: ");
      }
      else {
        System.out.print("Unesite manji broj: ");
      }
      broj2 = input.nextInt();
      n++;
    }
    // Ispis broja pokusaja
    System.out.println("Pogodak! Ukupan broj pokusaja je " + n + ".");
  }
}