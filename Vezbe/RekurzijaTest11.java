/* Napisati program koji ucitava prirodan broj n    i ispisuje tablicu mnozenja velicine n x n.  */ 
import java.util.Scanner;
class RekurzijaTest11 {
  public static void main(String[] args) {
    int n = n();
    rez(n);
  }
  public static int n() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite velicinu tablice: ");
    int n = input.nextInt();
    return n;
  }
  public static void rez(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(i * j + "\t");
      }
      System.out.println();
    }
  }
}