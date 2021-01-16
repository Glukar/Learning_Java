class BreakForNested {
  public static void main(String[] arguments) {
    prva:
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 4; j++) {
        System.out.println("i = " + i + ", j = " + j);      
        if (i == 3) break prva;
      }
    }
  }
}