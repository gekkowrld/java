// Java program to illustrate how to delete, instantiate, initialize
// and traverse the Java array

/**
 * This is a 1d array
 * It is manually initialized one by one
 * It begins with 0 because counting begins at zero in most programming language
 */
class TestArray{
	public static void main(String args[]){
		int a[] = new int[5]; // declare and instantiation
		a[0] = 10; // Initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		// traverse array

		/**
		 * Traverse is a fancy way of saying go through this array and look at each value and return the value
		 * We are using a for loop to print out the values of a
		 * We can use a while loop to accomplish the same but we'll do it later on when looking at control structures
		 */

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
