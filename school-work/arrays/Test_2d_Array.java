// Java Program to illustrate the use of multidimensional array
class Test_2d_Array{
	public static void main(String args[]){
		// declare and initialising 2D array
		int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
		// printing 2d array
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
