import java.util.Scanner;
class KonverzijaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    int broj = 0;
    String s;
    boolean greska = false;
    System.out.print("Unesite string koji zelite da pretvorite u broj: ");
    s = input.next();
    // Uzimanje jednog karaktera i pretvaranje njega u broj.
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        broj = broj * 10  + c - '0';
      } else {
          greska = true;
        }
    }
    if (greska) {
      System.out.println("Doslo je do greske, dozvoljeno je unositi samo cifre.");
    } else {
      System.out.println("Uneti broj je: " + broj);
    }
  }
}