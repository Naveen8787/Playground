// import the respective packages
import java.io.File; 
import java.util.*;
public class Main{
  public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
    	String t=sc.nextLine();
        File oldName = 
         new File(s); 
        File newName =  
         new File(t); 
  
        if (oldName.renameTo(newName))  
            System.out.println("Renamed successfully");         
        else 
            System.out.println("error");         
    } 
} 
