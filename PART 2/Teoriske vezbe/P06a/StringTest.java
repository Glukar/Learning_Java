class StringTest {
  public static void main(String[] args) {
    System.out.print("Unesite jedan string: ");
    String s1 = Svetovid.in.readLine();
    System.out.print("Unesite jos jedan: ");
    String s2 = Svetovid.in.readLine();    
    System.out.println("Duzine stringova su " + s1.length() + " i " + s2.length());
    System.out.println("Stringovi pocinju znacima " + s1.charAt(0) + " i " + s2.charAt(0));
    System.out.println("Stringovi " + (s1.equals(s2) ? "JESU" : "NISU") + " jednaki");
    System.out.println("Ako se zanemari velicina slova, stringovi " + (s1.equalsIgnoreCase(s2) ? "JESU" : "NISU") + " jednaki");
  }
}