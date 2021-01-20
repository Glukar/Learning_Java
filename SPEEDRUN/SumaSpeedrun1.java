import java.util.Scanner;
class SumaSpeedrun1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double n, suma = 0.0;
    System.out.print("Unesite broj n: ");
    n = input.nextDouble();
    for (int i = 1;i < n;i++) {
      suma = suma + 1.0 / i;
    }
    System.out.println("Vasa suma je: " + suma);
  }
}