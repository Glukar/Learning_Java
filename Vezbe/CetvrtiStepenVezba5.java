class CetvrtiStepenVezba5 {
  public static void main(String[] args) {
    // Glavna deklaracija
    int pom, cifra, zbir, i;
    i = 1;
    glavnaPetlja: while(true) {
      i++;
      pom = i;
      zbir = 0;
      while (pom != 0) {
        cifra = pom % 10;
        zbir += cifra * cifra * cifra * cifra;
        if (zbir > i) {
          continue glavnaPetlja;
        } else {
          pom /= 10;
        }
      }
      if (zbir == i) {
        System.out.println("Broj koji je jednak zbiru cetvrtog stepena svojih cifara je: " + i);
        break glavnaPetlja;
      }
    }
  }
}