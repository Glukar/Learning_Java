import java.util.Scanner;
class FunkcijaSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double x;
    System.out.print("Unesite vas x: ");
    x = input.nextInt();
    if (x == 0) {
      x = 42;
    } else if (x < 0) {
      x = x * x;
    } else {
      x = Math.log(x);
    }
    System.out.println("Vas x je: " + x); 
  }
}