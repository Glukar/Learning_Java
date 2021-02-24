class SumaRV {
  static double sumaRV(int n) {
    final int DONJA_GR = 1;
    if (n >= DONJA_GR) {
      double suma = 1.0;
      for (int i = 2; i <= n; i++) {
        suma += 1.0 / i;
      }
      return suma;
    }
    else {
      return -1.0;
    }
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.println("Suma RV je " + sumaRV(n));
  }
}