class HanojskeKule {
  static void hKule(int n, int izvor, int cilj, int pomoc) {
    if (n == 1) { // jedan disk
      System.out.println("Prebaci disk sa stapa " + izvor + 
                         " na stap " + cilj);
    }
    else { // vise diskova
      hKule(n-1, izvor, pomoc, cilj);
        // n-1 diskova sa izvor na pomoc, koristeci cilj kao pomocni
      hKule(1, izvor, cilj, pomoc);
        // prebaci jedini disk sa izvor na cilj
      hKule(n-1, pomoc, cilj, izvor);
        // n-1 diskova sa pomoc na cilj, koristeci izvor kao pomocni 
    }
  }
  public static void main(String[] args) {
    int n;
    do {
      System.out.print("Unesite broj diskova n (n>0): ");
      n = Svetovid.in.readInt();
    } while (n <= 0);
    hKule(n, 1, 2, 3);
  }
}