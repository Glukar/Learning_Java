/*Napisati program koji crta histogram pojave svih slova u ucitanom stringu s. 
  Na histogramu treba za svako slovo iscrtati onoliko zvezdica koliko se puta javljaju u stringu.*/

class Histagram{
  public static void main(String[] args){
    
    System.out.println("Unesite string");
    String unos = Svetovid.in.readLine();
    
    int[] slova = new int[26];
    
    for (int i = 0; i < unos.length(); i++) {
      char karakter = Character.toUpperCase(unos.charAt(i));
      if (karakter >= 'A' && karakter <= 'Z') {
        slova[karakter - 'A']++;
      }
    }
    
  }
}
