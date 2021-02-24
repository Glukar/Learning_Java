class Tacka {
  double x, y;
  Tacka() { }
  Tacka(double xInit, double yInit) {
    x = xInit; y = yInit;
  }
  void translirajX(double pomeraj) {
    x += pomeraj;
  }
  void translirajY(double pomeraj) {
    y += pomeraj;
  }
  void translirajXY(double pomeraj) {
    translirajX(pomeraj);
    translirajY(pomeraj);
  }
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}

class TackaTestOOConsToString {
  public static void main(String[] args) {
    Tacka t1 = new Tacka(1.0, 2.0);
    Tacka t2 = new Tacka(5.0, 0.0);
    t1.translirajY(10.0);
    t2.translirajX(5.0);
    System.out.println("t1 = " + t1.toString());
    System.out.println("t2 = " + t2); // .toString() se moze izostaviti
    t1.translirajXY(-3.0);
    System.out.println("t1 = " + t1);
  }
}