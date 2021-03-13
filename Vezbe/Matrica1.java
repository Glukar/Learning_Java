import java.util.Scanner;
class Matrica1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj redova u matrici: ");
    int red = input.nextInt();
    System.out.print("Unesite broj nizova u matrici: ");
    int niz = input.nextInt();
    int[][] M = new int[red][niz];
    for (int i = 0; i < red; i++) {
      for (int j = 0; j < niz; j++) {
        System.out.print("Unesite broj u " + i + " redu, u " + j + " nizu: ");
        M[i][j] = input.nextInt();
      }
      System.out.println();
    }
    System.out.println("Vasa matrica izgleda ovako: ");
    for (int i = 0; i < red; i++) {
      for(int j = 0; j < niz; j++) {
        System.out.print(M[i][j] + " ");
      }
      System.out.println();
    }
  }
}