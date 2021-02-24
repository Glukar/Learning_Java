class SideEffect {
  static int vred;
  static int f(int x) {
    vred += x;
    return vred;
  }
  static int g(int x) {
    return vred + x;
  }
  public static void main(String[] args) {
    vred = 1;
    System.out.println("f(vred) + g(vred) = " + (f(vred) + g(vred)));
    vred = 1;
    System.out.println("g(vred) + f(vred) = " + (g(vred) + f(vred)));
  }
}