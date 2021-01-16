class Vazenje {
  public static void main(String[] args) {
    int x = 10; // vidljiva u celom main metodu
    if (x == 10) { // nova oblast
      int y = 20; // vidljiva u ovoj unutrasnjoj oblasti
      System.out.println("x i y: " + x + " " + y);
      // x i y su vidljivi u unutrasnjem bloku
      x = y * 2;
      // double x = 5.5; // ovo bi bila greska, x vec postoji
    }
    // y = 100; // ovo bi bila greska, y ovde vise nije vidljivo
    System.out.println("x = " + x); // x se vidi u ovom bloku
  }
}