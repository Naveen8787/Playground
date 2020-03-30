// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//created interface for displaying Player statistics
interface  IPlayerStatistics{
	public void displayPlayerStatistics();
}
//created abstract class which implements interface
abstract class Player implements  IPlayerStatistics{
	private String name; 
	private String teamName; 
	private Integer noOfMatches;
  //constructors method created
  //setters methods are created
	Player(String name,String teamName,int noOfMatches){
		this.setName(name);
		this.setTeamName(teamName);
		this.setNoOfMatches(noOfMatches);		
	}
  //getters methods are created
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
	public void displayPlayerStatistics() {
		if(noOfMatches == 0 ) {
			System.out.println("Invalid Input");
		}else {
		System.out.println("Player Details");
		System.out.println("Player name: "+name);
		System.out.println("Team name: "+teamName);
		System.out.println("No of matches: "+noOfMatches);
		}
	}
}
//created class CricketPlayer which extends above abstract class Player 
class CricketPlayer  extends Player{
	private int totalRunsScored;
	private int no0fWicketsTaken;
  //created Constructor method
  //setters methods are created
	CricketPlayer(String name,String teamName,int noOfMatches,int totalRunsScored,int no0fWicketsTaken){
		super( name, teamName, noOfMatches);
		this.setTotalRunsScored(totalRunsScored);
		this.setNo0fWicketsTaken(no0fWicketsTaken);	
	}
  //getters methods are created
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNo0fWicketsTaken() {
		return no0fWicketsTaken;
	}
	public void setNo0fWicketsTaken(int no0fWicketsTaken) {
		this.no0fWicketsTaken = no0fWicketsTaken;
	}
	public void displayPlayerStatistics() {
		if(getNoOfMatches() == 0 ) {
			System.out.println("Invalid Input");
		}else {
		System.out.println("Player Details");
		System.out.println("Player name: "+getName());
		System.out.println("Team name: "+getTeamName());
		System.out.println("No of matches played: "+getNoOfMatches());
		System.out.println("Total runs scored: "+getTotalRunsScored());
		System.out.println("No of wickets taken: "+getNo0fWicketsTaken());
		}
	}	
}
//created class FootballPlayer which extends Abstract class Player
class  FootballPlayer extends Player{
	private int noOfGoals;
  //created constructor method
  //setters methods are created
	FootballPlayer(String name,String teamName,int noOfMatches,int noOfGoals){
		super( name, teamName, noOfMatches);
		this.setNoOfGoals(noOfGoals);	
		}
  //getters methods are created
	public int getNoOfGoals() {
		return noOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}
	public void displayPlayerStatistics() {
		if(getNoOfMatches() == 0 ) {
			System.out.println("Invalid Input");
		}else {
		System.out.println("Player Details");
		System.out.println("Player name: "+getName());
		System.out.println("Team name: "+getTeamName());
		System.out.println("No of matches played: "+getNoOfMatches());
		System.out.println("Total goals scored: "+getNoOfGoals());
		}
	}
}

//Main class to control all other classes
public class Main{
  public static void main(String[] args) throws Exception {
    //Try out your code here!...
    	InputStreamReader r=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(r);
	    int option = Integer.parseInt(br.readLine().trim()); 
	    if(option == 1) {
	    	String n = br.readLine().trim();
		    String tm = br.readLine().trim();	    		    
		    int noOfm = Integer.parseInt(br.readLine().trim());		    
		    int totalRun = Integer.parseInt(br.readLine().trim());		    
		    int wkts = Integer.parseInt(br.readLine().trim());
		    CricketPlayer cp = new CricketPlayer(n,tm,noOfm,totalRun,wkts);
		    cp.setName(n);
		    cp.setTeamName(tm);
		    cp.setNoOfMatches(noOfm);
		    cp.setNo0fWicketsTaken(wkts);
		    cp.displayPlayerStatistics();	
	    	}	    
	    else if(option == 2) {
	    	String n = br.readLine().trim(); 
		    String tm = br.readLine().trim();	    		    
		    int noOfm = Integer.parseInt(br.readLine().trim());		    
		    int nogoals = Integer.parseInt(br.readLine().trim());		    
		    FootballPlayer fp = new FootballPlayer(n,tm,noOfm,nogoals);
		    fp.setName(n);
		    fp.setTeamName(tm);
		    fp.setNoOfMatches(noOfm);
		    fp.setNoOfGoals(nogoals); 
		    fp.displayPlayerStatistics();	
	    }	
	    else {
	    	System.out.println("Invalid Input");
	    }
  }
}