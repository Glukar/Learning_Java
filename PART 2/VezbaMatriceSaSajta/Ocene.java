/* Program koji ucitava tabelu ocena studenata po predmetima, i racuna za
 svakog studenta prosecnu ocenu na polozenim ispitima, a za svaki predmet 
 broj studenata koji su polozili ispit, kao i prolaznost na ispitu (u %). */

class Ocene{
  public static void main(String[] args){
    int brS,brP;
    
    System.out.print("Unesite broj studenata: ");
    brS = Svetovid.in.readInt();
    System.out.print("Unesite broj predmeta: ");
    brP = Svetovid.in.readInt();
    
    int[][] A = new int[brS][brP];
    
    for (int i = 0; i < brS; i++) {
      System.out.println("\n== Ocene za studenta broj " + (i + 1) + ":");
      for (int j = 0; j < brP; j++) {
        System.out.print("Unesite ocenu za predmet broj " + (j + 1) + ": ");
        A[i][j] = Svetovid.in.readInt();
      }
    }
    
    brS = A.length;
    brP = A[0].length;
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
      if (brPolozenih > 0)
        System.out.println((double)suma / brPolozenih);
      else
        System.out.println(0.0);
    }
    
    brS = A.length;
    brP = A[0].length;
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
} 




