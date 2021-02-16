import java.util.Scanner;
class DuplikatiVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz1, duz2 = 0, i, j;
    boolean duplikat;
    int[] niz1 = new int[50];
    int[] niz2 = new int[50];
    System.out.print("Unesite broj elemenata u nizu: ");
    duz1 = input.nextInt();
    for (i = 0; i < duz1; i++) {
      System.out.print("Unesite " + i + ". element niza: ");
      niz1[i] = input.nextInt();
    }
    for (i = 0; i < duz1; i++) {
      j = 0;
      duplikat = false;
      while (!duplikat && j < i) {
      if (niz1[i] == niz1[j]) {
        duplikat = true;
      } else {
        j++;
      }
      }
      if (!duplikat) {
        niz2[duz2] = niz1[i];
        duz2++;
      }
    }
    System.out.print("Elementi drugog niza su: ");
    for (i = 0; i < duz2; i++) {
      System.out.print(niz2[i] + " ");
    }
  }
}