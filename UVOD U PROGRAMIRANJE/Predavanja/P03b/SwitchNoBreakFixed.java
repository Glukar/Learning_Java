class SwitchNoBreakFixed {
  public static void main(String[] args) {
    System.out.print("Unesite ceo broj: ");
    int broj = Svetovid.in.readInt();
    switch (broj) {
      case 0:
        System.out.println("nula");
        break;
      case 1:
        System.out.println("jedan");
        break;
      case 2:
        System.out.println("dva");
        break;
      case 3:
        System.out.println("tri");
        break;
      default:
        System.out.println("manji od nula ili veci od tri");
    }
  }
}