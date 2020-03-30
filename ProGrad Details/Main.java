// import the respective packages
	// declare the class/classes mentioned in the above statements by using default access modifiers
	//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
	import java.util.*;
	//Main class to control all other classes
	class ProGrad{
	    //Try out your code here!...
	    String name;
	    long number;
	    String skills;
	   public void setData(String name,long number,String skills){
		   this.name = name;
	       this.number = number;
	       this.skills = skills;
	    }
	    boolean validateName(String name)
	    {
       return name.matches("[a-z A-Z]+");
       //return name.matches("[a-z A-Z]+");
       }
       void getData(){
       if((validateName(name)==true) && (number>0))
       {
	      	System.out.println("ProGrad Details");
		    System.out.println("ProGrad Name: "+name); 
	    	System.out.println("Id: "+number);
		    System.out.println("Skill: "+skills);
	   		}
	    else{
	      	 System.out.println("Invalid Input");
	         }
	    }
	}
public class Main{
public static void main(String[] args){
//Try out your code here!...
ProGrad obj = new ProGrad();
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
long number = sc.nextLong();
sc.nextLine();
String skills = sc.nextLine();
obj.setData(name,number,skills);
obj.getData();
sc.close();
}
}

