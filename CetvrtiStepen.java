class CetvrtiStepen {
  public static void main(String[] args) {
    int n = 1;
    glavnaPetlja: while (true) {
      n++;
      int pom = n;
      int zbir = 0;
      while (pom != 0) {
        int cifra = pom % 10;
        zbir += cifra * cifra * cifra * cifra;
        if (zbir > n) continue glavnaPetlja;
        pom /= 10;
      }
      if (zbir == n) break;
    }
    System.out.println("Prvi ceo broj veci od 1 koji je jednak " + "zbiru cetvrtih stepena svojih cifara je " + n);
  }
}