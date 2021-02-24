enum OsnovneBoje {
  CRVENA, ZELENA, PLAVA
}

enum Oblici {
  TROUGAO, KVADRAT, PETOUGAO, SESTOUGAO, KRUG
}

class EnumTest {
  public static void main(String[] args) {
    OsnovneBoje boja = OsnovneBoje.ZELENA;
    Oblici oblik = Oblici.KVADRAT; // mora kvalifikovano
    if (boja == OsnovneBoje.PLAVA)
      System.out.println(boja + ": volim tu boju");
    else
      System.out.println(boja + ": ne volim je");
    switch (oblik) {
      case TROUGAO: // mora kvalifikovano
        System.out.println("Vidim trougao!");
        break;
      case KVADRAT:
        System.out.println("Vidim kvadrat!");
        break;
      default:
        System.out.println("Vidim nesto drugo...");      
    }
    OsnovneBoje[] sveBoje = OsnovneBoje.values();
    for (OsnovneBoje b : sveBoje) {
      System.out.println(b);
    }
  }
}