// Program koji racuna vrednost funkcije
import java.util.Scanner;
class RekurzijaTest13 {
  public static void main(String[] args) {
    int x = input();
    stampa(x);
  }
  public static int input() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite x:");
    int x = input.nextInt();
    return x;
  }
  public static void stampa(double x) {
    if (x < 0) {
      x = x * x;
      System.out.println(x);
    } else if (x == 0) {
      x = 42;
      System.out.println(x);
    } else {
      x = Math.log(x);
      System.out.println(x);
    }
  }
}