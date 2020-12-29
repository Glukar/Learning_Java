import java.util.*;
class Konverzija {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite cifre broja: ");
    String s = input.next();
    // Deklaracija
    int broj = 0;
    int i = 0;
    boolean greska = false;
    while (i < s.length() && !greska) {
      char c = s.charAt(i);
      if('0' <= c && c <= '9') 
        broj = broj * 10 + c - '0';
      else 
        greska = true;
        i++;
    }
      if (greska) 
        System.out.println("Greska! Dozvoljeno je uneti samo cifre.");
      else 
        System.out.println("Uneti broj je: " + broj);
  }
}