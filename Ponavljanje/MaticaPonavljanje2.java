// U?itati dvodimenzionalni niz. Ispisati: negativne, nule pa pozitivne ?lanove niza.
import java.util.Scanner;
class MatricaPonavljanje2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u nizu: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u nizu: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    // Unos u niz
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        System.out.print("A[" + i + ", " + j + "]");
        niz[i][j] = input.nextInt();
      }
    }
    // Negativni clanovi
    System.out.println("Negativni clanovi: ");
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] < 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
    } 
    System.out.println();
    System.out.println("Nule: ");
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] == 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
    }
    System.out.println();
    System.out.println("Pozitivni clanovi: ");
    for (int i = 0; i < niz.length; i++) {
      for (int j = 0; j < niz[i].length; j++) {
        if (niz[i][j] > 0) {
          System.out.print(niz[i][j] + " ");
        }
      }
    }
  }
}