import java.util.Scanner;
class DekUMVezba3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int duz = 0, i, m, broj, tmp;
    System.out.print("Unesite broj: ");
    broj = input.nextInt();
    System.out.print("Unesite osnovu m: ");
    m = input.nextInt();
    int[] cifre = new int[100];
    tmp = broj;
    do {
      cifre[duz] = tmp % m;
      tmp = tmp / m;
      duz++;
    } while (tmp != 0);
    System.out.print("Broj " + broj + " u sistemu sa osnovom " + m + " je: ");
    for (i = duz - 1;i >= 0; i--) {
      System.out.print(cifre[i] + " ");
    }
  }
}