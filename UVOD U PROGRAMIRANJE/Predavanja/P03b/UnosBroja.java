class UnosBroja {
  public static void main(String[] arguments) {
    int broj;
    do {
      System.out.print("Unesite broj veci od 10: ");
      broj = Svetovid.in.readInt();
    } while (broj <= 10);
    System.out.println("Uneli ste broj veci od 10. Hvala.");
  }
}