import java.util.Scanner;
class NizoviVezba2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    boolean nadjen = false;
    int duz1, duz2, i, j;
    System.out.print("Unesite duzinu prvog niza: ");
    duz1 = input.nextInt();
    int[] niz1 = new int[duz1];
    for (i = 0; i < duz1;i++) {
      System.out.print("Unesite " + i + ". element prvog niza: ");
      niz1[i] = input.nextInt();
    }
    System.out.print("Unestie duzinu drugog niza: ");
    duz2 = input.nextInt();
    int [] niz2 = new int[duz2];
    for (j = 0; j < duz2;j++) {
      System.out.print("Unestie " + j + ". element drugog niza: ");
      niz2[j] = input.nextInt();
    }
    System.out.print("Slededi elementi se nalaze u oba niza: ");
    for (i = 0;i < duz1;i++) {
      j = 0;
      nadjen = false;
      while (j < duz2 && !nadjen) {
      if (niz1[i] == niz2[j] && !nadjen) {
        nadjen = true;
        System.out.print(niz2[j] + " ");
      } else {
        j++;
      }
      }
    }
  }
}