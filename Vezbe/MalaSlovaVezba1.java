import java.util.Scanner;
class MalaSlovaVezba1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int broj = 0, slovo = 0, ostali = 0;
    char unos;
    System.out.println("Unesite znakove, slova ili brojeve. Sva velika slova bice pretvorena u mala slova. Unos zavrsite tackom.");
    do {
      System.out.print("Unos: ");
      unos = input.next().charAt(0);
      if (unos >= '1' && unos <= '9') {
        broj++;
      } else if(unos >= 'a' && unos <= 'z') {
        slovo++;
      } else if (unos >= 'A' && unos <= 'Z') {
        System.out.println((char)(unos + 32)); 
      } else {
        ostali++;
      }
    } while (unos != '.');
    ostali--;
    System.out.println("Slova: " + slovo + ", brojeva: " + broj + ", ostalih: " + ostali);
  }
}