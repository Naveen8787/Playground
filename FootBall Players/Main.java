// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
//Main class to control all other classes

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class  FootballPlayer{
	
	void displayFootballPlayerDetails(String playerName, String goalKeeperName) {
		System.out.println("Main Player- "+playerName);
		System.out.println("GoalKeeper- "+goalKeeperName);
	}
	
	void displayFootballPlayerDetails(Long goals) {
		
		System.out.println("Number of goals scored in the match: "+goals);
	}
}

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br =  
		           new BufferedReader(new InputStreamReader(System.in));
			 int option = Integer.parseInt(br.readLine());
			 FootballPlayer player = new FootballPlayer();
			 
			 if(option == 1) {
				 
				 String pname = br.readLine();
				 String gname = br.readLine();
				 
				 System.out.println("Player details of the football:");
				 player.displayFootballPlayerDetails(pname,gname); 
			 }
			 else if(option == 2) {
				 
				 Long goal = Long.parseLong(br.readLine());
				 player.displayFootballPlayerDetails(goal);
				 
			 }
			 else {
				 System.out.println("Invalid Input");
			 }
	}
}
