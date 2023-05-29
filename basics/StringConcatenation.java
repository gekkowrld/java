/**
 * We have already used string concatenation
 * It is basically "+" added to either sides of the string
 * This can be useful when trying to make an "interactive" program
 *
 * We'll create a greeting program to demonstrate this
 */

import java.util.Scanner;

 class StringConcatenation{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("What is your name: ");
		String name = input.nextLine();
		System.out.println("Hello " + name + " hope you are doing okay today");
		input.close();
	}
 }
