import java.util.*;
class LinTraVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj, i;
    boolean pronadjen = false;
    System.out.print("Unesite broj elemenata u nizu: ");
      i = input.nextInt();
      int[] niz = new int[i];
      for (i = 0; i < niz.length;i++){
      System.out.print("Unesite " + i + ". element niza: ");
      niz[i] =  input.nextInt();
    } 
        System.out.print("Unesite broj koji treba pronaci u nizu: ");
        broj = input.nextInt();
        i = 0;
        while (i < niz.length && !pronadjen) {
          if (i == broj) {
            pronadjen = true;
          } else {
            i++;
          }
        }
        if (pronadjen) {
          System.out.println("Vas broj je na mestu: " + i);
        } else {
          System.out.println("Vas broj nije pronadjen u ovom nizu.");
        }
  }
}