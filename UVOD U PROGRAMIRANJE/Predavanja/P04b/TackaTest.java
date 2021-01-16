class Tacka {
  double x, y;
}

class TackaTest {
  public static void main(String[] args) {
    Tacka t1 = new Tacka();
    Tacka t2 = new Tacka();
    t1.x = 1.0;
    t1.y = 2.0;
    t2.x = 5.0;
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
    System.out.println("t2 = (" + t2.x + ", " + t2.y + ")");
  }
}