import java.util.*;
class FznakVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double x;
    char znak;
    System.out.print("Unesite broj x: ");
    x = input.nextDouble();
    System.out.print("Unesite znak funkcije(s, c, a, l, e): ");
    znak = input.next().charAt(0);
    switch((int)x) {
      case 1:
        znak = 's';
        x = Math.sin(x);
        break;
      case 2:
        znak = 'c';
        x = Math.cos(x);
        break;
      case 3:
        znak = 'a';
        x = Math.atan(x);
        break;
      case 4:
        znak = 'l';
        x = Math.log(x);
        break;
      case 5: 
        znak = 'e';
        x = Math.exp(x);
        break;
    }
    System.out.println("Vas x nakon unete operacije iznosi: " + x);
  }
}