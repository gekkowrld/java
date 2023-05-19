// Java program to illustrate how to delete, instantiate, initialize
// and traverse the Java array

/**
 * This one is similar to TestArray but in a compact way or "monolithic"
 * Declaration is done in one line instead of several lines like the last one
 */

 class MonolithicArray{
	public static void main(String args[]){
		int a[] = {33, 3, 4, 5}; // declaration, instantiation and initialization
		// printing array

		/**
		 * We can enclose it in a curly bracket or not. If it a one line, it is not mandatory
		 * but if it is more, then it is a must
		 */
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
 }
