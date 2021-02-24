class Tacka {
  double x, y;
  static final int NULA = 0;
}

class StaticTest {
  static final int JEDAN = 1;
  public static void main(String[] args) {
    Tacka t = new Tacka();
    System.out.println("Nule: " + Tacka.NULA + ", " + t.NULA);
    System.out.println("Jedan: " + JEDAN);
  }
}