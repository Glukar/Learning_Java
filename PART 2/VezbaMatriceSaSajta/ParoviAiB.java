/*Napisati program koji ucitava prirodan broj n i dva niza A i B dimenzije n, i ispituje sve parove brojeva 
 (a, b) takve da je a element niza A, broj b element niza B, i da je broj a deljiv brojem b bez ostatka.*/

class ParoviAiB{
  public static void main(String[] args){
    
    System.out.println("Ucitajte prirodan broj n");
    int n = Svetovid.in.readInt();
    
    int[] A = new int[n];
    for(int i = 0; i < n; i++){
      Svetovid.out.println("Ucitajte element niza: ");
      A[i] = Svetovid.in.readInt();
    }
    
    int[] B = new int[n];
    for(int i = 0; i < n; i++){
      Svetovid.out.println("Ucitajte element niza: ");
      B[i] = Svetovid.in.readInt();
    }
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(A[i] % B[j] == 0){
          System.out.print("(" + A[i] + "," + B[j] + ") ");
        }
      }
    }
    
    
  }
}