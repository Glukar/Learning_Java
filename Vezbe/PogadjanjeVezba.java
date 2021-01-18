import java.util.*;
class PogadjanjeVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double broj = (int) (Math.random() * 100) + 1;
    int brojPokusaja = 0, pokusaj = 0;
    boolean ispao = false;
    do {
      if (brojPokusaja == 5) {
        ispao = true;
      }
      else if (brojPokusaja == 0 && !ispao) {
        System.out.print("Unesite vas broj: ");
        pokusaj = input.nextInt();
        brojPokusaja++;
      }
    else if (pokusaj < broj && !ispao) {
      brojPokusaja++;
      System.out.print("Vas broj je previse mali, unesite veci broj: ");
      pokusaj = input.nextInt();
    } else if (pokusaj > broj && !ispao) {
      brojPokusaja++;
      System.out.print("Vas broj je previse veliki, unesite manji broj: ");
      pokusaj = input.nextInt();
    } else {
      System.out.println("Niste uspeli da pogodite broj.");
    }
    } while (pokusaj != broj);
    System.out.println("Uspesno ste pogodili broj " + broj + "!");
  }
}