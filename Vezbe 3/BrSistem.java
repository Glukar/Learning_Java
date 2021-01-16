/*Napisati program koji ucitava broj predstavljen u binarnom sistemu sa osnovom m (2 <= m <= 10), i stampa ga u dekardnom brojnom sistemu*/
import java.util.*;
class BrSistem{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int m=0;
    do{
      m = input.nextInt("Unesite brojni sistem:");
    }while(m<2 && m>10);
    
    int a=0;
    boolean provera=true;
    
    do{
      a=Svetovid.in.readInt("Unesite broj u brojnom sistemu sa osnovom "+m+":");
      int temp=a;
      provera=true;
      
      while(temp!=0 && provera==true){
        int cifra=temp%10;
        temp/=10;
        if(cifra>=m){
          System.out.println("Broj koji ste uneli ne pripada br. sistemu sa osnovom "+m);
          provera=false;
        }
      }
    }while(provera==false);
  
    int stepen=0;
    int sum=0;
    while(a!=0){
      
      int cifra=a%10;
      a/=10;    
      int cinioc=1; 
      
      for(int i=0;i<stepen;i++){
        cinioc*=m;
      }
      
      sum+=cifra*cinioc;
      stepen++;
    }
    System.out.print(sum);
    
  }
}
    
