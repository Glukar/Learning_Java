import java.util.*;
class LinTra {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz, broj, i;
    boolean nadjen;
    System.out.print("Unesite broj elementa u nizu: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for (i = 0; i < niz.length; i++) {
      System.out.print("Unesite " + i + ". element niza: ");
      niz[i] = input.nextInt();
    }
    System.out.print("Unesite broj koji treba pronaci: ");
    broj = input.nextInt();
    nadjen = false;
    i = 0;
    while (i < niz.length && !nadjen) {
      if (niz[i] == broj) {
        nadjen = true;
      }
      else {
        i++;
      }
    }
    if (nadjen) {
      System.out.println("Broj je na poziciji " + i);
    }
    else {
      System.out.println("Broj se ne nalazi u nizu.");
    }
  }
}