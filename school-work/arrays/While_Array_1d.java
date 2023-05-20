// Java program to read and print elements a one dimensional array
import java.util.Scanner;

class While_Array_1d_Java{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		// Create a scanner instance for receiving input
		// from the user - input from keyboard

		System.out.print("Enter the array length: ");
		int len = scan.nextInt();
		int arr[] = new int[len]; // declaration and creation of 1 dim array
		System.out.println("Enter the array elements");
		int i = 0;
		while(i < len){
			arr[i] = scan.nextInt();
			i++;
		}

		System.out.println("\narray elements are:");
		i = 0;
		while(i < len){
			System.out.println(arr[i]);
			i++;
		} // display every array

		scan.close();

	}
}
