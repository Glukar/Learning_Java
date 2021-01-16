class Prosti {
  public static void main(String[] arguments) {
    System.out.print("Prosti brojevi od 1 do 100 su: ");
    System.out.print(2);
    prvi:
    for (int i = 3; i <= 100; i++) {
      if (i % 2 == 0) // ako je broj paran onda nije prost
        continue;
      for (int j = 3; j <= (int)Math.sqrt(i); j++)
        if (i % j == 0)
          continue prvi;
      System.out.print(", " + i);
    }
    System.out.println();
  }
}