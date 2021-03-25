//  Formirati dvodimenzionalni niz ?iji su elementi definisani izrazom: x i,j = {1, i<j,  2, i=j,  0, i>j}
import java.util.Scanner; 
class Matrica29 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Unesite broj redova u matrici: ");
      int red = input.nextInt();
      System.out.print("Unesite broj kolona u matrici: ");
      int kol = input.nextInt();
      int[][] A = new int[red][kol];
      // Ubacivanje elemenata definisanih izrazom u matricu
      for (int i = 0; i < red; i++) {
        for (int j = 0; j < kol; j++) {
          if (i < j) {
            A[i][j] = 1;
          } else if (i == j) {
            A[i][j] = 2;
          } else {
            A[i][j] = 0;
          }
        }
      }
      // Ispis matrice
      for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[i].length; j++) {
          System.out.print(A[i][j] + " ");
        }
        System.out.println();
      }
    }
  }