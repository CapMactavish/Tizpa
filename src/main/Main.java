package main;

import direction.User;

public class Main {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		User ahmad = new User();
		System.out.println("welcome to this program\n");
		System.out.println("please enter you first name");
		//ahmad.setFirstName(scanner.next());
		System.out.println("please enter you last name");
		//ahmad.setLastName(scanner.next());
		ahmad.initateTravel();
		System.out.println("noowfcav\n");
		System.out.println(ahmad.Travel(0));
		
	}
	
	
}
