import java.util.*;
class Stepen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double x, rez;
    int n, i;
    // Ucitavanje realnog broja u promenljivi x
    System.out.print("Unesite realan broj x: ");
    x = input.nextDouble();
    // Ucitavanje celog broja u promeljivi n 
    System.out.print("Unesite prirodan broj n: ");
    n = input.nextInt();
    // Izracunavanje rezultata u promeljivoj rez
    rez = 1.0;
    for (i = 0; i < n; i++) {
      rez = rez * x;
    }
    // Stampanje ucitanih brojeva i rezultata
    System.out.println(x + "^" + n + " = " + rez);
  }
}