import java.util.Scanner;
class SumaSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n;
    double suma = 0.0;
    System.out.print("Unesite n: ");
    n = input.nextInt();
    for (int i = 1;i < n;i++) {
      suma = suma + 1.0 / i;
    }
    System.out.println("Vasa suma je: " + suma);
  }
}