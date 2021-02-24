/*Program koji ucitava niz od duz celih brojeva i kreira i
 ispisuje novi niz tako sto iz istarog niza izbaci sve duplikate.*/

class Duplikati123{
  public static void main(String[] args){
    int[] niz2 = new int[50];
    
    System.out.println("Ucitajte duz niza");
    int duz1 = Svetovid.in.readInt();
    int[] niz1 = new int[duz1];
    
    for(int i = 0; i < duz1; i++){
      System.out.println("Unesite " + (i + 1) + ". element niza = ");
      niz1[i] = Svetovid.in.readInt();
    }
    
    int duz2 = 0;
    
    for(int i = 0; i < duz1; i++){
      boolean duplikat = false;
      int j = 0;
      while(j < i && !duplikat){
        if(niz1[i] == niz1[j]){
          duplikat = true;
        }else{
          j++;
        }
      }
      if(!duplikat) {
        niz2[duz2] = niz1[i];
        duz2++;
      }
    }
    
    System.out.print("Elementi drugog niza su:");
    for (int i = 0; i < duz2; i++) {
      System.out.print(" " + niz2[i]);
    }
    
  }
}