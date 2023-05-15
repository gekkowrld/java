import java.util.Scanner;

/**
 * We are going to make a program that
 * calculates the Quadratic equation
 * The formula is 
 * x = (-b +/- sqrt(b**2 - 4ac))/2a
 * of the form ax**2+bx+c
*/

public class QuadraticFormula{
	public static void main(String[] args){
		// Declare the variables and the scanner

		Scanner scanner = new Scanner(System.in);
		double a, b, c, x_1, x_2;


		// Get the values

		System.out.print("Enter the first number (a) [It is not zero, if not sure enter 1]: ");
		a = scanner.nextDouble();
		System.out.print("Enter the second number (b): ");
		b = scanner.nextDouble();
		System.out.print("Enter the third number (c): ");
		c = scanner.nextDouble();

		// Calculate the values. I use two methods because I'm not sure. I'll test further to see

		x_2 = ((-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/ (2 * a));
		x_1 = ( (-1 * b) + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));

		// Print out the values

		System.out.println("The value of x is either " + x_1 + " or " + x_2);

		scanner.close();

	}
}
