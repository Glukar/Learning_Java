/* Napisati program koji stampa prvi ceo broj veci od 1    koji je jednak zbiru cetvrtih stepena svojih cifara. */ 
class CetvrtiStepenVezba4 {
  public static void main(String[] args) {
    // Deklaracija
    int n = 1;
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
        break;
      }
    }
    System.out.println(n);
  }
}