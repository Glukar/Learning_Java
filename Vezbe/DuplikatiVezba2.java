import java.util.*;
class DuplikatiVezba2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // glavna deklaracija
    int duz1, duz2 = 0, i, j;
    boolean duplikat = false;
    int[] niz1 = new int[100];
    int[] niz2 = new int[100];
    System.out.print("Unesite duzinu niza celih brojeva: ");
    duz1 = input.nextInt();
    for (i = 0; i < duz1; i++) {
      System.out.print("Unesite " + i + ". broj: ");
      niz1[i] = input.nextInt();
    }
    for (i = 0; i < duz1; i++) {
      j = 0;
      duplikat = false;
      while(j < i && !duplikat) {
        if (niz1[i] == niz1[j]) {
          duplikat = true;
        } else {
          j++;
        }
      }
      if (!duplikat) {
        niz2[i] = niz1[i];
        // Cini mi se da je svejedno ako stavimo niz2[i] i niz2[duz2], posto je i = duz2
        duz2++;
      }
    }
    System.out.print("Skup proslo unetih brojeva bez duplikata: ");
    for (i = 0; i < duz2; i++) {
      System.out.print(niz2[i] + " ");
    }
  }
}