class Faktorijel {
  static int fakt(int n) {
    if (n == 1) {
      return 1;
    }
    else {
      return fakt(n - 1) * n;
    }
  }
  public static void main(String[] args) {
    int n;
    do {
      System.out.print("Unesite broj n za koji se racuna n! (n>0): ");
      n = Svetovid.in.readInt();
    } while (n <= 0);
    System.out.println("n! = " + fakt(n));
  }
}