import java.util.Scanner;
class RazlikaSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int a, b, razlika = 0;
    System.out.print("Unesite broj a: ");
    a = input.nextInt();
    System.out.print("Unesite broj b: ");
    b = input.nextInt();
    razlika = a - b;
    System.out.println("Razlika: " + a + " i " + b  + " je: " + razlika);
  }
}