import java.util.Scanner;
class BrojCifaraVezba2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int ostali = 0;
    int[] niz = new int[10];
    System.out.print("Unesite string: ");
    String unos = input.next();
    for (int i = 0;i < unos.length();i++) {
      char c = unos.charAt(i);
      if (c >= '0' && c <= '9') {
        niz[c - '0']++;
      } else {
        ostali++;
      }
      }
    for (int i = 0;i < 10;i++) {
      System.out.println("Broj cifara " + i + " je " + niz[i]);
    }
    System.out.println("Broj ostalih znakova je: " + ostali);
    }
  }