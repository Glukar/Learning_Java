import java.util.Scanner;
class Razlika {
  public static void main(String args[]) {
    Scanner myInput = new Scanner(System.in);
    int a;
    int b;
    int c;
    int sum;
    //Deklarisanje
    System.out.println("Unesi prvi broj: ");
    a = myInput.nextInt();
    //Unosenje prvog broja.
    System.out.println("Unesi drugi broj: ");
    b = myInput.nextInt();
    //Unosenje drugog broja.
    System.out.println("Unesi treci broj: ");
    c = myInput.nextInt();
    sum = a - b - c;
    System.out.println(sum);
    //Iscitavanje rezultata.
  }
}