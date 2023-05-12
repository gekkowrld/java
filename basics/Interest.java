public class Interest {
	public static void main (String[] args){
		/* Declare the variables */

		double principal; // The value of investment
		double rate; // The annual interest rate
		double interest; // Interest earned in one year

		/* Do the computations */

		principal = 17988;
		rate = 0.027;
		interest = principal * rate; // Compute the interest

		principal = principal + interest;
		// Computes the value of the new principal
		// This new principal replaces the old one

		/* Output the result */

		System.out.print("The interest is ksh ");
		System.out.println(interest);
		System.out.print("The principal is ksh ");
		System.out.println(principal);
	} // end of main()
} // End of the class Interest