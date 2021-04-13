/* Program koji racuna vrednost x^n za dati realan broj x    i prirodan broj n. */  
import java.util.Scanner;
class RekurzijaTest9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Vrednost x^n za dati x i n.");
    System.out.print("Unesite realan broj x: ");
    int x = input.nextInt();
    System.out.print("Unesite prirodan broj n: ");
    int n = input.nextInt();
    System.out.println(rez(x, n));
  }
  public static int rez(int broj, int step) {
    int rez = 1;
    for (int i = 0; i <= step; i++) {
      rez = rez * broj;
      System.out.println(rez);
    }
    return rez;
  }
}