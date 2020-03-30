// import the respective packages
import java.util.*;
public class Main{
  //pascal triangle method is 
    static void PascalTriangle(int n)
    {
   
    for (int line = 0; line < n; line++)
    { 
        for (int i = 0; i <= line; i++)         
       	System.out.print(find(line, i)+" ");                                   
      	System.out.println();     }     }           
  		static int find(int n, int j)     
        {         
        int result = 1;                   
        if (j > n - j)
        j = n - j;       
        for (int i = 0; i < j; ++i)
        {
            result =result* (n - i);
            result=result/(i + 1);
        }
        return result;
    }
      
    public static void main(String args[])
    {
    int n;
    Scanner sc= new Scanner(System.in);
    //Entering Number of rows
    n=sc.nextInt();
      if(n>0){
    PascalTriangle(n);
    }
      else{
      System.out.println("Invalid Input");}
}
}
