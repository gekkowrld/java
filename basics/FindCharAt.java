/**
 * We'll be finding out the character that is at a given position
 */

 import java.util.Scanner;

 public class FindCharAt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String str;
		int at;

		System.out.println("Enter the string that you want to find the position at a point");
		str = input.nextLine();

		System.out.print("Enter the position that you'll want to find it at: ");
		at = input.nextInt();


		/**
		 * To make the results more "natural" we subtract one from the value that the user gives
		 * We do this by using prefix -- like --at
		 * If we use postfix at-- we will not get the desired output.
		 * This is because we need to run the program at least once so that we can get subtract one
		 * You can use at = at - 1 to achieve the same results.
		 */

		System.out.println("The character at position " + at + " of string " + "\"" +str + "\"" +" is " +  str.charAt(--at));

		input.close();
	}
 }
