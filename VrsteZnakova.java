import java.util.*;
class VrsteZnakova {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    char c;
    int slova = 0;
    int cifre = 0;
    int ostali = 0;
    
    System.out.println("Unesite znakove i unos zavrsite tackom.");
    c = input.next().charAt(0);
    while (c != '.') {
      if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
        slova++;
      }
      else if ('0' <= c && c <= '9') {
        cifre++;
      }
      else {
        ostali++;
      }
      c = input.next().charAt(0);
    }
    System.out.println("Uneto je " + slova + " slova, " + cifre + " cifara i " + ostali + " ostalih znakova.");
  }
}