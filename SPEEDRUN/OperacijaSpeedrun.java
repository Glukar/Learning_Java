import java.util.Scanner;
class OperacijaSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj1, broj2, rez = 0;
    char operacija;
    System.out.print("Unesite vas prvi broj: ");
    broj1 = input.nextInt();
    System.out.print("Unesite vas drugi broj: ");
    broj2 = input.nextInt();
    System.out.print("Unestie validnu operaciju(+, -, *, /): ");
    operacija = input.next().charAt(0);
    if (operacija == '+') {
      rez = broj1 + broj2;
    } else if (operacija == '-') {
      rez = broj1 - broj2;
    } else if (operacija == '*') {
      rez = broj1 * broj2;
    } else if (operacija == '/') {
      rez = broj1 / broj2;
    } else {
      System.out.println("Niste uneli validnu operaciju.");
    }
    System.out.println("Vas rezultat je: " + rez);
  }
}