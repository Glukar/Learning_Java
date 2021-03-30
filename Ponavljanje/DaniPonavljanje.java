/* Program koji ucitava redni broj dana u nedelji, i pomocu naredbe    switch ispisuje da li je u pitanju radni dan ili vikend. */
import java.util.Scanner;
class DaniPonavljanje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite redni broj dana u nedelji: ");
    int n = input.nextInt();
    switch(n) {
      case 1: case 2: case 3: case 4: case 5:
        System.out.println("Uneli ste radni dan.");
        break;
      case 6: case 7:
        System.out.println("Uneli ste vikend.");
        break;
      default: 
        System.out.println("Niste uneli validan dan.");
        break;
    }
  }
}