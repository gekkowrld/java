/**
 * We're going to be using two objects named circle and sphere
 * This will be used to calculate the circumference and volume respectively
 *
 */

 import java.util.Scanner;
import static java.lang.System.out;

 class ObjectShape{
	public void circle(double circle_radius){
		double circumference = 2 * Math.PI * circle_radius;
		out.println("The circle of radius " + circle_radius + " has a circumference of " + circumference);
	}
	public void sphere(double sphere_radius){
		double volume = (4/3) * Math.pow(sphere_radius, 3);
		out.println("The sphere of radius " + sphere_radius + " has a volume of " + volume);
	}

	public static void main(String [] args){
		ObjectShape myObject = new ObjectShape();

		Scanner input = new Scanner(System.in);

		out.print("Enter the radius of the circle: ");
		double circle_radius = input.nextDouble();
		out.print("Enter the radius of the sphere: ");
		double sphere_radius = input.nextDouble();

		myObject.circle(circle_radius);
		myObject.sphere(sphere_radius);

		input.close();
	}
 }
