import java.util.*;
class FunkcijaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double x;
    System.out.print("Unesite funkciju: ");
    x = input.nextInt();
    if (x < 0) {
      x *= x;
    } else if (x == 0) {
      x = 42;
    } else {
      x = Math.log(x);
    }
    System.out.println("Vas x je: " + x);
  }
}