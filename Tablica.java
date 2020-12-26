import java.util.*;
class Tablica {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Deklaracija 
    int n, i, j;
    System.out.print("Unesite broj n: ");
    n = input.nextInt();
    System.out.println("Tabloca mnozenja za broj " + n + ":");
    System.out.println();
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
  }
}