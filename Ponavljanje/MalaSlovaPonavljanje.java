/* Program koji ucitava sekvencu znakova i ispisuje ih na ekran    tako sto sva velika slova pretvara u mala, a ostale znakove    ispisuje neizmenjeno. Sekvenca znakova zavrsava se tackom. */
import java.util.Scanner;
class MalaSlovaPonavljanje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    char c;
    System.out.println("Unosite znakove i slova, slova ce biti pretvorena u mala. Unos zavrsite tackom: ");
    // Unos prvog znaka
    System.out.print("Unos: ");
    c = input.next().charAt(0);
    // Unos daljih znakova
    while (c != '.') {
      if ((c >= 'A') && (c <= 'Z')) {
        System.out.println((char)(c + 'a' - 'A'));
      } else {
        System.out.println(c);
      }
      System.out.print("Unos: ");
      c = input.next().charAt(0);
    }
  }
}