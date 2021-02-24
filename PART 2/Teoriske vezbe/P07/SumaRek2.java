class SumaRek2 {
  static double sabirak(int n) {
    return n; // ovde se definicija sabirka moze promeniti
  }
  static double suma(double zbir, int i, int n) {
    if (i > n)
      return zbir;
    else
      return suma(zbir + sabirak(i), i + 1, n);
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.println("suma(n) = " + suma(0.0, 1, n));
  }
}