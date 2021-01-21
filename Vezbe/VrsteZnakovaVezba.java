import java.util.*;
class VrsteZnakovaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj = 0, slova = 0, ostali = 0; 
    char unos;
    System.out.println("Unesite sekvencu znakova, unos zavrsite tackom.");
    do {
      System.out.print("Sledeci unos: ");
      unos = input.next().charAt(0);
      if (unos >= '1' && unos <= '9') {
        broj++;
      } else if(unos >= 65 && unos <= 90 || unos >= 97 && unos <= 122) {
        slova++;
      } else {
        ostali++;
      }
    } while (unos != '.');
    ostali--;
    System.out.println("Uneli ste: " + broj + " broja, " + slova + " slova i " + ostali + " ostalih.");
  }
}