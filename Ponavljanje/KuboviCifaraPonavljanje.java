/* Napisati program koji stampa sve cele brojeve izmedju 1 i 10000    koji su jednaki zbiru kubova svojih cifara. */
class KuboviCifaraPonavljanje {
  public static void main(String[] args) {
    System.out.println("Brojevi koji su jednaki zbiru kubova svojih cifara su: ");
    glavnaPetlja: for (int i = 1; i <= 10000; i++) {
      int pom = i;
      int zbir = 0;
      while (pom != 0) {
      int cifra = pom % 10;
      zbir += cifra * cifra * cifra;
      if (zbir > i)
        continue glavnaPetlja;
        pom /= 10;
      }
      if (zbir == i)
        System.out.println(i);
    }
  }
}