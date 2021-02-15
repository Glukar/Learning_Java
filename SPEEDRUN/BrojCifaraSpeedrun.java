import java.util.Scanner;
class BrojCifaraSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int ostali = 0;
    System.out.print("Unesite string: ");
    String s = input.next();
    int[] niz = new int[10];
    for (int i = 0;i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        niz[c - '0']++;
      } else {
        ostali++;
      }
    }
    for(int i = 0;i < 10;i++) {
      System.out.println("Broja " + i + " ima: " + niz[i]);
    }
    System.out.println("Ostalih ima: " + ostali);
  }
}