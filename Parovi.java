import java.util.*;
class Parovi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    System.out.print("Unesite prirodan broj n: ");
    int n = input.nextInt();
    int i = 0;
    int j = 0;
    glavnaPetlja: for (i = 1; i <= n; i++) {
      unutrasnjaPetlja: for (j = 1; j <= n; j++) {
        // Deklaracija u petlji: unutrasnjaPetlja
        int proizvod = i * j;
        int zbir = 0;
        int pom = i;
        while (pom != 0) {
          int cifra = pom % 10;
          zbir += cifra * cifra;
          if (zbir > proizvod)
            continue unutrasnjaPetlja;
          pom /= 10;
        }
        pom = j;
        while (pom != 0) {
          int cifra = pom % 10;
          zbir += cifra * cifra;
          if (zbir > proizvod)
            continue unutrasnjaPetlja;
          pom /= 10;
        }
        if (zbir == proizvod)
          break glavnaPetlja;
      }
    }
    if (i <= n) 
    System.out.println("Trazeni par brojeva je " + i + " i " + j);
    else 
      System.out.println("Trazeni par brojeva ne postoji.");
  }
}