import java.util.*;
class DaniVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n;
    System.out.print("Unesite broj dana u nedelji: ");
    n = input.nextInt();
    switch(n) {
      case 1: 
        System.out.println("Uneli ste radni dan.");
        break;
        case 2: 
        System.out.println("Uneli ste radni dan.");
        break;
        case 3: 
        System.out.println("Uneli ste radni dan.");
        break;
        case 4: 
        System.out.println("Uneli ste radni dan.");
        break;
        case 5: 
        System.out.println("Uneli ste radni dan.");
        break;
        case 6: 
        System.out.println("Uneli ste vikend.");
        break;
        case 7: 
        System.out.println("Uneli ste vikend.");
        break;
      default: 
      System.out.println("Uneli ste ne vazeci dan.");
      break;
    }
  }
}