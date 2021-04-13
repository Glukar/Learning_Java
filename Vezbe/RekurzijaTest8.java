import java.util.Scanner;
class RekurzijaTest8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj: ");
    int b = input.nextInt();
    System.out.println(abs(b));
  }
  public static int abs(int broj) {
    if (broj > 0) {
      return broj;
    } else {
      return -broj;
    }
  }
}