// Napisati program koji ucitava duzinu kraka jednakokrakog    pravouglog trougla i iscrtava trougao te velicine na ekranu    pomocu znaka '*', gde jedinica duzine odgovara jednom znaku.
import java.util.Scanner;
class TrougaoPonavljanje {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite duzinu kraka jednakokrakog pravouglog trougla: ");
    int k = input.nextInt();
    for (int i = 1; i <= k; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}