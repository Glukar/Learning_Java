/*Napisati program koji ucitava broj i osnovu m, i ispisuje uneti broj u binarnom sistemu sa osnovom m.*/

class OsnovaMbinarniBroj{
  public static void main(String[] args){
    int[] niz = new int[100];
    
    System.out.println("Ucitajte broj");
    int broj = Svetovid.in.readInt();
    System.out.println("Ucitajte osnovu");
    int m = Svetovid.in.readInt();
    
    int temp = broj;
    int i = 0;
    while(temp != 0){
      niz[i] = temp % m;
      temp = temp / m;
      i++;
    }
    
    System.out.println("Broj: " + broj + " sa osnovom: " + m + " u binarnom sistemu izgleda ovako: ");
    for(int j = i - 1; j != 0; j--){
      System.out.print(niz[j]);
    }
    
  }
}