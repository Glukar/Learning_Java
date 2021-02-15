import java.util.Scanner;
class Kalkulator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Deklaracija
    int i, zbir = 0, razlika = 0, proizvod = 0;
    double kolicnik = 0;
    char op;
    String da;
    glavnaPetlja: while(true) {
      // Unosenje cifara, moze biti vise od 2 cifre zato sto se koristi niz.
      System.out.print("Unesite broj cifara za ovu operaciju: ");
      int duz = input.nextInt();
      int[] niz = new int[duz];
      for (i = 0; i < duz; i++) {
        System.out.print("Unesite " + i + ". cifru: ");
        niz[i] = input.nextInt();
      }
      do {
        // Jednostavno unosenje operacije, sa proverom.
        System.out.print("Unosite operacije(+, -, *, /): ");
        op = input.next().charAt(0);
        if (op == '+') {
          for (i = 0; i < duz; i++) {
            zbir += niz[i];
          }
          break;
        } else if (op == '-') {
          razlika = niz[0];
          for (i = 1; i < duz; i++) {
            razlika -= niz[i];
          }
          break;
        } else if(op == '*') {
          proizvod = niz[0];
          for (i = 1; i < duz; i++) {
            proizvod *= niz[i];
          } 
          break;
        } else if (op == '/') {
          kolicnik = niz[0];
          for (i = 1; i < duz; i++) {
            kolicnik /= niz[i];
          }
          break;
        } else{
          System.out.println("Uneli ste pogresknu operaciju, probajte opet.");
        }
      } while (op != '+' || op != '-' || op != '*' || op != '/');
      // Ispisivanje rezultata
      if (zbir > 0 || zbir < 0) {
        System.out.println("Vas zbir je: " + zbir);
      }
      if (razlika > 0 || razlika < 0) {
        System.out.println("Vasa razlika je: " + razlika);
      }
      if (proizvod > 0 || proizvod < 0) {
        System.out.println("Vas proizvod je: " + proizvod);
      }
      if (kolicnik > 0 || kolicnik < 0) {
        System.out.println("Vas kolicnik je: " + kolicnik);
      }
      System.out.print("Da li zelite da nastavite?(da/ne): ");
      da = input.next();
      if (da.matches("da")) {
        // Moze se koristiti i da.contains(), ako zelimo da proverimo da li "da" postoji u unetom stringu.
        // continue glavnaPetlja; resetuje kalkulator i cuva predhodno unete rezultate. 
        continue glavnaPetlja;
      } else {
        // Breakujemo ukoliko korisnik tako kaze.
        System.out.println("Hvala vam sto ste koristili ovaj kalkulator!");
        break;
      }
    }
  }
}
