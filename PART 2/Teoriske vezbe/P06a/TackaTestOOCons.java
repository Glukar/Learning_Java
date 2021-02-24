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
}

class TackaTestOOCons {
  public static void main(String[] args) {
    Tacka t1 = new Tacka(1.0, 2.0);
    Tacka t2 = new Tacka(5.0, 0.0);
    t1.translirajY(10.0);
    t2.translirajX(5.0);
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
    System.out.println("t2 = (" + t2.x + ", " + t2.y + ")");
    t1.translirajXY(-3.0);
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
  }
}