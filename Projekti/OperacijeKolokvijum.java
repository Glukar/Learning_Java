/* 
 Program koji ucitava dva broja(intiger-a), 
znak za operaciju (+: sabiranje, *: mnozenje, /: deljenje, %ostatak, -minus), 
primenjuje datu operaciju na ucitane brojeve i ispisuje rezultat izracunavanja.
 (mora se paziti na to da ako korisnik unese nesto sto neodgovara,
 treba izbaciti poruku da je doslo do greske) 
 
 Zatim napraviti niz duzine poslednje cifre od rezultata prosle operacije(u slucaju da je rezultat bio nula i negativan broj izbaciti poruku da je doslo do greske),
 posle toga popuniti niz sa jedinicama (brojem 1) i ispisati na ekran vrednosti iz niza sa println.
 
 

----------------------------
Za uneti prvi broj 10
Za uneti drugi broj 3
Operacija podeljeno
---------------------------

Rezultat je: 3
1
1
1
 */
import java.util.Scanner;
class OperacijeKolokvijum{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Glavna deklaracija
    int a, b, rez = 2, i;
    char op;
    System.out.print("Unesite prvi broj: ");
    a = input.nextInt();
    System.out.print("Unesite drugi broj: ");
    b = input.nextInt();
    System.out.print("Unesite validnu operaciju(+: sabiranje, *: mnozenje, /: deljenje, %ostatak, -minus): ");
    op = input.next().charAt(0);
    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
      if (op == '+') {
        rez = a + b;
      } else if (op == '-') {
        rez = a - b;
      } else if (op == '*') {
        rez = a * b;
      } else if (op == '%') {
        rez = a % b;
      } else if (op == '/') {
        if (b == 0) {
          rez = 0;
          System.out.println("Ne moze se deliti sa nulom.");
        } else {
        rez = a / b;
        }
      } else {
        System.out.println("Niste uneli validnu operaciju.");
      }
    } else {
      System.out.println("Doslo je do velike greske.");
    }
    System.out.println("Vas rezultat je: " + rez);
    if (rez > 0) {
      int[] niz = new int[rez % 10];
      for (i = 0; i < niz.length; i++) {
        niz[i] = 1;
        System.out.println(niz[i] + " ");
      } 
    } else {
      System.out.println("Greska! Rezultat je u minusu, ili je nula.");
    }
  }
}