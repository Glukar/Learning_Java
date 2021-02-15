import java.util.Scanner;
class LinTraSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz, broj, i;
    boolean nadjen = false;
    System.out.print("Unesite duzinu niza celih brojeva: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for (i = 0; i < duz; i++) {
      System.out.print("Unesite " + i + ". broj: ");
      niz[i] = input.nextInt();
    }
    System.out.print("Unesite broj koji zelite da pronadjete: ");
    broj = input.nextInt();
    i = 0;
    while (i < niz.length && !nadjen) {
      if (broj == niz[i]) {
        nadjen = true;
      } else {
        i++;
      }
    }
    if (nadjen) {
      System.out.println("Vas broj se nalazi na " + i + ". mestu.");
    } else {
      System.out.println("Vas broj se ne nalazi u ovom nizu.");
    }
  }
}