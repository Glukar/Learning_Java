import java.util.Scanner;
class ParNeparVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj, par = 0, nePar = 0;
    do {
    System.out.print("Unesite broj: ");
    broj = input.nextInt();
    if ((broj % 2) == 0) {
      par++;
    } else {
      nePar++;
    }
    } while (broj != 0);
      par--;
      System.out.println("Parnih brojeva ima: " + par);
      System.out.println("Ne parnih brojeva ima: " + nePar);
  }
}