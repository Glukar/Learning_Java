class ZbirMatrica {
  public static void main(String[] args) {
    double[][] A = { {1.1, 2.2, 3.3, 4.1},                       
                           {0.4, -2.1, 1.9, 8.7},                      
                           {4.1, 2, 44, 23.2} };     
    double[][] B = { {7.3, 12, 33.2, 6.2},                      
                           {0.0, 3.1, 2.7, 9.3},                      
                           {13.1, 3.8, 4.4, 23.8} };
    double[] [] rez = new double[3] [4];
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        rez[i] [j] = A[i] [j] + B[i] [j];
      }
    }
        System.out.println("Zbir matrica je: ");
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 4; j++) {
            System.out.print(rez[i] [j] + "\t");
          }
          System.out.println();
        }
  }
}