import java.util.*;
class BananaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija (provera da li se moze ispisati banana, o su ostali karakteri koji nisu potrebni za rec banana).
    int b = 0, a = 0, n = 0, o = 0;
    char x;
    System.out.println("Unosite znakove pa proverite da li se moze ispisati rec banana. ");
    do {
      System.out.print("Unos: ");
      x = input.next().charAt(0);
      if (x == 'b' || x == 'B') {
        b++;
      } else if (x == 'a' || x == 'A') {
        a++;
      } else if (x == 'n' || x == 'N') {
        n++;
      } else {
        o++;
      }
    } while (x != '.');
    o--;
    if (b >= 1 && a >= 3 && n >= 2) {
      System.out.println("Moze se ispisati rec banana, ostali karakteri: " + o); 
    } else {
      System.out.println("Ne moze se ispisati rec banana, ostali karakteri: " + o);
    }
  }
}