import java.util.Scanner;

public class TeamMenuApp {

	static Scanner s = new Scanner(System.in);     // this allows user input
	static int addingIndex = 0;                    // for add teamMember this will allow us to keep track of where are in the array as far as adding is concerned 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a team array 
		// add team member
		// view team member 
		// view all team members
		// Delete team member by position
		// Delete all team members 
		
		String[] team = new String[5];
		int decision = 0;							// allows the 1,2,3,4,5 decision input
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if (decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option.");
			} else if (decision == 1) {
				showTeam(team);
			} else if (decision == 2) {
				showTeamMember(team);
			} else if (decision == 3) {
				addTeamMember(team);
			} else if (decision == 4) { 
				deleteTeamMember(team);
			} else {
				deleteAllTeamMembers(team);
			}

		}
		
		
		
	}
	
	public static void deleteAllTeamMembers(String[] team) {
		for (int i = 0; i < team.length; i++) {
			team[i] = null;
		}
	}
	
	
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		if(isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}
	}
	
	
	public static void showTeam(String[] team) {
		System.out.println("Team: ");
		for (int i = 0; i < team.length; i++) {         // creates a loop to show all the members 
			System.out.println(i + ": " + team[i]);
		}
	}
	
	public static void showTeamMember(String[] team) {
		System.out.print("Which team member would you like to see? ");      // prompt to input number 
		int teamNumber = s.nextInt();                                        // user inputs number of member they want 
		if (isValid(teamNumber)) {                            // using a loop, because if we do not, and 
			System.out.println(teamNumber + ": " + team[teamNumber]);       // out of bounds number, application will crash 
		} 
		
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();                                 // user inputs new member 
		if (isValid(addingIndex)) {					
			team[addingIndex++] = newMember;				// if we just have team[addingIndex] = newMember; it will keep adding member at position 0, so we add ++ to increment i
		}
		                            
	}
	
	
	public static boolean isValid(int input) {              // adding a method that we can refer too across
		if (input >= 0 && input < 5) {                            // the board if we dont have a valid input 
			return true;
		} else {
			System.out.println("Invalid entry.");            // as we have added this line, we don't need else blocks on out if codes 
			return false;
		}
	}
	
	
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Member");
	}

}
