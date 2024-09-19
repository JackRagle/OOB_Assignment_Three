package converter;

import java.util.Scanner;
import unitCreation.Unit;

public class UnitConverter {

	public static void main(String[] args) {
		
		int x = 0;
		// Keeps track of which conversion type is asked for
		
		double scalar = 0;
		//How many of the unit will be converted
		
		Scanner scrn = new Scanner(System.in);
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
			x = scrn.nextInt();
			if(x > 9 || x < 1) {
				System.out.println("\nYou have entered an invalid number\n");
				continue;
			}
			if(x == 9) {
				break;
			}
			System.out.println("\nEnter how many of the unit you would like to convert: ");
			scalar = scrn.nextDouble();
			if(scalar < 0) {
				scalar = scalar * -1;
			}
			Unit unit = new Unit(x, scalar);
			unit.Convert();
		}
		scrn.close();
		System.out.println("You have exited the program.");
	}

}
