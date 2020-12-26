import java.util.*;
class DekUM {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz, broj, m, i, tmp;
    int[] cifre = new int[100];
    System.out.print("Unesite broj: ");
    broj = input.nextInt();
    System.out.print("Unesite osnovu m: ");
    m = input.nextInt();
    duz = 0;
    tmp = broj;
    do {
      cifre[duz] = tmp % m;
      tmp = tmp / m;
      duz++;
    } while (tmp != 0);
    System.out.print("Broj " + broj + " u sistemu sa osnovom " + m + " je: ");
    for (i = duz -1; i >= 0; i--) {
      System.out.print(cifre[i] + " ");
    }
  }
}