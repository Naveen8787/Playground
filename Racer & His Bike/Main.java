// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//Main class to control all other classes

class BasicInfoOfBike{
	private String model; 
	private Long mileage; 
	BasicInfoOfBike(String model,Long mileage){
		this.model =  model;
		this.mileage = mileage;
	}
	public void displayDetails() {
		System.out.println("Bike Details:");
		System.out.println("Bike model: "+this.model);
		System.out.println("Mileage: "+this.mileage+" km/l");
	}	
}
class AdvancedInfoOfBike extends BasicInfoOfBike{
	private String bikeOwnedBy; 
	private String color; 
	private String bikeNumber; 
	AdvancedInfoOfBike(String model,Long mileage,String bikeOwnedBy, String color, String bikeNumber){
		super(model,mileage);
		this.bikeOwnedBy = bikeOwnedBy;
		this.color = color;
		this.bikeNumber = bikeNumber;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Company name: "+this.bikeOwnedBy);
		System.out.println("Bike color: "+this.color);
		System.out.println("Bike Number: "+this.bikeNumber);
	}
}
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		 BufferedReader br =  
		     new BufferedReader(new InputStreamReader(System.in));
			 String model = br.readLine();
			 Long mileage = Long.parseLong(br.readLine());
			 String bikeOwnedBy = br.readLine();
			 String color= br.readLine();
			 String bikeNumber = br.readLine();
			 AdvancedInfoOfBike bike = new AdvancedInfoOfBike(model, mileage, bikeOwnedBy ,color,bikeNumber);
			 bike.displayDetails();
	}}