import java.util.Scanner;
class KrugSpeedrun {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    double r, o, p;
    System.out.print("Unesite poluprecnik kruga: ");
    r = input.nextDouble();
    o = 2 * r * Math.PI;
    p = r * r * Math.PI;
    System.out.println("Krug sa poluprecinkom: " + r + " ima obim: " + o + " i povrsinu: " + p);
  }
}