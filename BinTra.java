import java.util.*;
class BinTra {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz, levi, desni, srednji, broj;
    boolean nadjen;
    
    System.out.print("Unesite broj elemenata u monotono rastucem nizu: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for(int i= 0;i < niz.length; i++) {
      do {
        System.out.print("Unesite " + i + ". element niza: ");
        niz[i] = input.nextInt();
      } while (!(i == 0 || niz[i-1] < niz[i]));
    }
    System.out.print("Unesite broj koji treba pronaci: ");
    broj = input.nextInt();
    levi = 0;
    desni = niz.length -1;
    nadjen = false;
    do {
      srednji = (levi + desni) / 2;
      if (broj == niz[srednji]) {
        nadjen = true;
      }
      else if (niz[srednji] < broj) {
        levi = srednji + 1;
      }
      else {
        desni = srednji - 1;
      }
    } while (!(desni < levi || nadjen));
    
    if (nadjen) {
      System.out.println("Broj je na poziciji " + srednji);
    } else {
      System.out.println("Broj se ne nalazi u nizu.");
    }
  }
}