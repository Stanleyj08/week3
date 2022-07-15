package pracitce;

import java.util.Scanner;

public class calmjs {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] team = new String[5];
		
		int decision = 0;
		
		while (decision != -1)	{
			showMenu();
			decision = s.nextInt();
			if (decision < -1 || decision > 5)	{
				System.out.println("please pick a valid option.");
			}	else if (decision == 1)	{
				showTeam(team);
			}	else if (decision == 2)	{
				showTeamMember(team);
			}	else if (decision == 3)	{
				addTeamMember(team);
			}	else if (decision == 4)	{
				//deleteTeamMember(team);
			}	else 	{
				//deleteAllteamMembers(team);
			}
		}
	}
	private static void showTeam(String[] team) {
		// TODO Auto-generated method stub
		System.out.println("team:");
		for (int i =0; i < team.length; i++) {
			System.out.println(i + ":" + team[i]);
		}
	}
		public static void showTeamMember(String[] team)	{
			System.out.println("which team member would you like to see?");
			int teamNumber = s.nextInt();
			if (teamNumber >= 0 && teamNumber < 5)	{
			System.out.println(teamNumber + ":" + team[teamNumber]);
		}	else {
			System.out.println("Invalid entry.");
		}
		}
		public static void addTeamMember (String[] team)	{
			System.out.print("enter new member name:");
			String newMember = s.next();
			
			team[addingIndex++]	= newMember;
			
		}
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) delete All Team Memebers");
	}
}
