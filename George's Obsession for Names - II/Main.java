// import the respective packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
  public static void main (String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		int n=str.length();
    if(n%2==0){
   	  int mid=n/2-1;
      int mid1=mid+2;
      String First=str.substring(0,1);
      String Last=str.substring(n-1);
      String name=str.substring(mid,mid1);
      String name1=First+name+Last;
      System.out.println(name1);
    }
    else{
      int mid=n/2;
      int mid1=mid+1;
      String First=str.substring(0,1);
      String Last=str.substring(n-1);
      String name=str.substring(mid,mid1);
      String name1=First+name+Last;
      System.out.println(name1);
    }
  }
}