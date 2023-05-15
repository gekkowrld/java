import java.util.Scanner;

/**
 * We are going to be using the Heron's formula to do some calculations
 * The herons formula is written as:
 * Area = sqrt(s*(s - a) * (s - b) * (s - c))
 * Where s = (a + b + c) / 2
 * and a, b and c are the sides
*/

public class HeronsFormula
{
	public static void main(String[] args){
		// Initialize the scanner method
		Scanner scanner = new Scanner(System.in);

		// Create the variables that will hold the sides
		double side_1, side_2, side_3, side_t, area;

		System.out.print("Enter the first side of the triangle: ");
		side_1 = scanner.nextDouble();
		System.out.print("Enter the second side: ");
		side_2 = scanner.nextDouble();
		System.out.print("Enter the last side: ");
		side_3 = scanner.nextDouble();
		
		// Calculate the value of s in the Heron's formula
		side_t = (side_1 + side_2 + side_3)/2;

		// Calculate the are of the triangle
		area = Math.sqrt(side_t * (side_t - side_1 ) * (side_t - side_2) * (side_t - side_3));

		System.out.println("The area of the triangle with sides " + side_1 + " " + side_2 + " and " + side_3 + " is " + area);

		scanner.close();
	}
}


