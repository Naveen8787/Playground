// import the respective packages
import java.util.*;
public class Main{
public static void main(String args[]) { 
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number % 9 == 1)
            System.out.println(number +" is a Magic Number.");          
        else
            System.out.println(number +" is not a Magic Number."); 
    }
}