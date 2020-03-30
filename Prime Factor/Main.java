// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
      int number;
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
     if(number>0) {
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.print(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
   }
    else{
    System.out.println("Invalid Input");
    }
}
}