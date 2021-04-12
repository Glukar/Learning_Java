import java.util.Scanner;
class RekurzijaTest7 {
  // Glavna deklaracija
  static boolean nadjen = false;
  static int ziv;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj pokusaja: ");
    ziv = input.nextInt();
    // rand() stvara sakriveni broj
    rand();
    // U BrPok() se radi pogadjanje i ispisivnje grsaka ili tacnog broja
    brPok(ziv, rand());
  }
  public static double rand() {
    double randBroj = (int)(Math.random() * 100) + 1;
    return randBroj;
  }
  public static void brPok(int zivota, double randBroj) {
    Scanner input = new Scanner(System.in);
    int brPok = 0;
    do {
      System.out.print("Unesite broj: ");
      int p = input.nextInt();
      if (p == randBroj) {
        System.out.println("Pronasli ste sakriveni broj i ostalo vam je jos " + (ziv - brPok) + " pokusaja!");
        nadjen = true;
      } else if (p > randBroj) {
        brPok++;
        System.out.println("Ostalo vam je jos " + (ziv - brPok) + " pokusaja!");
        System.out.println("Sakriveni broj je manji!");
      } else {
        brPok++;
        System.out.println("Ostalo vam je jos " + (ziv - brPok) + " pokusaja!");
        System.out.println("Sakriveni broj je veci!");
      }
    } while (brPok < ziv && !nadjen);
    if (!nadjen) {
      System.out.println("Niste uspeli da pronadjete sakriveni broj!");
    }
  }
}