import java.util.Scanner;
class ParoviVezba2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int i = 0, j = 0, n;
    System.out.println("Unesite n: ");
    n = input.nextInt();
    glavnaPetlja: for (i = 1; i <= n;i++) {
      unutrasnjaPetlja: for (j = 1; j <= i; j++) {
        int proizvod = i * j;
        int pom = i;
        int zbir = 0;
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
      System.out.println("Trazeni par brojeva je: " + i + " i " + j);
    } else {
      System.out.println("Trazeni par brojeva ne postoji.");
    }
  }
}