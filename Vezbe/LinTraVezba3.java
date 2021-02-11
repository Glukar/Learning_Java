import java.util.Scanner;
class LinTraVezba3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz = 0, broj, i;
    boolean nadjen = false;
    System.out.print("Unesite duzinu duzi celih brojeva: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for (i = 0; i < duz;i++) {
      System.out.print("Unestie " + i + " broj: ");
      niz[i] = input.nextInt();
    }
    System.out.print("unesite broj koji zelite da pronadjete: ");
    broj = input.nextInt();
    i = 0;
    while (i < niz.length && !nadjen) {
      if (niz[i] == broj) {
        nadjen = true;
      } else {
        i++;
      }
    }
    if (nadjen) {
      System.out.print("Uneti broj " + broj + " se nalazi na " + i + " mestu.");
    } else {
      System.out.print("Uneti broj se ne nalazi u ovom nizu.");
    }
  }
}