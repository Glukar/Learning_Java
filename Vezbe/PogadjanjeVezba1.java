import java.util.*;
class PogadjanjeVezba1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double broj1 = (int) (Math.random() * 100) + 1;
    int broj2 = 0;
    while (broj2 != broj1) {
      System.out.print("Unesite vas broj: ");
      broj2 = input.nextInt();
      if (broj2 == broj1) {
        System.out.println("Uspesno ste pogodili broj.");
      } else if (broj2 < broj1) {
        System.out.print("Vas broj je premali, unesite veci broj. ");
      } else if (broj2 > broj1) {
        System.out.print("Vas broj je preveliki, unesite manji broj. ");
      } else {
        System.out.println("Niste uspeli da pogodite broj.");
      }
    }
  }
}