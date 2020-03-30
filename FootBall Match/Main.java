// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class FootballMatch{
	
	 void displayFootballMatchDate(String matchDate) throws ParseException {
		 
		 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		 Date date = format.parse(matchDate);
//		 System.out.println(date);
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		 String strDate= formatter.format(date);
		 System.out.println("Match Date: "+strDate);
		 
	 }
	 
	 void displayFootballMatchDetails(String venue) {
		 
		 System.out.println("Match Venue:");
		 String[] words=venue.split(",");
		 String st = "";
		 String cn = "";
		 for(int i = 0;i<words.length-1;i++){  
			  st = words[i];
			  cn = words[i+1];
			break;
			 }  
		
		 System.out.println("Stadium: "+st);
		 System.out.println("Country:"+cn);
		 
	 }
	 
	 void displayFootballMatchDetails(String winnerTeam, long goals) {
		 
		 System.out.println("Match Outcome: "+winnerTeam+" won by "+goals+" goals");
	 
	 }
	
}

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		
		 BufferedReader br =  
		           new BufferedReader(new InputStreamReader(System.in));
			 int option = Integer.parseInt(br.readLine());
			 
			 FootballMatch match = new FootballMatch();
	
			 if(option == 1) {
				 
				 String date1 = br.readLine();
				 match.displayFootballMatchDate(date1);
				 
			 }else if(option == 2) {
				 
				 String venue = br.readLine();
				 match.displayFootballMatchDetails(venue);
				 
			 }else if(option == 3) {
				 
				 String winnerTeam = br.readLine();
				 Long goals = Long.parseLong(br.readLine());
				 match.displayFootballMatchDetails(winnerTeam, goals);
				 
			 }else{
                System.out.println("Invalid Input");
             }
	}
}