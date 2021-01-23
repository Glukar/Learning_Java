import java.util.*;
class NajveciNVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double a, b, n = 1;
    int rezultat;
    System.out.print("Unesite broj a: ");
    a = input.nextDouble();
    System.out.print("Unesite broj b: ");
    b = input.nextDouble();
    do {
      n = n * b;
    } while (n < a);
    n = n / b;
    rezultat =(int)n;
    System.out.println(a + " > " + b + "^" + rezultat);
  }
  }
