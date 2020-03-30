//import the respective packages
import java.util.Scanner;
//declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
class Dog{
String name ,color,breed;
int age;
double weight;
void setData(String name,double weight,int age,String color,String breed){
this.name = name;
this.weight = weight;
this.age = age;
this.color = color;
this.breed = breed;
}
boolean validateName(String name){
return name.matches("[a-z A-Z]+");
//return name.matches("[a-z A-Z]+");
}
void getData(){
if((validateName(name)==true) && (age > 0)&& (weight > 0))// && (validateGender(name)==true))
{System.out.println("Name of the dog: "+name);
  System.out.println("Weight of the dog: "+weight);
  System.out.println("Age of the dog: "+age);
  System.out.println("Color of the dog: "+color);
  System.out.println("Breed of the dog: "+breed);}
else{
 	System.out.println("Invalid Input");
}
}
}
//Main class to control all other classes
public class Main{
public static void main(String[] args){
//Try out your code here!...
Dog obj = new Dog();
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
double weight = sc.nextDouble();
int age = sc.nextInt();
sc.nextLine();
String color = sc.nextLine();
String breed = sc.nextLine();
//System.out.println(name+","+weight+","+age+","+color+","+breed);
obj.setData(name,weight,age,color,breed);
obj.getData();
sc.close();
}
}
