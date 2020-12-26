import java.util.*;
class Funkcija {
  public static void main(String[] args){
    Scanner input =  new Scanner(System.in);
    double x, rez;
    // Unos argumenata funkcije
    System.out.print("Unesite vrednost argumenta funkcije: ");
    x = input.nextDouble();
    if (x < 0) {
      rez = x * x;
    } else if(x == 0) {
      rez = 42;
    } else {
      rez = Math.log(x);
    }
    // Ispisivanje rezultata
    System.out.println("Za vrednost argumenta " + x + " vrednost funkcije iznosi " + rez);
  }
}