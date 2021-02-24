class Parni {
  static double f(double stari, int n) {
    return stari + 2;
  }
  static double s(int n, double pocetnaVrednost) {
    double tekucaVrednost = pocetnaVrednost;
    for (int i = 1; i <= n; i++) {
      tekucaVrednost = f(tekucaVrednost, i);
    }
    return tekucaVrednost;
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.println("s(n) = " + s(n, 0));
  }
}