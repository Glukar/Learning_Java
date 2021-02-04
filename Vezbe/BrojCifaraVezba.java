import java.util.Scanner;
class BrojCifaraVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int ostali = 0;
    int[] cifre = new int[10];
    System.out.print("Unesite string: ");
    String s = input.next();
    for (int i = 0;i < s.length(); i++) { 
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        cifre [c - '0']++;
      } else {
        ostali++;
      }
    }
    for (int i = 0;i < 10;i++) {
      System.out.println("Broj cifara: " + i + " je " + cifre[i]);
    }
       System.out.println("Broj ostalih znakova je: " + ostali);
    }
  }