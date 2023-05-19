// Java program to read and print elements in a 1d array

/**
 * We import utilities that will help us do other jobs.
 * It is like when we use `# include` in C
 * Here we need the Scanner object which we'll use to read user input
 */

import java.util.Scanner;

class Array_Single_Dim{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		// create a scanner instance for receives input
		// from the user - input keyboard

		System.out.println("Enter the Array length: ");
		int len = scan.nextInt();
		int arr[] = new int[len]; // declaration and creation 1 dm array
		System.out.println("Enter the array elements");
		for(int i = 0; i < len; i++)
			arr[i] = scan.nextInt();

		System.out.println("\narray elements are:");

		for(int i = 0; i < len; i++)
			System.out.println(arr[i]);

		scan.close(); // Make sure to close the scanner function
	}
}
