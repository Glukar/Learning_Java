class KuboviCifaraVezba3 {
  public static void main(String[] args) {
    // Glavna deklaracija
    int zbir, pom, cifra;
    System.out.println("Brojevi koji su jednaki zbiru svojih kubova cifara: ");
    glavnaPetlja: for (int i = 1; i < 10000; i++) {
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
        System.out.println(i);
      } 
    }
  }
}