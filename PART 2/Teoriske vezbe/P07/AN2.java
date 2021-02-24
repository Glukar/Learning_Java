class AN2 {
  static double an2(double a, int n) {
    if (a == 0.0) {
      return 0.0;
    }
    else {
      n = Math.abs(n);
      double s = 1.0;
      double x = 1.0 / a;
      double cinilac = a * a;
      for (int i = 1; i <= n; i++) {
        x *= cinilac;
        s *= x;
      }
      return s;
    }
  }
  public static void main(String[] args) {
    System.out.print("Unesite realan broj a: ");
    double a = Svetovid.in.readDouble();
    System.out.print("Unesite ceo broj n: ");
    int n = Svetovid.in.readInt();
    System.out.println("a^(n^2) = " + an2(a, n));
  }
}