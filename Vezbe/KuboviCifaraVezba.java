class KuboviCifaraVezba {
  public static void main(String[] args) {
    System.out.println("Brojevi jednaki zbiru kubova svojih cifara: ");
    glavnaPetlja: for (int n = 1; n <= 10000;n++){
      int pom = n;
      int zbir = 0;
      while (pom != 0) {
        int cifra = pom % 10;
        zbir += cifra * cifra * cifra;
        if (zbir > n) {
          continue glavnaPetlja;
        } else {
          pom /= 10;
        }
        if (zbir == n) {
          System.out.println(n);
        }
      }
    } 
  }
}