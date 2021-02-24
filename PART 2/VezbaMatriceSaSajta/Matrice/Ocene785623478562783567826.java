/*Program koji ucitava tabelu ocena studenata po predmetima, i racuna za
   svakog studenta prosecnu ocenu na polozenim ispitima, a za svaki predmet 
   broj studenata koji su polozili ispit, kao i prolaznost na ispitu (u %). */

class Ocene785623478562783567826{
  public static void main(String[] args){
    int brS, brP, i, j;
    
    System.out.println("Ucitajte broj studenata");
    brS = Svetovid.in.readInt();
    System.out.println("Ucitajte broj predmeta");
    brP = Svetovid.in.readInt();
    
    int[][] mat = new int[brS][brP];
    
    //Ucitavanje Ocena
    for(i = 0; i < brS; i++){
      for(j = 0; j < brP; j++){
        System.out.println("Ucitajte ocenu za " + (j + 1) + ". predmet" + (i +1) + ". studenta =");
        mat[i][j] = Svetovid.in.readInt();
      }
    }
    
    for(i = 0; i < brS; i++){
      int brPolozenih = 0;
      int suma = 0;
      int brPr = 0;
      for(j = 0; j < brP; j++){
        if(mat[i][j] > 5){
          suma += mat[i][j];
          brPolozenih++;
        }
        if(mat[j][i] > 5){
          brPr++;
        }
      }
      System.out.println("Prosecna ocena " + (i + 1)+ ". studenta je: " + (double)suma / brPolozenih);
      System.out.println("Broj studenat koji su polozili " + (i + 1) + ". predmet je : " + brPr + " i prozalnos ovog predmeta je: " + brPr * 100 / brP + "%");
    }
     
  }
}