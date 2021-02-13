import java.util.Scanner;
class BrojCifaraVezba4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Deklaracija
    int ostali = 0;
    int[] cifre = new int[10];
    System.out.print("Unesite string: ");
    String s = input.next();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c <= '9' && c >= '0') {
        cifre[c - '0']++;
      } else {
        ostali++;
      }
    }
    for (int i = 0; i <= 9; i++) {
      System.out.println("Broj cifara " + i + " je " + cifre[i]);
    } 
    System.out.println("Broj ostalih cifara je: " + ostali);
  }
}