// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
//Main class to control all other classes
public class Main{
  public static void Encoding(String str) 
    { 
        int n = str.length(); 
        for (int i = 0; i < n; i++) { 
            // Count occurrences of current character 
            int count = 1; 
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) { 
                count++; 
                i++; 
            } 
            // Print character and its count
          if(count>1){
           System.out.print(count); 
           System.out.print(str.charAt(i)); 
          }
          else{
             System.out.print(str.charAt(i)); 
          }
        } 
    } 
  
    public static void main(String[] args) 
    { 
      Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        Encoding(str); 
    } 
} 
