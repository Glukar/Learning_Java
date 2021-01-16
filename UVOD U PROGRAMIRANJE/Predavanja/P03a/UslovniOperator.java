class UslovniOperator {
  public static void main(String[] args) {
    String status;
    int bodovi = 80;
    status = (bodovi > 50) ? "Polozio" : "Nije polozio";
    System.out.println(status);
    int i = 0;
    int j = 22;
    System.out.println((i < 10) ? "Manji od 10" : j++);
    System.out.println("j = " + j);    
  }
}