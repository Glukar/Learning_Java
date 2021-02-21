import java.util.Scanner;
  class ParoviVezba4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    int i, j = 0, proizvod, n, pom, zbir;
    System.out.print("Unesite n: ");
    n = input.nextInt();
    glavnaPetlja: for (i = 1; i < n; i++) {
      unutrasnjaPetlja: for (j = 1; j < n; j++) {
        proizvod = i * j;
        pom = i;
        zbir = 0;
        while (pom != 0) {
          int cifra = pom % 10;
          zbir += cifra * cifra;
          if (zbir > proizvod) {
            continue unutrasnjaPetlja;
          } else {
            pom /= 10;
          }
        }
      pom = j;
      while (pom != 0) {
        int cifra = pom % 10;
        zbir += cifra * cifra;
        if (zbir > proizvod) {
          continue unutrasnjaPetlja;
        } else {
          pom /= 10;
        }
        if (zbir == proizvod) {
          break glavnaPetlja;
        }
      }
      }
    }
    if (i <= n) {
      System.out.println("Trazeni par brojeva je " + i + " i " + j);
    } else {
      System.out.println("Trazeni par brojeva ne postoji.");
    }
  }
}