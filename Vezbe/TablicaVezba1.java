import java.util.*;
class TablicaVezba1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n;
    System.out.print("Unesite n: ");
    n = input.nextInt();
    for (int i = 1; i <= n;i++) {
      for (int j = 1; j <= n;j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }
}