//respective packages are imported
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
class One extends Exception
{
    One(String message)
    {   
        System.out.println(message);       
    }
}
//main class controls all other classes
public class Main{
	public static int fact(int i)
	 {
	  int result=1;
	  for(;i>0;i--) 
	  {
	   result=result*i;
	   }
	  return result;
	  }
      public static void main(String[] args)throws Exception {
	   InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
	    int i = Integer.parseInt(br.readLine().trim());   
	    try {	    	
	   	        if(i < 0) {	      
	                   throw new One("Invalid Input");
	                 }else {
	                	 int result = fact(i);
	                	 System.out.println(result);
	                 }
	    	}
	   catch(One e)
	    	{
	    	} 
	  }
}