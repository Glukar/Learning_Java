import java.util.*;
class OperacijaVezba2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int a, b, rez;
    char operacija;
    System.out.print("Unesite prvi ceo broj: ");
    a = input.nextInt();
    System.out.print("Unesite drugi ceo broj");
    b = input.nextInt();
    System.out.print("Unesite validnu operaciju(+, -, *, /): ");
    operacija = input.next().charAt(0);
    while (operacija != '+' || operacija != '-' || operacija != '*' || operacija != '/') {
//    do {
//      System.out.print("Unesite validnu operaciju(+, -, *. /): ");
//      operacija = input.next().charAt(0);
//    } while (operacija != '+' || operacija != '-' || operacija != '*' || operacija != '/');
    if (operacija == '+') {
      rez = a + b;
      System.out.println("Vas rezultat je: " + rez);
      break;
    } else if (operacija == '-') {
      rez = a - b;
      System.out.println("Vas rezultat je: " + rez);
      break;
    } else if (operacija == '*') {
      rez = a * b;
      System.out.println("Vas rezultat je: " + rez);
      break;
    } else if (operacija == '/') {
      rez = a / b;
      System.out.println("Vas rezultat je: " + rez);
      break;
    } else {
      System.out.print("Uneli ste ne validnu operaciju, probajte opet. ");
      System.out.print("Unesite validnu operaciju(+, -, *, /): ");
      operacija = input.next().charAt(0);
    }
    }
  }
}