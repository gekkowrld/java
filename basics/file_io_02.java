/**
 * Now we'll write to a file
 */

 import java.io.FileWriter; // Used to write into a file
 import java.io.IOException; // Used to handle the errors

 class writeToFile{
	public static void main(String [] args){
		try{
			/**
			 * FileWriter is used to write into a file.
			 * There are other methods to do so, feel free to look online for them
			 *
			 * Use .write to write into a file
			 * Don't forget to close the buffer so as to avoid memory leaks
			 *
			 * Finally handle the exceptions if any arises
			 */
			FileWriter myWr = new FileWriter("mynewfile.txt");
			myWr.write("Files in Java are somehow \"hard\" but can are actually cool\n");
			myWr.close();
			System.out.println("Successfully wrote to file, you can check it manually");
		}catch(IOException e){
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}
 }
