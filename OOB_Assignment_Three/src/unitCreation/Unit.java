package unitCreation;

public class Unit {

	private int unitType;
	private double scalar;
	private double result;
	
	public Unit(int unitType, double scalar) {
		this.unitType = unitType;
		this.scalar = scalar;
		result = 0;
	}
	//Constructs an object with a unitType and a scalar value. Result is set to 0
	
	public void Convert() {
		if(unitType == 1) {
			result = scalar * 1.609344;
			System.out.println(scalar + " Mile(s) is equal to " + result + " Kilometer(s)\n");
		}
		if(unitType == 2) {
			result = scalar * 0.62137119;
			System.out.println(scalar + " Kilometer(s) is equal to " + result + " Mile(s)\n");
		}
		if(unitType == 3) {
			result = scalar * 0.45359237;
			System.out.println(scalar + " Pound(s) is equal to " + result + " Kilogram(s)\n");
		}
		if(unitType == 4) {
			result = scalar * 2.20462262;
			System.out.println(scalar + " Kilogram(s) is equal to " + result + " Pound(s)\n");
		}
		if(unitType == 5) {
			result = scalar * 2.54;
			System.out.println(scalar + " Inch(es) is equal to " + result + " Centimeter(s)\n");
		}
		if(unitType == 6) {
			result = scalar * 0.39370079;
			System.out.println(scalar + " Centimeter(s) is equal to " + result + " Inch(es)\n");
		}
		if(unitType == 7) {
			result = scalar * 29.5735296;
			System.out.println(scalar + " Ounce(s) is equal to " + result + " Millileter(s)\n");
		}
		if(unitType == 8) {
			result = scalar * 0.03381402;
			System.out.println(scalar + " Millileter(s) is equal to " + result + " Ounce(s)\n");
		}
	}
	//Determines which calculation to do based on the user input, converts the scalar input, and prints it
	
}
