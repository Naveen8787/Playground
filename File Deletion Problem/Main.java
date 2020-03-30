// import the respective packages
import java.io.File; 
import java.io.IOException;
import java.util.*;
public class Main{
  public static void main (String[] args) {
    //Try out your code here
     Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
	    // Get the file 
  		File file=new File(s);
        // Check if the specified file 
        // deletedted or not deleted
    	if(file.delete())
            System.out.println("File was deleted"); 
        else
            System.out.println("File was not deleted"); 
    }    
  }