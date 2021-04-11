import java.util.Scanner;
class RekurzijaTest5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj od kog zelite da pocne odbrojavanje: ");
    int n = input.nextInt();
    System.out.println(odb(n));
  }
  static int odb(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return odb(n - 1);
    }
  }
}