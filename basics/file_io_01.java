/**
 * Everything is a file (Linux or Unix philosophy)
 * We'll be dealing with files in almost all the files named file_io_*.java
 *
 * All the aspects about opening, creating, and deleting files wil be covered
 */

 /**
  * Let's begin with creating a file
*/

import java.io.File; // For creating the files
import java.io.IOException; // For handling the errors/exceptions

class CreateFile{
	public static void main(String [] args){
		try{
			File myFile = new File("mynewfile.txt");

			if (myFile.createNewFile()){
				/**
				 * myFile.getName() is used to retrieve the file name created
				 * myFile.getAbsolutePath() is used to retrieve the absolute path i.e
				 * the full path.
				 *
				 * If on windows this will start in the drive e.g "C:\\Users\\..."
				 * On linux it will be "/home/user/..."
				 */
				System.out.println(myFile.getName() + "Created successfully at " + myFile.getAbsolutePath());
			}else{
				System.out.println("Failed");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
  }
