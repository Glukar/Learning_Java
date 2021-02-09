import java.util.Scanner;
class LinTraVezba1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int i;
    boolean pronadjen = false;
    System.out.println("Unesite broj elemenata u nizu: ");
    int broj = input.nextInt();
    int[] niz = new int[broj];
    for (i = 0;i < broj;i++) {
      System.out.print("Unesite " + i + ". element niza: ");
      niz[i] = input.nextInt();
    }
    System.out.print("Unesite broj koji zelite da pronadjete u nizu: ");
    int x = input.nextInt();
    i = 0;
    while (i < niz.length && !pronadjen) {
      if (niz[i] == x) {
        pronadjen = true;
      } else {
        i++;
      }
    }
    if (pronadjen) {
      System.out.println("Vas broj " + x + " se nalazi na " + i + ". poziciji.");
    } else {
      System.out.println("Vas broj se ne nalazi u ovom nizu.");
    }
  }
}