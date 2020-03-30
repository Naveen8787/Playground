// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//interface IPlayerStatistics is added
interface  IPlayerStatistics{
	public void displayPlayerStatistics();
}
//class player is declared implements interface
class Player implements  IPlayerStatistics{
	private String name; 
	private String teamName; 
	private Integer noOfMatches;
	private Long totalgoals;
  //constructor method is used along with setter methods
	Player(String name,String teamName,int noOfMatches,long totalgoals ){
		this.setName(name);
		this.setTeamName(teamName);
		this.setNoOfMatches(noOfMatches);
		this.setTotalgoals(totalgoals);		
	}
  //display method is used
	public void displayPlayerStatistics() {
		if(noOfMatches == 0 || totalgoals==0) {
			System.out.println("Invalid Input");
		}else {
		System.out.println("Player Details");
		System.out.println("Player name: "+name);
		System.out.println("Team name: "+teamName);
		System.out.println("No of matches: "+noOfMatches);
		System.out.println("Total goals: "+totalgoals);
		}
	}
  //getter methods are used
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public Long getTotalgoals() {
		return totalgoals;
	}
	public void setTotalgoals(Long totalgoals) {
		this.totalgoals = totalgoals;
	}	
}
//Main class to control all other classes
public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(r);
	    String n = br.readLine();
	    String name = n.trim();
	    String tm = br.readLine();	    
	    String nm = br.readLine();
	    int noOfm = Integer.parseInt(nm.trim()); 
	    String tg = br.readLine();
	    long tgoal = Long.parseLong(tg.trim());
	    Player pl = new Player(name,tm,noOfm,tgoal);
	    pl.setName(name);
	    pl.setTeamName(tm);
	    pl.setNoOfMatches(noOfm);
	    pl.setTotalgoals(tgoal); 
	    pl.displayPlayerStatistics();
	}
}
