class KuboviCifaraVezba2 {
  public static void main(String[] args) {
    // Deklaracija
    System.out.println("Brojevi jednaki zbiru kubova svojih cifara su: ");
    glavnaPetlja: for(int i = 2;i < 10000; i++) {
      int pom = i;
      int zbir = 0;
      while (pom != 0) {
        int cifra = pom % 10;
        zbir += cifra * cifra * cifra;
        if (zbir > i) {
          continue glavnaPetlja;
        } else {
          pom /= 10;
        }
        if (zbir == i) {
          System.out.println(i);
        }
      }
    }
  }
}