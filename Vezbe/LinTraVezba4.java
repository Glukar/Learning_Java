import java.util.Scanner;
class LinTraVezba4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    boolean nadjen = false;
    int broj, i, duz;
    System.out.print("Unesite duzinu duzi celih brojeva: ");
    duz = input.nextInt();
    int[] niz = new int[duz];
    for (i = 0; i < duz;i++) {
      System.out.print("Unesite " + i + " broj: ");
      niz[i] = input.nextInt();
    }
    System.out.print("Unesite broj koji zelite da pronadjete: ");
    broj = input.nextInt();
    for (i = 0; i < niz.length;i++) {
      if (broj == niz[i]) {
        nadjen = true;
        break;
      } else {
        continue;
      }
    }
    if (nadjen) {
      System.out.println("Vas broj je pronadjen na mestu: " + i);
    } else {
      System.out.println("Vas broj nije pronadjen u ovom nizu.");
    }
  }
}