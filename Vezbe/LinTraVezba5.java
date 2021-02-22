import java.util.Scanner;
class LinTraVezba5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    int duz, i, broj;
    boolean nadjen = false;
    System.out.print("Unesite duzinu niza: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for (i = 0; i < duz; i++) {
      System.out.print("Unesite " + i + ". broj: ");
      niz[i] = input.nextInt();
    }
    System.out.print("Unesite broj koji zelite da pronadjete: ");
    broj = input.nextInt();
    i = 0;
    while (!nadjen && i < duz) {
      if (niz[i] == broj) {
        nadjen = true;
      } else {
        i++;
      }
    }
    if (nadjen) {
      System.out.println("Trazeni broj se nalazi na " + i + ". mestu.");
    } else {
      System.out.println("Trazeni broj se ne nalazi u ovom nizu.");
    }
  }
}