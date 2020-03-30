// import the respective packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
  public static void main (String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		String[] str1 = str.split("");
		for(int i=1;i<str1.length;i++) {
			System.out.println(str1[i].toUpperCase().trim());
		}
    
  }
}