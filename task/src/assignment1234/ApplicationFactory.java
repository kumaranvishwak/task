package assignment1234;

import java.util.Scanner;

public class ApplicationFactory {

	public void fetchApplication(int a) {
		String[] app = { "springboot", "Microsoft Teams", "Eclipse","Webex","MongoDB" };
		applicationDetails(a);
	}

	public static void applicationDetails(int a) {
		String[] app1 = { "Spring Boot is an open source Java-based framework used to create a micro Service.",
				"Microsoft Teams is a collaboration app that helps your team stay organized and have conversations—all in one place.",
				"Eclipse is an integrated development environment used in computer programming. It contains a base workspace and an extensible plug-in system for customizing the environment."
				,"Connecting people on one place"
				,"a NoSql database"};

		
				System.out.println(app1[a]);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
char exit;
		do {
			System.out.println("Select an option:\n1.springboot\n2.Outlook\n3.Eclipse\n4.Webex\n5.MongoDB");
			int option = sc.nextInt();
			ApplicationFactory af = new ApplicationFactory();
			 af.fetchApplication(--option);
			
			System.out.println("you need to get another application details Y/N--");
			exit=sc.next().charAt(0);
		} while (exit=='y'||exit=='Y');
		//System.out.println("!!END!!");
		sc.close();
	}

}
