class BinKoef {
  static double f(double stari, int n, int k) {
    return stari * (n - k + 1) / k;
  }
  static double bk(int n, int k) {
    if (n >= 0 && k >= 0) {
      if (k > n) {
        return 0;
      }
      else {
        if (k > n - k) k = n - k;
        double tekucaVrednost = 1;
        for (int i = 1; i <= k; i++) {
          tekucaVrednost = f(tekucaVrednost, n, i);
        }
        return tekucaVrednost;
      }
    }
    else {
      return -1;
    }
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.print("Unesite k: ");
    int k = Svetovid.in.readInt();
    System.out.println("bk(n, k) = " + bk(n, k));
  }
}