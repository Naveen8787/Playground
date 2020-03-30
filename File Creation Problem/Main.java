// import the respective packages
import java.io.File; 
import java.io.IOException;
import java.util.*;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    try{
    Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
	    // Get the file 
  		File file=new File(s);
        // Check if the specified file 
        // created or already created
    	if(file.createNewFile()){
            System.out.println("File created"); 
        }else
            System.out.println("File already exists"); 
    }
    catch(IOException e){
    System.out.println("error");} 
  }
}
