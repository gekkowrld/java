/**
 * We are going to be taking an input from the user and
 * telling them how long their string is
 * We will be using the built in strlen
 */

 import java.util.Scanner;

 public class MyStrlen{
	public static void main(String[] args){
		// We are going to be using inout instead of the conventional scanner
		Scanner input = new Scanner(System.in);

		// We declare the variables
		String str;

		// We prompt for the input

		System.out.println("Enter the string you want to know the length of");
		str = input.nextLine();

		// We print out the answer

		System.out.println("\"" + str  + "\"" + " is " + str.length() + " characters long");
	}
 }
