 /*Program koji ucitava rastuci niz celih brojeva duzine duz i
   jos jedan broj, i metodom binarnog pretrazivanja pronalazi trazeni
   broj u nizu i ispisuje njegovu poziciju. Ukoliko se trazeni
   broj ne nalazi u nizu, ispisati odgovarajucu poruku.*/

class RastuciNiz{
  public static void main(String[] args){
    int duz, i, broj;
    
    System.out.println("Ucitajte duz");
    duz = Svetovid.in.readInt();
    int[] niz = new int[duz];
    
    for (i = 0; i < niz.length; i++) {
      do {
        System.out.print("Unesite " + i + ". element niza: ");
        niz[i] = Svetovid.in.readInt();
      } while (!(i == 0 || niz[i-1] < niz[i]));
    }
    
    System.out.println("Ucitajte broj");
    broj = Svetovid.in.readInt();
    
    boolean nadjen = false;
    for(i = 0; i < duz && !nadjen; i++){
      if(broj == niz[i]){
        System.out.println("Broj postoji na poziciji " + i + " u nizu!");
        nadjen = true;
      }
    }
    
    if(!nadjen){
      System.out.println("Broj nije pronadjen u nizu!");
    }
    
  }
}