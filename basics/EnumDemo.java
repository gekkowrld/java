/**
 * We'll be using enums to declare our own custom data types
 *
 * Technically enums are considered classes and you can even declare them in a different file
 *
 * You decide which "data values" are to be stored in there and you can call them any time
 *
 * This is neat if you have constant values that you would like it declare
 *
 */

 class EnumDemo{
	// Define two enum types for use in the program

	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

	public static void main(String [] args){
		Day tgif; // Declare a variable of type Day
		Month libra; // Declare a variable of type Month

		tgif = Day.FRIDAY; // Assign a value of type Day to tgif
		libra = Month.OCT; // Assign a value of type month to libra

		System.out.print("My sign is libra, since I was born in ");
		System.out.println(libra);
		System.out.print("That's the ");
		System.out.print(libra.ordinal());
		System.out.println("-th mont of the year.");
		System.out.println(" (Counting form 0, of course!)");

		System.out.print("Isn't it nice to get to ");
		System.out.println(tgif);

		System.out.println( tgif + " is the " + tgif.ordinal()
											+ " -th of the week.");


	}
 }
