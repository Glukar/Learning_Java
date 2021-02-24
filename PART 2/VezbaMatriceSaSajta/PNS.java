/*Napisati program koji ucitava string s i cele brojeve p i n,
 i u string rez kopira n znakova iz stringa s pocevsi od znaka
 na poziciji p. Ukoliko to nije moguce, ispisati poruku o gresci.*/


class PNS{
  public static void main(String[] args){
    
    System.out.println("Ucitajte string");
    String s = Svetovid.in.readLine();
    
    System.out.println("Ucitajte ceo broj p");
    int p = Svetovid.in.readInt();
    System.out.println("Ucitajte ceo broj n");
    int n = Svetovid.in.readInt();
    
    String rez = "";
    
    if(n + p > s.length()){
      System.out.println("Nije moguce ispisato ovo!");
    }else{
      for(int i = p; i < p + n; i++){
        rez = rez + s.charAt(i);
      }
      System.out.println("String rez je: " + rez);
    }
    
  }
}