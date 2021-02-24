class WrapperTest {
  public static void main(String[] args) {
    Integer pet = new Integer(5); // boxing
    int p = pet.intValue();       // unboxing
    int pedespet = Integer.parseInt("55");
    Character a = new Character('a');
    char c = a.charValue();
    System.out.println("Brojevi: " + pet + ", " + p + ", " + pedespet);
    System.out.println("Znak " + c + " " + (Character.isLetter(c) ? "JESTE" : "NIJE") + " slovo");
    System.out.println("Znak " + c + " " + (Character.isDigit(c) ? "JESTE" : "NIJE") + " cifra");
    System.out.println("Znak " + c + " " + (Character.isUpperCase(c) ? "JESTE" : "NIJE") + " veliko slovo");
    System.out.println("Znak " + c + " " + (Character.isLowerCase(c) ? "JESTE" : "NIJE") + " malo slovo");
  }
}