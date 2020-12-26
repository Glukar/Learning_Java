import java.util.*;
class Operacija {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklarisanje
    double broj1, broj2, rezultat;
    char op;
    // Unos operanada i operacija
    System.out.print("Unesi prvi broj: ");
    broj1 = input.nextDouble();
    System.out.print("Unesi drugi broj: ");
    broj2 = input.nextDouble();
    System.out.print("Unesi znak za operaciju (+, *, /): ");
    op = input.next().charAt(0);
    // Izracunavanje i ispis rezultata
    if ((op == '+') || (op == '*') || (op == '/')) {
      if (op == '+') {
        rezultat = broj1 + broj2;
      } else if (op == '*') {
        rezultat = broj1 * broj2;
      } else if (broj2 != 0) {
        rezultat = broj1 / broj2;
      } else {
        rezultat = 0;
      }
      System.out.println("Rezultat je: " + rezultat);
    } else {
      System.out.println("Operacija nije dobro zadata.");
    }
  }
}