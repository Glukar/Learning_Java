class RazniFor {
  public static void main(String[] arguments) {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }
    for (int i = 1; i <= 5; System.out.println(i), i++);
    int i = 1;
    for (System.out.println("Start!"), i = 1; i <= 5; System.out.println(i++));    
  }
}