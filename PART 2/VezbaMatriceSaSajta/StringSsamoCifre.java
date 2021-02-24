/*.Napisati program koji ucitva string s koji sadrzi samo cifre,
 konvertuje ga u ceo broj i ispisuje tako dobijeni broj. Ukoliko
 string ne sadrzi samo cifre, ispisati poruku o gresci.*/

class StringSsamoCifre{
  public static void main(String[] args){
    int[] broj = new int[100];
    
    System.out.println("Ucitati string");
    String s = Svetovid.in.readLine();
    
    int duz = 0;
    boolean greska = false;
    for(int i = 0; i < s.length() && !greska; i++){
      char c = s.charAt(i);
      if(c <= '9' && c >= '0'){
        broj[i] = (c - '0');
        duz++;
      }else{
        greska = true;
      }
    }
    
    if(!greska){
      System.out.println("Broj je: ");
      for(int i = 0; i < duz; i++){
        System.out.print(broj[i]);
      }
    }else{
      System.out.println("Greska u ucitavanju!");
    }
  }
}