/*Napisati program koji ucitava dva stringa i proverava da li su ti stringovi jednaki.Program ne treba da razlikuje velika i mala slova.*/

class ProveraStringova{
  public static void main(String[] args){
    
    System.out.println("Ucitajte prvi sting");
    String s1 = Svetovid.in.readLine();
    
    System.out.println("Ucitajte drugi sting");
    String s2 = Svetovid.in.readLine();
    
    if(s1.length() != s2.length()){
      System.out.println("Nisu jednaki!");
    }else{
      boolean okej = true;
      for(int i = 0; i < s1.length(); i++){
        if(Character.toLowerCase(s1.charAt(i)) != Character.toLowerCase(s2.charAt(i))){
          System.out.println("Nisu jednaki!");
          okej = false;
        } 
      }
      if (okej) {
        System.out.println("Stringovi jesu jednaki!");
      }
    }
    
  }
}