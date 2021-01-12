import java.util.*;
class KrugVezba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int r;
    double P, O;
    System.out.print("Unesite poluprecnik kruga: ");
    r = input.nextInt();
    O = 2 * r * Math.PI;
    P = r * r * Math.PI;
    System.out.println("Obim ovog kruga je: " + O + ",  a povrsina je: " + P);
  }
}