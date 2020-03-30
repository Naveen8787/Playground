import java.util.*;
class Main
 {
public static void main(String ar[])
{
Scanner sc =new Scanner(System.in);
  String str,word;
  int count=0;
  str = sc.nextLine();
  str = str.toLowerCase();
  word = sc.nextLine();
  word = word.toLowerCase();
  String st[] = str.split(" ");
  for(int i=0;i<st.length;i++){
  if(st[i].equals(word))
    count++;
  }
  System.out.println(count);
}
}