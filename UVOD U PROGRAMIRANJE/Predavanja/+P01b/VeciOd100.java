class VeciOd100 {
  public static void main(String[] arguments) {
    int broj;
    System.out.print("Unesi broj: ");
    broj = Svetovid.in.readInt();
    if (broj > 100) {
      System.out.println("Uneti broj je veci od 100");
    }
    else {
      System.out.println("Uneti broj nije veci od 100");
    }
  }
}