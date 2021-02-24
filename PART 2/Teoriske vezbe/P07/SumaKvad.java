class SumaKvad {
  static int sumaKvad(int n) {
    final int DONJA_GR = 1;
    final int GORNJA_GR = 2000;
    if (DONJA_GR <= n && n <= GORNJA_GR) {
      boolean ok = true;
      int i = 1;
      int suma = 0;
      while (ok && i <= n) {
        int sabirak = i * i;
        ok = Integer.MAX_VALUE - suma > sabirak;
        if (ok) suma += sabirak;
        i++;
      }
      if (ok)
        return suma;
      else
        return -1;
    }
    else {
      return -1;
    }
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.println("Suma kvadrata je " + sumaKvad(n));
  }
}