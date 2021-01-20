import java.util.*;
class PogadjanjeVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double broj = (int) (Math.random() * 100) + 1, pokusaj = 0;
    int brojPokusaja = 0;
    boolean ispao = false;
    boolean pogodak = false;
    do {
      if (brojPokusaja == 10) {
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
      pogodak = true;
    }
    } while (ispao == false && pogodak == false);
    if (pogodak == true) {
      System.out.println("Uspesno ste pogodili broj " + broj + "!");
    } else {
      System.out.println("Niste uspesno pogodili broj, sakriveni broj je bio: " + broj);
    }
  }
}