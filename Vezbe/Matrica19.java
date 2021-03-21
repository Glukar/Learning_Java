// U?itati dvodimenzionalni niz. Ispisati: negativne, nule pa pozitivne ?lanove niza.
import java.util.Scanner;
class Matrica19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u matricu
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        System.out.print("A[" + i + ", "+ j + "]");
        niz[i][j] = input.nextInt();
      }
    }
    System.out.println("Negativni clanovi matrice: ");
    // Ispisivanje negativnih clanova matrice
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] < 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
      System.out.println();
    }
    System.out.println("Clanovi matrice koji su nula: ");
    // Ispisivanje clanova matrice koji su nula
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] == 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
      System.out.println();
    }
    System.out.println("Pozitivni clanovi matrice: ");
    // Ispisivanje pozitivnih clanova matrice
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] > 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}