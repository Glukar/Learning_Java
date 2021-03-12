import java.util.Scanner;
class OceneS {
  static int[][] ucitaj (int brS, int brP) {
    Scanner input = new Scanner(System.in);
    int[][] A = new int[brS][brP];
    for (int i = 0; i < brS; i++) {
      System.out.println("\n== Ocene za studenta broj " + (i + 1) + ":");
      for (int j = 0; j < brP; j++) {
        System.out.print("Unestie ocenu za predmet broj " + (j + 1) + ": ");
        A[i][j] = input.nextInt();
      }
    }
    return A;
  }
  static void prosecneOcene(int[][] A) {
    int brS = A.length;
    int brP = A[0].length;
    System.out.println("\n== Prosecne ocene studenata ==");
    for (int i = 0; i < brS; i++) {
      int suma = 0;
      int brPolozenih = 0;
      for (int j = 0; j < brP; j++) {
        if (A[i][j] > 5) {
          suma = suma + A[i][j];
          brPolozenih++;
        }
      }
      System.out.print("Prosek za studenta broj " + (i + 1) + " je: ");
      if (brPolozenih > 0) {
        System.out.println((double)suma / brPolozenih);
      } else {
        System.out.println(0.0);
      }
    }
  }
  static void prolaznostIspita(int[][] A) {
    int brS = A.length;
    int brP = A[0].length;
    System.out.println("\n== Prolaznost studenata po predmetima ==");
    for (int j = 0; j < brP; j++) {
      int brPolozenih = 0;
      for (int i = 0; i < brS; i++) {
        if (A[i][j] > 5) {
          brPolozenih++;
        }
      }
      System.out.print("Broj studenata koji su polozili predmet broj ");
      System.out.print((j + 1) + " je " + brPolozenih + ", a prolaznost ");
      System.out.println((brPolozenih * 100.0 / brS) + "%");
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Unesite broj studenta: ");
    int brS = input.nextInt();
    System.out.print("Unesite broj predmeta: ");
    int brP = input.nextInt();
    
    int[][] ocene = ucitaj(brS, brP);
    prosecneOcene(ocene);
    prolaznostIspita(ocene);
  }
}