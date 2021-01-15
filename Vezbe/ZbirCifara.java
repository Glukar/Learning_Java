import java.util.*;
class ZbirCifara {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj, cifra, zbir = 0;
    System.out.print("Unesite vas broj: ");
    broj = input.nextInt();
    while (broj != 0) {
      cifra = broj % 10;
      zbir = zbir + cifra;
      broj = broj / 10;
    }
    System.out.println("Vas zbir je: " + zbir);
  }
}