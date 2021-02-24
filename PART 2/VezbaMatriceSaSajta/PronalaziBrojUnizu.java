 /*Program koji ucitava niz celih brojeva duzine duz i jedan broj i metodom linearnog pretrazivanja pronalazi trazeni broj u nizu i 
  ispisuje njegovu poziciju. 
  Ukoliko se trazeni broj ne nalazi u nizu, ispisati odgovarajucu poruku.*/

class PronalaziBrojUnizu{
  public static void main(String[] args){
    int i;
    
    System.out.println("Ucitajte duzinu niza");
    int duz = Svetovid.in.readInt();
    int[] niz = new int[duz];
    
    for(i = 0; i < duz; i++){
      System.out.println("Ucitajte " + i + ". element u nuz: ");
      niz[i] = Svetovid.in.readInt();
    }
    
    System.out.println("Ucitajte vas zeljeni broj za trazenje:");
    int broj = Svetovid.in.readInt();
    
    boolean pronadjen = false;
    trazenje : for(i = 0; i < duz; i++){
      System.out.println("Trazim " + (i + 1) + ". put!");
      if(niz[i] == broj){
        pronadjen = true;
        break trazenje;
      }
    }
    
    if(pronadjen){
      System.out.println("Broj je pronadjen na poziciji " + i);
    }else{
      System.out.println("Broj nije pronadjen!");
    }
    
  }
}
