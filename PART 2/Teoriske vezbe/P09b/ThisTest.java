class Tacka {
  static final double JEDAN = 1.0;
  double x, y;
  Tacka(double x, double y) {
    this.x = x; this.y = y;
  }
  double testX() {
    int x = 2;
    final int JEDAN = -1;
    return this.x * x + Tacka.JEDAN + this.JEDAN;
  }
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}

class ThisTest {
  public static void main(String[] args) {
    Tacka t = new Tacka(1.0, 2.0);
    double x = t.testX();
    System.out.println("t.testX() = " + x); // 4.0
  }
}