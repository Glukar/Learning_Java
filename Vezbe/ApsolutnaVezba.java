import java.util.*;
class ApsolutnaVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int a;
    System.out.print("Unesite ceo broj: ");
    a = input.nextInt();
    if (a > 0) {
    System.out.println("Apsolutan broj je: " + a);
    } else {
      System.out.println("Apsolutan broj je: " + Math.abs(a));
    }
  }
}