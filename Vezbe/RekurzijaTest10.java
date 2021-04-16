/* Napisati program koji ucitava prirodan broj i proverava    da li su sve cifre unetog broja parne. */ 
import java.util.Scanner;
class RekurzijaTest10 {
  public static void main(String[] args) {
    String broj = unos();
    provera(broj);
  }
  public static String unos() {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite brojeve za koje zelite da proverite da li su parni: ");
    String broj = input.nextLine();
    return broj;
  }
  public static void provera(String broj) {
    boolean paran = true;
    for(int i = 0; i < broj.length(); i++) {
      char c = broj.charAt(i);
      if (c % 2 != 0 && paran) {
        paran = false;
      }
    }
    if (!paran) {
      System.out.println("Uneti brojevi nisu parni.");
    } else {
      System.out.println("Uneti brojevi su parni.");
    }
  }
}