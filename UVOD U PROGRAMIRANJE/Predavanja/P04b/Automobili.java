class Automobil {
  String marka, proizvodjac;
  int godinaProiz;
  String boja;
  int brKonja, brVrata = 5;
  String regBroj;
}

class Vlasnik {
  String ime, prezime, JMBG;
  Automobil auto;
}

class Automobili {
  public static void main(String[] args) {
    Vlasnik pera = new Vlasnik();
    pera.ime = "Pera";
    pera.prezime = "Peric";
    pera.JMBG = "0101900800001";
    pera.auto = new Automobil();
    pera.auto.marka = "Yugo Koral 55";
    pera.auto.proizvodjac = "Crvena zastava";
    pera.auto.godinaProiz = 1989;
    pera.auto.boja = "crvena";
    pera.auto.brKonja = 55;
    pera.auto.brVrata = 3;
  }
}