class BreakFor {
  public static void main(String[] arguments) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("i = " + i);
      if (i == 3) break;
    }
  }
}