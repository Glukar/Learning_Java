class SumaRek1 {
  static double sabirak(int n) {
    return n; // ovde se definicija sabirka moze promeniti
  }
  static double suma(int n) {
    if (n == 0)
      return 0.0;
    else
      return suma(n-1) + sabirak(n);
  }
  public static void main(String[] args) {
    System.out.print("Unesite n: ");
    int n = Svetovid.in.readInt();
    System.out.println("suma(n) = " + suma(n));
  }
}