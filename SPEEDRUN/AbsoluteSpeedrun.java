import java.util.Scanner;
class AbsoluteSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj1, abs;
    System.out.print("Unesite vas broj: ");
    broj1 = input.nextInt();
    if(broj1 > 0) {
      System.out.println("Vas absolutni broj je: " + broj1);
    } else {
      abs = -broj1;
      System.out.println("Vas absolutni broj je: " + abs);
    }
  }
}