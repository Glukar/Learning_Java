import java.util.Scanner;
class BananaVezba1 {
  public static void main(String[] args) {
    Scanner banana = new Scanner(System.in);
    // Deklaracija
    int b = 0, a = 0, n = 0, ostali = 0;
    char x;
    System.out.println("Unosite karaktere i unos zavrsite tackom. Unos ce biti proveren i program ce videti da li moze da se ispise rec banana.");
    do {
      System.out.print("Unos: ");
      x = banana.next().charAt(0);
      switch(x) {
        case 'b': 
          b++;
          break;
        case 'a':
          a++;
          break;
        case 'n':
          n++;
          break;
        default: 
          ostali++;
          break;
      }
    } while (x != '.');
    ostali--;
    if (b >= 1 && a >= 3 && n >= 2) {
      System.out.println("Moze se ispisati rec banana, ostali karakteri: " + ostali);
    } else {
      System.out.println("Ne moze se ispisati rec banana, ostali karakteri: " + ostali);
    }
  }
}