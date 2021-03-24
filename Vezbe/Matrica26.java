// Formirati dvodimenzionalni niz ?iji su elementi definisani izrazom: x:i,j { 4, i<=j 2, i<j }
import java.util.Scanner;
class Matrica26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj kolona u matrici: ");
    int kol = input.nextInt();
    int[][] niz = new int[red][kol];
    
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        if (i <= j) {
          niz[i][j] = 4;
        } else {
          niz[i][j] = 1;
        }
      }
    }
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(niz[i][j] + " ");
      }
      System.out.println();
    }
  }
}