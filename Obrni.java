import java.util.*;
class Obrni {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj, cifra;
    
    System.out.print("Unesite prirodan broj: ");
    broj = input.nextInt();
    
    System.out.print("Obrnuti broj je: ");
    do {
      cifra = broj % 10;
      System.out.print(cifra);
      broj =  broj / 10;
    } while (broj != 0);
  }
}