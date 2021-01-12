import java.util.*;
class RazlikaVezba {
  public static void main(String[] args){
    int a, b, razlika;
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite delioca:");
    a = input.nextInt();
    System.out.print("Unesite deljenika: ");
    b = input.nextInt();
    razlika = a - b;
    System.out.println("Razlika " + a + " i " + b + " je: " + razlika); 
  }
}