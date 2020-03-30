// import the respective packages
import java.util.Scanner;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex.If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
class Friend{
  String name ,gender;
  int age;
  void setData(String name,String gender,int age){
    this.name = name;
    this.gender = gender;
    this.age = age;
  }
  boolean validateName(String name){
    return name.matches("[a-z A-Z]+");
  }
 boolean validateGender(String gender){
        if(gender.equals("Male") || gender.equals("Female"))
         return true;
       else  
         return false;
   }
  String getData(){
    if((validateName(name)==true) && (age > 0) && (validateGender(gender)==true))// && (validateGender(gender)==true))
    	return "Friends Details \nName: "+name+"\nGender: "+gender+"\nAge: "+age;
    else
      	return "Invalid Input";
  }
}
//Main class to control all other classes
class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Friend frnd = new Friend();
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String gender = sc.nextLine();
    int age = sc.nextInt();
	frnd.setData(name,gender,age);
	//frnd.setData("Aaron","Male",20);
    System.out.println(frnd.getData());
    sc.close();
  }
}

