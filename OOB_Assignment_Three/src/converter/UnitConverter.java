package converter;

import java.util.Scanner;
import unitCreation.Unit;

public class UnitConverter {

	public static void main(String[] args) {
		
		int x = 0;
		// Keeps track of which conversion type is asked for
		
		double scalar = 0;
		//How many of the unit will be converted
		
		Scanner in = new Scanner(System.in);
		//Sets up input stream
		
		while(x != 9) {
			System.out.println("Welcome to the unit converter!\n");
			System.out.println("If you would like to convert from Miles to Kilometers enter: 1");
			System.out.println("If you would like to convert from Kilometers to Miles enter: 2");
			System.out.println("If you would like to convert from Pounds to Kilograms enter: 3");
			System.out.println("If you would like to convert from Kilograms to Pounds enter: 4");
			System.out.println("If you would like to convert from Inches to Centimeters enter: 5");
			System.out.println("If you would like to convert from Centimeters to Inches enter: 6");
			System.out.println("If you would like to convert from Ounces to Milliliters enter: 7");
			System.out.println("If you would like to convert from Millileters to Ounces enter: 8");
			System.out.println("If you would like to exit enter: 9");
			x = in.nextInt();
			//Determines which conversion the user wants
			
			if(x > 9 || x < 1) {
				System.out.println("\nYou have entered an invalid number\n");
				continue;
			}
			//Checks to ensure that the user inputed a valid number
			
			if(x == 9) {
				break;
			}
			//Ends the loop if the user instructs
			
			System.out.println("\nEnter how many of the unit you would like to convert: ");
			scalar = in.nextDouble();
			//Determines how many of the unit that the user would like to convert
			
			if(scalar < 0) {
				scalar = scalar * -1;
			}
			//If the input is negative it is converted to a positive
			
			Unit unit = new Unit(x, scalar);
			//Creates an object Unit with the user's input
			
			unit.Convert();
			//Activates the Convert subclass in the class Unit 
			
		}
		in.close();
		//Closes the input stream
		
		System.out.println("You have exited the program.");
		//End of program message to confirm that the users has exited the program
		
	}

}
