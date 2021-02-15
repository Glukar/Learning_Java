import java.util.Scanner;
class NizoviSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz1, duz2, i, j;
    boolean nadjen;
    System.out.print("Unesite duzinu prvog niza: ");
    duz1 = input.nextInt();
    int[] niz1 = new int[duz1];
    for (i = 0; i < duz1; i++) {
      System.out.print("Unesite broj na " + i + ". mestu: ");
      niz1[i] = input.nextInt();
    }
    System.out.print("Unesite duzinu drugog niza: ");
    duz2 = input.nextInt();
    int[] niz2 = new int[duz2];
    for (j = 0; j < duz2;j++) {
      System.out.print("Unesite broj na " + j + ". mestu: ");
      niz2[j] = input.nextInt();
    }
    System.out.print("Sledeci brojevi se nalaze u oba niza: ");
    for (i = 0; i < duz1; i++) {
      j = 0;
      nadjen = false;
      while (j < duz2 && !nadjen) {
        if (niz1[i] == niz2[j]) {
          System.out.print(niz1[i] + " ");
          nadjen = true;
        } else {
          j++;
        }
      }
    }
  }
}