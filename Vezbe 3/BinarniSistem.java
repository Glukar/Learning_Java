import java.util.*;
class BinarniSistem {
  public static void main(String argv[]) {
    Scanner input = new Scanner(System.in);
    int m;
    do {
      System.out.print("Unesite brojevni sistem: ");
      m = input.nextInt();
    } while (m < 2 || m > 10);
    
    int broj;
    boolean dobarBroj = true;
    do {
      System.out.print("Unesite broj u sistemu m: ");
      broj = input.nextInt();
      
      int tmpBroj = broj;
      while (tmpBroj > 0) {
        dobarBroj = (tmpBroj % 10) < m;
        tmpBroj /= 10;
      }
    } while (!dobarBroj);
    
    int dekadniBroj = 0;
    int i = 0;
    while (broj > 0) {
      dekadniBroj += (broj % 10) * Math.pow(m, i++);
      broj /= 10;
    }
    
    System.out.println(dekadniBroj);
  }
}