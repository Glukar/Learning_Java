class NajveciPrirodan {
  public static void main(String args[]) {
    int n, a;
    
    System.out.println("Unesite a");
    a = Svetovid.in.readInt();
   
    for (n = 0; n*(n + 1) < 2*a; n++);
    System.out.println();
    n--;
    System.out.println(n);
  }
}