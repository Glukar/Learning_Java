/*Program koji ucitava tabelu ocena studenata po predmetima, i racuna za
 svakog studenta prosecnu ocenu na polozenim ispitima, a za svaki predmet 
 broj studenata koji su polozili ispit, kao i prolaznost na ispitu (u %).*/

class Ocene123145151{
  public static void main(String[] args){
    int brS, brP, i, j;
    
    System.out.println("Unesite broj studenata");
    brS = Svetovid.in.readInt();
    System.out.println("Unesite broj predmeta");
    brP = Svetovid.in.readInt();
    
    int[][] ocene = new int[brS][brP];
    
    //Unos ocena po studentu
    for(i = 0; i < brS; i++){
      System.out.println("Ocene studenta " + (i + 1) + ". ");
      for(j = 0; j < brP; j++){
        System.out.println("Unesite ocene predmeta " + (j + 1) + ". ");
        ocene[i][j] = Svetovid.in.readInt();
      }
    }
    
    //Za prosek ocena polozenih predmeta
    for(i = 0; i < brS; i++){
      int prosekOcena = 0;
      int brProzanih = 0;
      for(j = 0; j < brP; j++){
        if(ocene[i][j] > 5){
          prosekOcena = prosekOcena + ocene[i][j];
          brProzanih++;
        }
      }
      System.out.println("Prosek ocena za " + (i + 1) + ". studenta je : " + ((double)prosekOcena / brProzanih));
    }
    
    //Za broj polozenih predmeta po studentu
    for(j = 0; j < brP; j++){
      int brProzanihP = 0;
      for(i = 0; i < brS; i++){
        if(ocene[i][j] > 5){
          brProzanihP++;
        }
      }
      System.out.print("Broj studenata koji su polozili predmet broj " + (j + 1) +". je: " + brProzanihP);
      System.out.print(" prosecnos prolaza tog predmeta je: " + brProzanihP * 100.0 / brS + "%");
      System.out.println();
    }
  
    
  }
}