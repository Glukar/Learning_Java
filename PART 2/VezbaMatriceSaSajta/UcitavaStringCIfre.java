/*Napisati program koji ucitava string i ispisuje koliko kojih cifara string sadrzi, kao i broj znakova iz stringa koji nisu cifre.*/

class UcitavaStringCIfre{
  public static void main(String[] args){
    int[] niz = new int[100];
    int ostali = 0;
    
    System.out.println("Ucitati string");
    String s = Svetovid.in.readLine();
    
    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      if(c >= '0' && c <= '9'){
        niz[c - '0']++;
      }else{
        ostali++;
      }
    }
    
    for(int i = 0; i < 10; i++){
      System.out.println("Brojevi u stringu su : " + i + " ---> " + niz[i]);
    }
    
    System.out.println("Ostalih znakova ima : " + ostali);
    
  }
}