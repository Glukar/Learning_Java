import java.util.*;
class MalaSlovaVezba {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   // Deklaracija
   char s;
   System.out.println("Unosite karaktere koje zelite da budu napisani malim slovom, unos zavrsite tackom.");
     do {
       System.out.print("Sledeci unos: ");
       s = input.next().charAt(0);
       if (s >= 65 && s <= 90) {
         System.out.println((char)(s + 'a' - 'A'));
       } else if (s == '.') {
         break;
       } else {
         System.out.println("Karakter nije promenjen: " + s);
       }
   } while (s != '.');
  }
}