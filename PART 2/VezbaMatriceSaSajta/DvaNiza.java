/*Program koji ucitava dva niza celih brojeva i pronalazi i ispusje sve elemente prvog niza koji se nalaze u drugom nizu.*/

class DvaNiza{
  public static void main(String[] args){
    int duz1, duz2, i, j;
    
    System.out.print("Ucitajte duzinu prvog niza: ");
    duz1 = Svetovid.in.readInt();
    int[] niz1 = new int[duz1];
    
    for(i = 0; i < duz1; i++){
      System.out.println("Ucitajte " + (i + 1) + ". element u nizu");
      niz1[i] = Svetovid.in.readInt();
    }
    
    System.out.print("Ucitajte duzinu drugog niza: ");
    duz2 = Svetovid.in.readInt();
    int[] niz2 = new int[duz2];
    
    for(i = 0; i < duz2; i++){
      System.out.println("Ucitajte " + (i + 1) + ". element u nizu");
      niz2[i] = Svetovid.in.readInt();
    }
    
    for(i = 0; i < duz1; i++){
      boolean provera = false;
      for(j = 0; j < duz2 && !provera; j++){
        if(niz1[i] == niz2[j]){
          System.out.println("Ovaj se nalazi u drugom nizu : " + niz1[i]);
          provera = true;
        }
      }
    }
    
  }
}