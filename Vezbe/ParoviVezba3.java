import java.util.Scanner;
class ParoviVezba3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 0, j = 0;
    System.out.println("Unesite prirodan broj n: ");
    int n = input.nextInt();
    glavnaPetlja: for (i = 1;i <= n;i++) {
      unutrasnjaPetlja: for (j = 1; j <= n;j++) {
        int proizvod = i * j;
        int zbir = 0;
        int pom = i;
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
        }
        if (proizvod == zbir) {
          break glavnaPetlja;
        }
      }
    }
    if (i <= n) {
      System.out.println("Par brojeva je: " + i + " i " + j);
    } else {
      System.out.println("Ne postoji takav par brojeva.");
    }
  }
}