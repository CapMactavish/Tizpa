package direction;

import havenoidea.Bike;
import havenoidea.Economical;
import havenoidea.TranspherService;
import havenoidea.VIP;

import java.util.Scanner;


public class User {
	Scanner scan = new Scanner(System.in);
	private static int iter = 1;//for generating user ID
	private static int tIter = 0;//for generating travels
	
	private int lastTrip = 0;
	private String FirstName;
	private String LastName;
	private long ID = 13980900;
	
	TranspherService[] owd = new TranspherService[10];
	
	public void initateTravel() {
		int option = 0;
		System.out.println("what kind of service do you wanna use?\n1-Economical\n2-VIP\n3-Bike\n");
		option = scan.nextInt();
		switch (option) {
			case 1:
				owd[tIter] = new Economical();
				break;
			case 2:
				owd[tIter] = new VIP();
				break;
			case 3:
				owd[tIter] = new Bike();
				break;
				
			default:
				System.out.println("come on!!!");
				break;
		} 
		lastTrip = tIter;
		tIter++;
	}
	public double Travel() {
		int  home = 0, destination = 0,P =0;
		double time = 0,FP = 0;
		boolean r = false;
		System.out.println("now tell me where are you:");
		home = scan.nextInt();
		System.out.println("where do you wanna go?");
		destination = scan.nextInt();
		System.out.println("what time is it?");
		time = scan.nextDouble();
		System.out.println("is it raining?");
		r = scan.nextBoolean();
		
		P = owd[lastTrip].area.outPrice(home, destination);
		FP = owd[lastTrip].getöDecision(time, r);
		
		System.out.print("you have to pay:\t");
		return FP *P;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public User() {
		this.setID(this.getID() + iter);
		iter++;
	}
	public User(String firstName,String lastName) {
		super();
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
}

