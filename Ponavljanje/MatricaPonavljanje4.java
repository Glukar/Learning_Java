//   U?itati dvodimenzionalni niz. Ispisati parne ?lanove matrice.
import java.util.Scanner;
class MatricaPonavljanje4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u nizu: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u nizu: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u matricu
    for(int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.println("A[ " + i + ", " + j + "]");
        niz[i][j] = input.nextInt();
      }
    }
    // Ispisivanje 
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (niz[i][j] % 2 == 0)
        System.out.print(niz[i][j] + " ");
      }
      System.out.println();
    }
  }
}