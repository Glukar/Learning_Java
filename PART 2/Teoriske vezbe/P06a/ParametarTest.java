class Tacka {
  double x, y;
}

class ParametarTest {

  static void stampajInc(double x) {
    x++; // menja vrednost formalnog parametra, 
         // ali ne i stvarnog
    System.out.println("metod: x = " + x);
  }

  static void menjajTacku(Tacka t) {
    t.x++; // promenice polje x stvarnog parametra
    t = new Tacka(); // nema efekta na stvarni parametar
  }
  
  public static void main(String[] args) {
    double x = 5.0;
    stampajInc(x);
    System.out.println("main: x = " + x);
    Tacka t1 = new Tacka();
    t1.x = 22.0;
    t1.y = 57.0;
    menjajTacku(t1);
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
    ParametarTest.menjajTacku(t1); // 2. nacin da se pozove staticki metod
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
    ParametarTest pt = new ParametarTest();
    pt.menjajTacku(t1); // 3. nacin da se pozove staticki metod
    System.out.println("t1 = (" + t1.x + ", " + t1.y + ")");
  }
}