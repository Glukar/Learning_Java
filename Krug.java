import java.util.*;
class Krug {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Deklarisanje
    double poluprecnik, povrsina, obim;
    //Izracunavanje povrsine i obima
    System.out.println("Unesite poluprecnik kruga: ");
    poluprecnik = input.nextDouble();
    povrsina = poluprecnik * poluprecnik * Math.PI;
    obim = poluprecnik * 2.0 * Math.PI;
    //Rezultat
    System.out.println("Povrsina kruga sa unetim poluprecnikom je ");
    System.out.println(povrsina + ", a njegov obim je " + obim);
  }
}