import java.util.*;
class Banana {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    char c;
    int brB = 0;
    int brA = 0;
    int brN = 0;
    
    System.out.println("Unesite znakove i unos zavrsite tackom.");
    c = input.next().charAt(0);
    while (c != '.') {
      switch (c) {
        case 'b' :
          brB++;
          break;
        case 'a':
          brA++;
          break;
        case 'n':
          brN++;
          break;
      }
      c = input.next().charAt(0);
    }
    if (brB >= 1 && brA >= 3 && brN >= 2) {
      System.out.println("Moze se formirati rec \"banana\".");
    } else {
      System.out.println("Ne moze se formirati rec \"banana\".");
    }
  }
}