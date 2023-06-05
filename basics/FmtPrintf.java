/**
 * When printing out text we may want to format how the output looks like
 * That's where `printf` comes in
 * We use it as it is used in other programming languages e.g C
 */

class Fmt{
	public static void main(String [] args){
		// We define the values that we'll use
		String str = "This is a string";
		int my_num = 123128188;
		double my_double = 1872.121;
		double my_exponent = 123e3;

		/**
		 * There are basically three parts to the format specifier
		 * e.g %7.4f
		 * The first '%' is a format specifier and tells java that we are going to format the string
		 * '7' tells java that the numbers before the '.' should be padded to 7 characters
		 * if they are less but don't force it if it is more than 7
		 * '4' tells java to round off the number to 4 decimal places, incase the decimals are less
		 * ending zeros(0) will be added
		 * 'f' tells java that this is a float value.
		 *
		 *
		 * The values should be adopted to specific needs, they are not constants except
		 * '%' and 'f' in this case all the others are optional
		 *
		 * Incase you want to add ',' like in 10,000,000 then you can use a ',' before any
		 * formatting e.g '%,3d'
		 *
		 * And you can align text to left by using '-' before the format specifier
		 * e.g '%-s'
		 */

		 System.out.printf("%s\n", str); // Print text normally
		 System.out.printf("%25s\n", str); // Add a padding of 25 (text included)
		 System.out.printf("%-40s\n", str); // Add a padding of 40 (text included) and left align

		 System.out.printf("%d\n", my_num); // Print it normally
		 System.out.printf("%15d\n",my_num); // Add a padding of 15 (numbers included)
		 System.out.printf("%-15d\n", my_num); // Add a padding of 15 (numbers included) and left align
		 System.out.printf("%,d\n", my_num); // Print num with ',' included

		 System.out.printf("%f\n", my_double); // Print it normally
		 System.out.printf("%,4.2f\n", my_double); // Add a padding of 4 (numbers included), a ',' and round off to 2d.p

		System.out.printf("%e\n", my_exponent); // Print it normally
		System.out.printf("%15.2e\n", my_exponent); // Print out an exponent with a padding pf 15 (number included) and a decimal of 2
		System.out.printf("%g\n", my_exponent); // Same as `e` but resolve to value  if it is printable
	}
}
