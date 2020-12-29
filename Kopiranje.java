import java.util.*;
class Kopiranje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite string: ");
    String s = input.next();
    System.out.print("Unesite redni broj prvog znaka: ");
    int p = input.nextInt();
    System.out.print("Unesite broj znakova za kopiranje: ");
    int n = input.nextInt();
    String rez = "";
    if (p + n <= s.length()) {
      for (int i = p; i < p + n; i++) {
        rez = rez + s.charAt(i);
      }
      System.out.println("Kopirani string izgleda ovako: " + rez);
    }
    else {
      System.out.println("Nije moguce dobiti trazeni string.");
    }
  }
}