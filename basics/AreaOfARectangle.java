import java.util.Scanner;

/**
 * We are going to implement the Area of a Rectangle formula
 * This is simple lenght * width
*/

public class AreaOfARectangle{
	public static void main(String[] args){
		//Initialize the scanner
		Scanner scanner = new Scanner(System.in);

		// Declare the variables
		double lenght, width, area;

		System.out.print("Enter the lenght of the rectangle: ");
		lenght = scanner.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		width = scanner.nextDouble();

		// Calculate the area of the rectangle
		area = lenght * width;

		System.out.println("The area of the rectangle with sides " + lenght + " and " + width + " is equals to " + area);

		scanner.close();
	}
}
