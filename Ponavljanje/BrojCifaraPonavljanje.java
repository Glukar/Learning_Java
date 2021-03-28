/* Napisati program koji ucitava string i ispisuje koliko kojih cifara string sadrzi, kao i broj znakova iz stringa koji nisu cifre. */ 
import java.util.Scanner;
class BrojCifaraPonavljanje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    int cifre, ostali = 0;
    int[] niz = new int[10];
    System.out.print("Unesite string: ");
    String s = input.nextLine();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        niz[c - '0']++;
      } else {
        ostali++;
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("Broj cifara " + i + " je: " + niz[i]);
    }
    System.out.println("Broj ostalih znakova je: " + ostali);
  }
}