class RelacioniOperatori {
  public static void main(String[] args) {
    int i = 37;
    int j = 42;
    int k = 42;
    System.out.println("Vrednosti promenljivih:");
    System.out.println("    i = " + i);
    System.out.println("    j = " + j);
    System.out.println("    k = " + k);
    // Vece
    System.out.println("Vece:");
    System.out.println("    i > j = " + (i > j)); // false
    System.out.println("    j > i = " + (j > i)); // true
    System.out.println("    k > j = " + (k > j)); // false
    // Vece ili jednako
    System.out.println("Vece ili jednako:");
    System.out.println("    i >= j = " + (i >= j)); // false
    System.out.println("    j >= i = " + (j >= i)); // true
    System.out.println("    k >= j = " + (k >= j)); // true
    // Manje
    System.out.println("Manje:");
    System.out.println("    i < j = " + (i < j)); // true
    System.out.println("    j < i = " + (j < i)); // false
    System.out.println("    k < j = " + (k < j)); // false
    // Manje ili jednako
    System.out.println("Manje ili jednako:");
    System.out.println("    i <= j = " + (i <= j)); // true
    System.out.println("    j <= i = " + (j <= i)); // false
    System.out.println("    k <= j = " + (k <= j)); // true  
    // Jednako
    System.out.println("Jednako:");
    System.out.println("    i == j = " + (i == j)); // false
    System.out.println("    k == j = " + (k == j)); // true  
    // Nejednako
    System.out.println("Nejednako:");
    System.out.println("    i != j = " + (i != j)); // true
    System.out.println("    k != j = " + (k != j)); // false
  }
}