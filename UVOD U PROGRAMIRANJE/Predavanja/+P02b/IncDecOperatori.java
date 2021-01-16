class IncDecOperatori {
  public static void main(String[] args) {
    int i = 10;
    int j = 3; 
    int k;
    k = j++ + i;
    System.out.println("k = " + k);
    k = ++j + i;
    System.out.println("k = " + k);
  }
}