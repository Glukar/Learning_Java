import java.util.*;
class ParNepar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj, brPar = 0, brNepar = 0;
    
    System.out.println("Unos prirodnih brojeva zavrsite brojem 0.");
    do {
      System.out.print("Unesite broj: ");
      broj = input.nextInt();
      if (broj % 2 == 1) {
        brNepar++;
      }
      else {
        brPar++;
      }
    } while (broj != 0);
      brPar--;
      System.out.println("Broj unetih parnih brojeva: " + brPar);
      System.out.println("Broj neparnih unetih brojeva" + brNepar);
  }
}