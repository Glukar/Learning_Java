/*Napisati program koji ucitava stringove a i b i ispisuje koliko se puta string a nalazi u stringu b.*/
import java.util.*;
class Zadatak3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija sa inputom.
    System.out.print("Unesite string a: ");
    String a = input.nextLine();
    System.out.print("Unesite string b: ");
    String b = input.nextLine();

    String manji = "", veci = "";
    int br = 0;
    if (a.length() > b.length()) {
      veci = a;
      manji = b;
    } else if (a.length() < b.length()) {
      manji = a;
      veci = b;
    } else {
      br += a == b ? 1 : 0;
    }

    for (int i = 0; i <= veci.length() - manji.length(); i++) {
      boolean sadrzi = true;
      for (int j = 0; j < manji.length(); j++) {
        sadrzi = manji.charAt(j) == veci.charAt(i + j);
      }
      br += sadrzi ? 1 : 0;
    }

    System.out.println("Sadrzi se " + br + " puta.");
  }
} 