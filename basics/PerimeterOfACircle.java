import java.util.Scanner;

/**
 * We are going to create a program to 
 * calculate the perimeter of a circle
 * The formula is 2*PI*radius
*/

public class PerimeterOfACircle{
	public static void main(String[] args){
		// Declare the variables and initiliaze the scanner

		Scanner scanner = new Scanner(System.in);

		double radius, perimeter;

		// Get the values

		System.out.print("Enter the radius of the circle: ");
		radius = scanner.nextDouble();

		// Calculate the perimeter

		perimeter = 2 * radius * Math.PI;

		// Print out the values
		
		System.out.println("The perimeter of a circle of radius " + radius + " is " + perimeter);

		scanner.close();

	}
}
