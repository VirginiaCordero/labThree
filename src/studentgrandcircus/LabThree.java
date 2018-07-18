package studentgrandcircus;

import java.util.Scanner;

public class LabThree { 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInteger;
		String userName;
		
		System.out.println("Hello Human, what is your name?");
		userName = scanner.next();
		System.out.println(userName + ", please enter a positive integer from 1 to 100.");
		userInteger = scanner.nextInt();
						
		if (userInteger > 100 || userInteger < 1) {
			System.out.println("that is not a valid number, " + userName + " please start over.");
		} else {				
			int remainderStorage = userInteger % 2;
			switch(remainderStorage) {
				case 1:
					if (userInteger < 60) { 
						System.out.println("Looks like " +userInteger + " is an odd number, " + userName + ".");
					} 
					else if ( userInteger > 60) {
						System.out.println(userName + ", this integer is odd and over 60.");	
					}
					break;					
				case 0:
					if (userInteger >= 2 && userInteger <= 25) { 
						System.out.println("Oh my " + userName + ", this is an even number and it's less than 25.");
					}
					else if (userInteger >= 26 && userInteger <= 60) {
						System.out.println(userName + ", looks like this is an even number.");
					}
					else if (userInteger > 60) {
						System.out.println("Well " + userName + ", looks like " + userInteger + " is an even number.");
					}
					break;
				default:
					System.out.println("Apparently this number wasn't in the provided parameters... mmm this is how the 'default works'");
			}
		}
		System.out.println("Thank you for participating, " + userName + ".");		
		scanner.close();
	}
}	