/**
 * We'll be using substring method
 * It can take two arguments:
 * You must give it a starting point but no need for an ending
 * If you don't specify the end then the program assumes that it to read to string
 * For this program we'll be using both parameters but just one can do
 * Let's take that we have two arguments 'a' and 'b'.
 * The first argument 'a' is calculated by a + 1 while the second argument
 * 'b' is calculated with b - 1
 */

 import java.util.Scanner;

 public class UseSubstring{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String str;
		int pos1, pos2;

		System.out.println("Enter the string that you want to see a part of");
		str = input.nextLine();
		System.out.print("Enter the first position where you want to start seeing your text: ");
		pos1 = input.nextInt();
		System.out.print("Enter the last position where you want to see your text: ");
		pos2 = input.nextInt();

		/**
		 * For the sake of removing user confusion and making it more "natural"
		 * We'll be subtracting a one from the number that the user entered
		 * We do this because java and other programming languages starts counting at zero
		 */

		System.out.println("The string that we have extracted from position " + pos1 + " to " + pos2 + " of string \"" + str + "\" is " + str.substring(--pos1, pos2));

		input.close();
	}
 }
