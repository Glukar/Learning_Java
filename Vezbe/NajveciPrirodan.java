import java.util.Scanner;
class NajveciPrirodan {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    // Deklaracija
    int n, a;
    
    System.out.print("Unesite a:");
    a = input.nextInt();
   
    for (n = 0; n*(n + 1) < 2*a; n++);
    System.out.println();
    n--;
    System.out.println(n);
  }
}