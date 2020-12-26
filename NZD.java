import java.util.*;
class NZD {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int prvi, drugi;
    do {
      System.out.print("Unesite prvi broj: ");
      prvi = input.nextInt();
    } while (prvi <= 0);
    do {
      System.out.print("Unesite drugi broj: ");
      drugi = input.nextInt();
    } while (drugi <= 0);
    while (prvi != drugi) {
      if (prvi > drugi) {
        prvi -= drugi;
      } 
      else {
        drugi -= prvi;
      }
    }
    System.out.println("Najveci zajednicki delitelj je: " + prvi);
  }
}