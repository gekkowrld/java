import java.util.Scanner;

/**
 * We are going to implement the area of a circle
 * The area is calculated with the formula
 * PI*radius*radius
*/

public class AreaOfACircle{
	public static void main(String[] args){
		// Initialize the Scanner and declare the variables
		Scanner scanner = new Scanner(System.in);
		double radius, area;

		// Get the values
		System.out.print("Enter the radius of the circle: ");
		radius = scanner.nextDouble();

		// Calculate the area
		area = Math.PI * Math.pow(radius, 2);

		// Display the answer
		System.out.println("The area of a circle with the radius of " + radius + " is " + area);

		scanner.close();
	}
}
