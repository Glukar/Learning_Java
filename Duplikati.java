import java.util.*;
class Duplikati {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz, duz2, i, j;
    int[] niz = new int[50];
    int[] niz2 = new int[50];
    boolean duplikat;
    
    System.out.print("Unesite broj elemenata u nizu: ");
    duz = input.nextInt();
    for (i = 0; i < duz; i++) {
      System.out.print("Unesite " + i + ". element niza: ");
      niz[i] = input.nextInt();
    }
    duz2 = 0;
    for (i = 0; i < duz; i++) {
      duplikat = false;
      j = 0;
      while (j < i && !duplikat) {
        if (niz[i] == niz[j]) {
          duplikat = true;
        }
        else {
          j++;
        }
      }
      if (!duplikat) {
        niz2[duz2] = niz[i];
        duz2++;
      }
    }
    System.out.print("Elementi drugog niza su:");
    for (i = 0; i < duz2; i++) {
      System.out.print(" " + niz2[i]);
    }
  }
}
  