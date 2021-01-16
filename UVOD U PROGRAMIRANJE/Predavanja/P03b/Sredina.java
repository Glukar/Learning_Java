class Sredina {
  public static void main(String[] args) {
    int i = 100; 
    int j = 200;
    // sredina intervala izmedju i i j, ako je u startu i < j
    while (++i < --j);
    System.out.println("Sredina je: " + i);
  }
}
