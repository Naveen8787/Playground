// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes
import java.util.Scanner;
class Laptop{
String brandName;
  String processorName;
  String os;
  int processorRange;
  int ram;
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Laptop lp = new Laptop();
    lp.brandName = sc.nextLine();
    lp.processorName = sc.nextLine();
    lp.os = sc.nextLine();
    lp.processorRange = sc.nextInt();
    lp.ram = sc.nextInt();
    if(lp.processorRange>0 && lp.ram>0)
    {
      System.out.println("Laptop Details");
      System.out.println("Laptop Brand: "+ lp.brandName);
      System.out.println("Processor Name: "+lp.processorName);
      System.out.println("OS: "+lp.os);
      System.out.println("Processor Range: "+lp.processorRange+" bit");
        System.out.println("Ram: "+lp.ram+" GB");
    }
    else{
    System.out.print("Invalid Input");
    }
    
    
  }
}