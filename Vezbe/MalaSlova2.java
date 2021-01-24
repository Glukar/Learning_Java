import java.util.*;
class MalaSlova2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    char c;
    int broj = 0, slova = 0, ostalo = 0;
    System.out.println("Unosite karaktere, velika slova ce biti promenjena u mala. Unos zavrsite tackom.");
    do {
      System.out.print("Unos: ");
      c = input.next().charAt(0);
      if (c >= '1' && c <= '9') {
        broj++;
      } else if (c >= 'a' && c <= 'z') {
        slova++;
      } else if (c >= 'A' && c <= 'Z') {
        System.out.println((char)(c + 32));
        slova++;
      } else {
        ostalo++;
      }
    } while (c != '.');
    ostalo--;
    System.out.println("Uneli ste: " + broj + " broja, " + slova + " slova, " + ostalo + " ostalih.");
  }
}