import java.util.Scanner;
class Nizovi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz1, duz2, i, j;
    boolean nadjen;
    System.out.print("Unesite duzinu prvog niza: ");
    duz1 = input.nextInt();
    int[] niz1 = new int[duz1];
    for (i = 0; i < duz1; i++) {
      System.out.print("Unesite " + i + ". element prvog niza: ");
      niz1[i] = input.nextInt();
    }
    System.out.print("Unesite duzinu drugog niza: ");
    duz2 = input.nextInt();
    int[] niz2 = new int[duz2];
    for (i = 0; i < duz2; i++) {
      System.out.print("Unestie " + i + ". element drugog niza: ");
      niz2[i] = input.nextInt();
    }
    System.out.print("Sledeci elementi se nalaze u oba niza: ");
    for (i = 0; i < duz1; i++) {
      j = 0;
      nadjen = false;
      while (j < duz2 && !nadjen) {
        if (niz1[i] == niz2[j]) {
          nadjen = true;
          System.out.print(" " + niz1[i]);
        }
        j++;
      }
    }
  }
}