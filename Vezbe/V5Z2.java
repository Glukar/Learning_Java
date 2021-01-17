import java.util.*;
class V5Z2 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   // Deklaracija
   int a, b, c;
   int i = 0;
   System.out.print("Unesite vrednost za broj a: ");
   a = input.nextInt();
   System.out.print("Unesite vrednost za broj b: ");
   b = input.nextInt();
   System.out.print("Unesite vrednost za broj c: ");
   c = input.nextInt();
   int min = b;
   while (a <= c && b>= c) {
     if (c < min) {
       min = c;
     }
     System.out.print("Unesite vrednost za broj c: ");
     c = input.nextInt();
     i++;
   }
   System.out.println("Najmanji broj je: " + min);
   System.out.println("Broj unesenih elemenata je: " +  i);
  }
}