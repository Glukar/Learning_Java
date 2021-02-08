class CetvrtiStepen5 {
  public static void main(String[] args) {
    // Deklaracija
    int n = 1;
    System.out.println("Prvi ceo broj veci od 1 koji je jednak zbiru cetvrtih stepena svojih cifara je: ");
    glavnaPetlja: while(true) {
      n++;
      int pom = n;
      int zbir = 0;
      while (pom != 0) {
        int cifra = pom % 10;
        zbir += cifra * cifra * cifra * cifra;
        if (zbir > n) {
          continue glavnaPetlja;
        } else {
          pom /= 10;
        }
      }
      if (zbir == n) {
        break glavnaPetlja;
      }
    }
    System.out.println(n);
  }
}