// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
//create abstract class LibraryCard
abstract class  LibraryCard{
	private String name;
	private String card_number;
	private String expiry_date;
  //create constructor method
  //setters methods are created
  //getters methods are created
LibraryCard (String name,String card_number, String expiry_date) {
	this.setName(name);
	this.setCard_number(card_number);
	this.setExpiry_date(expiry_date);
	}
	public String getExpiry_date() {
	return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
	this.expiry_date = expiry_date;
	}
	public String getCard_number() {
	return card_number;
	}
	public void setCard_number(String card_number) {
	this.card_number = card_number;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
}
//create class MembershipCard which extends to abstract class LibraryCard
class  MembershipCard extends LibraryCard{
	private int minimumBookToBorrow;
   //create constructor method
  //setters methods are created
  //getters methods are created
	MembershipCard(String name,String cardNumber,String expiryDate,int minimumBookToBorrow){
		super(name,cardNumber, expiryDate);
		this.setMinimumBookToBorrow(minimumBookToBorrow);
	}
	public int getMinimumBookToBorrow() {
		return minimumBookToBorrow;
	}
	public void setMinimumBookToBorrow(int minimumBookToBorrow) {
		this.minimumBookToBorrow = minimumBookToBorrow;
	}
}
//create LifeLongMembershipCard which extends abstract class LibraryCard
class  LifeLongMembershipCard extends LibraryCard{
	private int minimumBookToBorrow;
//create constructor method
//setters methods are created
//getters methods are created
	LifeLongMembershipCard(String name, String card_number, String expiry_date,int minimumBookToBorrow) {
		super(name, card_number, expiry_date);
		this.setMinimumBookToBorrow(minimumBookToBorrow);
	}
	public int getMinimumBookToBorrow() {
		return minimumBookToBorrow;
	}
	public void setMinimumBookToBorrow(int minimumBookToBorrow) {
		this.minimumBookToBorrow = minimumBookToBorrow;
	}
}
//Main class to control all other classes
public class Main{
    //throws exceptions 
	public static void main(String[] args) throws IOException {
		 InputStreamReader r=new InputStreamReader(System.in);
		    BufferedReader br=new BufferedReader(r);
		  //option
		  String n = br.readLine();
		  int n1 = Integer.parseInt(n.trim());
             if(n1 == 1) {
            	 // members detail
            	 String mdetails = br.readLine();
            	 // spliting string
            	 String name = "";
        		 String cardNumber = "";
        		 String ddate = "";
            	 String [] arr = mdetails.split("\\|");
            		  name = arr[0].trim();
            		  cardNumber = arr[1].trim();
            		  ddate = arr[2].trim();
      		 //no of books to borrow
       		 String b = br.readLine();
       		 int b1 = Integer.parseInt(b.trim());
       		 //create object
       		 MembershipCard mc = new MembershipCard(name, cardNumber,ddate,b1);
       		 mc.setName(name);
       		 mc.setCard_number(cardNumber);
       		 mc.setExpiry_date(ddate);
       		 mc.setMinimumBookToBorrow(b1);
       		System.out.println(mc.getName()+" 's Membership Card Details");
       		System.out.println("Card Number  "+mc.getCard_number());
       		System.out.println("Minimum books to borrow "+mc.getMinimumBookToBorrow());
       		System.out.println("Due date to return the book: unlimited"); 
             }
             else if(n1 == 2) { 
            	//members detail
            	 String mdetails = br.readLine();
            	//spliting string
            	 String name = "";
        		 String cardNumber = "";
        		 String ddate = "";
            	 String [] arr = mdetails.split("\\|");           	 
            		  name = arr[0].trim();
            		  cardNumber = arr[1].trim();
            		  ddate = arr[2].trim();           	 
            	//no of books to borrow
            	 String mbs = br.readLine();
       		  	 int mb = Integer.parseInt(mbs.trim());     		    
       		 LifeLongMembershipCard mcl = new LifeLongMembershipCard(name, cardNumber,ddate,mb);
       		 mcl.setName(name);
       		 mcl.setCard_number(cardNumber);
       		 mcl.setExpiry_date(ddate);
       		 mcl.setMinimumBookToBorrow(mb);     		 
       		System.out.println(mcl.getName()+" 's Membership Card Details");
       		System.out.println("Card Number  "+mcl.getCard_number());
       		System.out.println("Minimum books to borrow "+mcl.getMinimumBookToBorrow());
       		System.out.println("Due date to return the book: 10 days from the book taken"); 
             }
             else {
            	 System.out.println("Invalid Input");
             }
	}
}